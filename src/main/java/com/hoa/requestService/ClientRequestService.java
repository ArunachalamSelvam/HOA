package com.hoa.requestService;

import java.security.SecureRandom;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.BankDetailDTO;
import com.hoa.dto.ClientDTO;
import com.hoa.dto.UserDTO;
import com.hoa.entities.Address;
import com.hoa.entities.BankDetail;
import com.hoa.entities.Client;
import com.hoa.entities.ClientAddress;
import com.hoa.entities.Community;
import com.hoa.entities.Contract;
import com.hoa.entities.User;
import com.hoa.enums.ContractActiveStatus;
import com.hoa.exception.ClientIdNotFoundException;
import com.hoa.exception.UserRoleAlreadyExistsInCommunityException;
import com.hoa.exception.UserRoleNotFoundException;
import com.hoa.repositories.AddressRepository;
import com.hoa.repositories.ClientRepository;
import com.hoa.repositories.ClientaddressRepository;
import com.hoa.repositories.ContractRepository;
import com.hoa.repositories.UserRepository;
import com.hoa.requestEntities.ClientRequest;
import com.hoa.responseEntities.ResponseFromContractCode;
import com.hoa.service.AddressService;
import com.hoa.service.BankdetailService;
import com.hoa.service.ClientService;
import com.hoa.service.ClientaddressService;
import com.hoa.service.CommunityService;
import com.hoa.service.ContractService;
import com.hoa.service.UserService;
import com.hoa.utils.EntityDTOMapper;

@Service
public class ClientRequestService {

	private final ContractRepository contractRepository;
	private final ClientRepository clientRepository;
	private final ClientaddressRepository clientAddressRepository;
	private final AddressRepository addressRepository;
	private final UserRepository userRepository;
	private final ClientService clientService;
	private final UserService userService;
	private final AddressService addressService;
	private final ClientaddressService clientAddressService;
	private final ContractService contractService;
	private final CommunityService communityService;
	private final BankdetailService bankdetailService;
	private final EntityDTOMapper entityDtoMapper;
    private final JavaMailSender emailSender;

	public ClientRequestService(ContractRepository contractRepository, ClientRepository clientRepository,
			ClientaddressRepository clientAddressRepository, AddressRepository addressRepository,
			UserRepository userRepository, ClientService clientService, UserService userService,
			AddressService addressService, ClientaddressService clientAddressService, ContractService contractService,
			CommunityService communityService, BankdetailService bankdetailService, EntityDTOMapper entityDtoMapper,JavaMailSender emailSender) {
		this.contractRepository = contractRepository;
		this.clientRepository = clientRepository;
		this.clientAddressRepository = clientAddressRepository;
		this.addressRepository = addressRepository;
		this.userRepository = userRepository;
		this.clientService = clientService;
		this.userService = userService;
		this.addressService = addressService;
		this.clientAddressService = clientAddressService;
		this.contractService = contractService;
		this.communityService = communityService;
		this.bankdetailService = bankdetailService;
		this.entityDtoMapper = entityDtoMapper;
        this.emailSender = emailSender;
	}

	public ResponseFromContractCode contractCodeResponse(String contractCode) {
		Contract contract = contractRepository.getContractByContractCode(contractCode);
		Integer clientId = contract.getClientid();
		Client client = clientRepository.getById(clientId);
		Integer userId = client.getUserid();
		Integer communityId = client.getCommunityid();
		ClientAddress clientAddress = clientAddressRepository.findByClientClientId(clientId);
		Integer clientAddressId = clientAddress.getClientaddressid();
		Integer addressId = clientAddress.getAddressid();
		int contractId = contract.getContractid();

		ResponseFromContractCode response = new ResponseFromContractCode();
		response.setAddressId(addressId);
		response.setClientAddressId(clientAddressId);
		response.setClientId(clientId);
		response.setCommunityId(communityId);
		response.setUserId(userId);
		response.setContractId(contractId);

		return response;
	}

	@Transactional(rollbackFor = Exception.class)
	public Client createClient(ClientRequest clientRequest) throws Exception {
		String contractCode = clientRequest.getContractCode();
		String communityCode = clientRequest.getCommunityCode();
		if (contractCode != null && contractService.existsByContractCode(contractCode)) {
			UserDTO userDto = clientRequest.getUserDto();
			String password = generateRandomPassword();
			userDto.setPassword(password);
			User user = entityDtoMapper.toEntity(userDto);
			User savedUser = userService.create(user);

			Integer contractId = contractService.getContractIdByContractCode(contractCode);
			Integer communityId = communityService.findCommunityIdByContractId(contractId);

			Community community = communityService.getOne(communityId);

			ClientDTO clientDto = clientRequest.getClientDto();
			clientDto.setUserid(savedUser.getUserId());
			clientDto.setDisplayname(
					savedUser.getFirstName() + " " + savedUser.getMiddleName() + " " + savedUser.getLastName());
			clientDto.setCommunityid(communityId);
			Client client = entityDtoMapper.toEntity(clientDto);
			Client savedClient = clientService.create(client);

			AddressDTO addressDTO = clientRequest.getAddressDto();
			Address address = entityDtoMapper.toEntity(addressDTO);
			Address savedAddress = addressService.create(address);

			ClientAddress clientAddress = new ClientAddress();
			clientAddress.setAddressid(savedAddress.getAddressId());
			clientAddress.setClientid(savedClient.getClientid());
			ClientAddress savedClientAddress = clientAddressService.create(clientAddress);

			updateCommunityBoardMemberRole(clientRequest.getBoardMemberRole(), community, savedUser);

			communityService.update(communityId, community);
			
            sendWelcomeEmail(savedUser.getEmailId(), savedUser.getFirstName());


			return savedClient;
		} else if (communityCode != null && communityService.existsByCommunityCode(communityCode)) {
			Community community = communityService.getOneByCommunityCode(communityCode);

			UserDTO userDto = clientRequest.getUserDto();
			String password = generateRandomPassword();
			userDto.setPassword(password);
			User user = entityDtoMapper.toEntity(userDto);
			User savedUser = userService.create(user);


			ClientDTO clientDto = clientRequest.getClientDto();
			clientDto.setUserid(savedUser.getUserId());
			clientDto.setCommunityid(community.getCommunityId());
			clientDto.setDisplayname(
					savedUser.getFirstName() + " " + savedUser.getMiddleName() + " " + savedUser.getLastName());
			Client client = entityDtoMapper.toEntity(clientDto);
			Client savedClient = clientService.create(client);

			AddressDTO addressDTO = clientRequest.getAddressDto();
			Address address = entityDtoMapper.toEntity(addressDTO);
			Address savedAddress = addressService.create(address);

			ClientAddress clientAddress = new ClientAddress();
			clientAddress.setAddressid(savedAddress.getAddressId());
			clientAddress.setClientid(savedClient.getClientid());
			ClientAddress savedClientAddress = clientAddressService.create(clientAddress);
			
            sendWelcomeEmail(savedUser.getEmailId(), savedUser.getFirstName());

			return savedClient;
		} else {
			throw new Exception("Invalid contract code or community code");
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
    public Client updateClient(Integer clientId, ClientRequest clientRequest) throws Exception {
        String contractCode = clientRequest.getContractCode();
        Client client = clientService.getOne(clientId);

        if (contractCode != null && contractService.existsByContractCode(contractCode) && client != null) {
            Integer userId = client.getUserid();
            
            UserDTO userDto = clientRequest.getUserDto();
			String password = generateRandomPassword();
			userDto.setPassword(password);
			User user = entityDtoMapper.toEntity(userDto);
            User savedUser = userService.update(userId, user);

            client.setDisplayname(savedUser.getFirstName());

            ClientAddress clientAddress = clientAddressService.getClientAddressByClientId(clientId);
            Integer addressId = clientAddress.getAddressid();
            AddressDTO addressDTO = clientRequest.getAddressDto();
            Address address = entityDtoMapper.toEntity(addressDTO);
            Address savedAddress = addressService.update(addressId, address);

            Integer contractId = contractService.getContractIdByContractCode(contractCode);
            Integer communityId = communityService.findCommunityIdByContractId(contractId);

            Community community = communityService.getOne(communityId);

            updateCommunityBoardMemberRole(clientRequest.getBoardMemberRole(), community, savedUser);
            communityService.update(communityId, community);

            sendUpdateNotificationEmail(savedUser.getEmailId(), savedUser.getFirstName());

            return clientService.updateClientCommunityId(client.getClientid(), communityId);
        } else {
            throw new Exception("Invalid contract code or client not found");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public Client updateFirstClient(ClientRequest clientRequest) throws Exception {
        String contractCode = clientRequest.getContractCode();

        if (contractCode != null && contractService.existsByContractCode(contractCode)) {
            ResponseFromContractCode response = contractCodeResponse(contractCode);
            Integer userId = response.getUserId();
            UserDTO userDto = clientRequest.getUserDto();
            
            String password = generateRandomPassword();
			userDto.setPassword(password);
            
            User user = entityDtoMapper.toEntity(userDto);
            User savedUser = userService.update(userId, user);

            Integer communityId = response.getCommunityId();
            Community community = communityService.getOne(communityId);
            
            Integer clientId = response.getClientId();
            Client client = clientService.getOne(clientId);
            client.setDisplayname(savedUser.getFirstName());
            client.setCommunityid(communityId);
            ClientAddress clientAddress = clientAddressService.getClientAddressByClientId(clientId);
            Integer addressId = clientAddress.getAddressid();
            AddressDTO addressDTO = clientRequest.getAddressDto();
            Address address = entityDtoMapper.toEntity(addressDTO);
            Address savedAddress = addressService.update(addressId, address);

         

            updateCommunityBoardMemberRole(clientRequest.getBoardMemberRole(), community, savedUser);
            communityService.update(communityId, community);

            BankDetailDTO bankDetailDto = clientRequest.getBankDetailDto();
            bankDetailDto.setCommunityid(communityId);
            bankDetailDto.setCreatedbyid(savedUser.getUserId());
            BankDetail bankDetail = entityDtoMapper.toEntity(bankDetailDto);
            BankDetail savedBankDetail = bankdetailService.create(bankDetail);

            sendUpdateNotificationEmail(savedUser.getEmailId(), savedUser.getFirstName());
            
            Client updatedClient = clientService.update(clientId, client);
            
            Integer contractId = response.getContractId();
            Contract contract = contractRepository.getById(contractId);
            
            String activeStatus = ContractActiveStatus.APPROVAL_PENDING.toString();
            
            System.out.println("\033[31m" + "Contract Before Update : " + contract + "\033[0m");
            contract.setActiveStatus(activeStatus);
            
            Contract updatedContract = contractService.update(contractId, contract);
            
            System.out.println("\033[31m" + "Contract After Update : " + updatedContract + "\033[0m");

//            return clientService.updateClientCommunityId(client.getClientid(), communityId);
            return updatedClient;
        } else {
            throw new Exception("Invalid contract code");
        }
    }


    private void updateCommunityBoardMemberRole(String role, Community community, User savedUser)
            throws  UserRoleNotFoundException, UserRoleAlreadyExistsInCommunityException {
        
        String emailId = savedUser.getEmailId();
        Integer userId = savedUser.getUserId();
        String invitedStatus = "invited";

        if (role.equalsIgnoreCase("president")) {
            if (community.getPresidentUserId() == null) {
                community.setPresidentEmailID(emailId);
                community.setPresidentUserId(userId);
                community.setPresidentInviteStatus(invitedStatus);
            } else {
                throw new UserRoleAlreadyExistsInCommunityException("The chosen role president is already added to the community.");
            }
        } else if (role.equalsIgnoreCase("treasurer")) {
            if (community.getTreasurerUserID() == null) {
                community.setTreasurerEmailID(emailId);
                community.setTreasurerUserID(userId);
                community.setTreasurerInviteStatus(invitedStatus);
            } else {
                throw new UserRoleAlreadyExistsInCommunityException("The chosen role treasurer is already added to the community.");
            }
        } else if (role.equalsIgnoreCase("secretary")) {
            if (community.getSecretaryUserID() == null) {
                community.setSecretaryEmailID(emailId);
                community.setSecretaryUserID(userId);
                community.setSecretaryInviteStatus(invitedStatus);
            } else {
                throw new UserRoleAlreadyExistsInCommunityException("The chosen role secretary is already added to the community.");
            }
        } else if (role.equalsIgnoreCase("admin")) {
            if (community.getAdminUserID() == null) {
                community.setAdminEmailID(emailId);
                community.setAdminUserID(userId);
                community.setAdminInviteStatus(invitedStatus);
            } else {
                throw new UserRoleAlreadyExistsInCommunityException("The chosen role admin is already added to the community.");
            }
        } else {
            throw new UserRoleNotFoundException("Invalid role: " + role);
        }
    }

	
	 private void sendWelcomeEmail(String to, String name) {
	        MimeMessage message = emailSender.createMimeMessage();
	        try {
	            MimeMessageHelper helper = new MimeMessageHelper(message, true);
	            helper.setTo(to);
	            helper.setSubject("Welcome to the Community!");
	            helper.setText("Dear " + name + ",\n\nWelcome to our community. We are excited to have you with us.\n\nBest regards,\nCommunity Team");

	            emailSender.send(message);
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            // Log error or handle accordingly
	        }
	    }

	    private void sendUpdateNotificationEmail(String to, String name) {
	        MimeMessage message = emailSender.createMimeMessage();
	        try {
	            MimeMessageHelper helper = new MimeMessageHelper(message, true);
	            helper.setTo(to);
	            helper.setSubject("Your Community Role Update");
	            helper.setText("Dear " + name + ",\n\nYour role in the community has been updated.\n\nBest regards,\nCommunity Team");

	            emailSender.send(message);
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            // Log error or handle accordingly
	        }
	    }
	    

	    private String generateRandomPassword() {
	        // Define characters to be used in the random password
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	        // Length of the password
	        int length = 10;

	        // Create a StringBuilder to store the generated password
	        StringBuilder password = new StringBuilder();

	        // Create a secure random number generator
	        SecureRandom random = new SecureRandom();

	        // Generate random characters until the password reaches the desired length
	        for (int i = 0; i < length; i++) {
	            // Generate a random index within the range of the characters string
	            int randomIndex = random.nextInt(characters.length());

	            // Append the character at the random index to the password
	            password.append(characters.charAt(randomIndex));
	        }

	        // Return the generated password
	        return password.toString();
	    }

}
