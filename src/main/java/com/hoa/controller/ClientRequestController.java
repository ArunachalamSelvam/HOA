package com.hoa.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.BankDetailDTO;
import com.hoa.dto.ClientDTO;
import com.hoa.entities.Address;
import com.hoa.entities.BankDetail;
import com.hoa.entities.Client;
import com.hoa.entities.ClientAddress;
import com.hoa.entities.Community;
import com.hoa.entities.User;
import com.hoa.exception.ClientIdNotFoundException;
import com.hoa.requestEntities.ClientRequest;
import com.hoa.requestService.ClientRequestService;
import com.hoa.responseEntities.ResponseFromContractCode;
import com.hoa.service.AddressService;
import com.hoa.service.BankdetailService;
import com.hoa.service.ClientService;
import com.hoa.service.ClientaddressService;
import com.hoa.service.CommunityService;
import com.hoa.service.ContractService;
import com.hoa.service.UserService;
import com.hoa.utils.EntityDTOMapper;

@RestController
@RequestMapping("/api/public/clientRequest")
public class ClientRequestController {

	private final Logger log = LoggerFactory.getLogger(ClientController.class);

	private final ClientService clientService;

	private final UserService userService;

	private final AddressService addressService;

	private final ClientaddressService clientAddressService;
	
	private final ClientRequestService clientRequestService;

	private final ContractService contractService;

	private final CommunityService communityService;
	
	private final BankdetailService bankdetailService;

	private final EntityDTOMapper entityDtoMapper;

	public ClientRequestController(ClientService clientService, UserService userService, AddressService addressService,
			ClientaddressService clientAddressService, ContractService contractService,
			CommunityService communityService, EntityDTOMapper entityDtoMapper,ClientRequestService clientRequestService, BankdetailService bankdetailService) {
		super();
		this.clientService = clientService;
		this.userService = userService;
		this.addressService = addressService;
		this.clientAddressService = clientAddressService;
		this.contractService = contractService;
		this.communityService = communityService;
		this.entityDtoMapper = entityDtoMapper;
		this.clientRequestService = clientRequestService;
		this.bankdetailService = bankdetailService;
	}
	
	@GetMapping("/contractCode/{contractCode}")
    public ResponseFromContractCode getContractByContractCode(@PathVariable String contractCode) {
        return clientRequestService.contractCodeResponse(contractCode);
    }
	
	@PostMapping("/add")
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> createClient(@RequestBody @Valid ClientRequest clientRequest) {
        try {
            return new ResponseEntity<>(clientRequestService.createClient(clientRequest), HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error occurred while creating client: {}", e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{clientId}")
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> updateClient(@PathVariable(value = "clientId") Integer clientId, @RequestBody @Valid ClientRequest clientRequest) {
        try {
            return new ResponseEntity<>(clientRequestService.updateClient(clientId, clientRequest), HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error occurred while updating client: {}", e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update-For-First-Client")
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> updateFirstClient(@RequestBody @Valid ClientRequest clientRequest) {
        try {
            return new ResponseEntity<>(clientRequestService.updateFirstClient(clientRequest), HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error occurred while updating first client: {}", e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//	@PostMapping("/add")
//	@Transactional(rollbackFor = Exception.class) // Add this annotation to enable transaction management
//	public ResponseEntity<?> createClient(@RequestBody @Valid ClientRequest clientRequest) {
//		try {
//			String contractCode = clientRequest.getContractCode();
//			String communityCode = clientRequest.getCommunityCode();
//			if (contractCode != null && contractService.existsByContractCode(contractCode)) {
//				User user = entityDtoMapper.toEntity(clientRequest.getUserDto());
//				User savedUser = userService.create(user);
//
//				Integer contractId = contractService.getContractIdByContractCode(contractCode);
//				Integer communityId = communityService.findCommunityIdByContractId(contractId);
//
//				Community community = communityService.getOne(communityId);
//
//				ClientDTO clientDto = clientRequest.getClientDto();
//
//				clientDto.setUserid(savedUser.getUserId());
//				clientDto.setDisplayname(
//						savedUser.getFirstName() + " " + savedUser.getMiddleName() + " " + savedUser.getLastName());
//				clientDto.setCommunityid(communityId);
//				Client client = entityDtoMapper.toEntity(clientRequest.getClientDto());
//				Client savedClient = clientService.create(client);
//
//				AddressDTO addressDTO = clientRequest.getAddressDto();
//				Address address = entityDtoMapper.toEntity(addressDTO);
//				Address savedAddress = addressService.create(address);
//
//				ClientAddress clientAddress = new ClientAddress();
//				clientAddress.setAddressid(savedAddress.getAddressId());
//				clientAddress.setClientid(savedClient.getClientid());
//
//				ClientAddress savedClientAddress = clientAddressService.create(clientAddress);
//
//				String role = clientRequest.getBoardMemberRole();
//
//				if (role.equalsIgnoreCase("president") && community.getPresidentuserid() == null) {
//
//					community.setPresidentemailid(savedUser.getEmailId());
//					community.setPresidentuserid(savedUser.getUserId());
//					community.setPresidentinvitestatus("invited");
//
//				} else if (role.equals("treasurer") && community.getTreasureruserid() == null) {
//
//					community.setTreasureremailid(savedUser.getEmailId());
//					community.setTreasureruserid(savedUser.getUserId());
//					community.setTreasurerinvitestatus("invited");
//					
//
//				} else if (role.equalsIgnoreCase("secretery") && community.getSecretaryuserid() == null) {
//					community.setSecretaryemailid(savedUser.getEmailId());
//					community.setSecretaryuserid(savedUser.getUserId());
//					community.setSecretaryinvitestatus("invited");
//				} else {
//					throw new ClientIdNotFoundException(
//							"The Choosen role " + role + " already added to the community.");
//				}
//
//				communityService.update(communityId, community);
//
//				Client updatedClient = clientService.updateClientCommunityId(savedClient.getClientid(), communityId);
//
////		System.out.println("Client after update communityID : " + updatedClient);
//
//				log.debug("REST request to save Client : {}", savedClient);
//				return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
//			} else if (communityCode != null && communityService.existsByCommunityCode(communityCode)) {
//				Community community = communityService.getOneByCommunityCode(communityCode);
//
//				User user = entityDtoMapper.toEntity(clientRequest.getUserDto());
//				User savedUser = userService.create(user);
//
//				ClientDTO clientDto = clientRequest.getClientDto();
//
//				clientDto.setUserid(savedUser.getUserId());
//				clientDto.setCommunityid(community.getCommunityid());
//				clientDto.setDisplayname(
//						savedUser.getFirstName() + " " + savedUser.getMiddleName() + " " + savedUser.getLastName());
//				Client client = entityDtoMapper.toEntity(clientRequest.getClientDto());
//				Client savedClient = clientService.create(client);
//
//				AddressDTO addressDTO = clientRequest.getAddressDto();
//				Address address = entityDtoMapper.toEntity(addressDTO);
//				Address savedAddress = addressService.create(address);
//
//				ClientAddress clientAddress = new ClientAddress();
//				clientAddress.setAddressid(savedAddress.getAddressId());
//				clientAddress.setClientid(savedClient.getClientid());
//
//				ClientAddress savedClientAddress = clientAddressService.create(clientAddress);
//
//				log.debug("REST request to save Client : {}", client);
//				return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
//
//			}
//
//		} catch (Exception e) {
//			log.error("Error occurred while creating client: {}", e.getMessage());
//			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		return null;
//
//	}
//
//	@PutMapping("/update/{clientId}")
//	@Transactional(rollbackFor = Exception.class) // Add this annotation to enable transaction management
//	public ResponseEntity<?> updateClient(@PathVariable(value = "clientId") Integer clientId,
//			@RequestBody @Valid ClientRequest clientRequest) {
//		try {
//			String contractCode = clientRequest.getContractCode();
//			Client client = clientService.getOne(clientId);
//
//			if (contractCode != null && contractService.existsByContractCode(contractCode) && client != null) {
//				Integer userId = client.getUserid();
//				User user = entityDtoMapper.toEntity(clientRequest.getUserDto());
//				User savedUser = userService.update(userId, user);
//
//				// Display Name field in Client
//				client.setDisplayname(savedUser.getFirstName());
//
////				ClientDTO clientDto = clientRequest.getClientDto();
////
////				clientDto.setUserid(savedUser.getUserId());
////				Client updatedClient = entityDtoMapper.toEntity(clientRequest.getClientDto());
////				Client savedClient = clientService.update(clientId,updatedClient);
//
//				ClientAddress clientAddress = clientAddressService.getClientAddressByClientId(clientId);
//				Integer addressId = clientAddress.getAddressid();
//				AddressDTO addressDTO = clientRequest.getAddressDto();
//				Address address = entityDtoMapper.toEntity(addressDTO);
//				Address savedAddress = addressService.update(addressId, address);
//
////				ClientAddress updatedClientAddress = new ClientAddress();
////				updatedClientAddress.setClientaddressid(clientAddress.getClientaddressid());
////				updatedClientAddress.setAddressid(savedAddress.getAddressId());
////				updatedClientAddress.setClientid(client.getClientid());
//
////				ClientAddress savedClientAddress = clientAddressService.update(clientAddress.getClientaddressid(),updatedClientAddress);
//
//				Integer contractId = contractService.getContractIdByContractCode(contractCode);
//				Integer communityId = communityService.findCommunityIdByContractId(contractId);
//
//				Community community = communityService.getOne(communityId);
//
//				String role = clientRequest.getBoardMemberRole();
//
//				if (role.equalsIgnoreCase("president") && community.getPresidentuserid() == null) {
//
//					community.setPresidentemailid(savedUser.getEmailId());
//					community.setPresidentuserid(savedUser.getUserId());
//
//				} else if (role.equals("tresurer") && community.getTreasureruserid() == null) {
//
//					community.setTreasureremailid(savedUser.getEmailId());
//					community.setTreasureruserid(savedUser.getUserId());
//
//				} else if (role.equalsIgnoreCase("secretery") && community.getSecretaryuserid() == null) {
//					community.setSecretaryemailid(savedUser.getEmailId());
//					community.setSecretaryuserid(savedUser.getUserId());
//				} else {
//					throw new ClientIdNotFoundException(
//							"The Choosen role " + role + " already added to the community.");
//				}
//
//				communityService.update(communityId, community);
//
//				Client updatedClientCommunityId = clientService.updateClientCommunityId(client.getClientid(),
//						communityId);
//
////		System.out.println("Client after update communityID : " + updatedClient);
//
//				log.debug("REST request to save Client : {}", updatedClientCommunityId);
//				return new ResponseEntity<>(updatedClientCommunityId, HttpStatus.CREATED);
//			}
////			else {
////				String errorMessage = "Contract with code " + contractCode + " not found";
////				log.error(errorMessage);
////				return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
////			}
//		} catch (Exception e) {
//			log.error("Error occurred while creating client: {}", e.getMessage());
//			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		return null;
//
//	}
//
//	@PutMapping("/update")
//	@Transactional(rollbackFor = Exception.class) // Add this annotation to enable transaction management
//	public ResponseEntity<?> updateFirstClient(@RequestBody @Valid ClientRequest clientRequest) {
//		try {
//			String contractCode = clientRequest.getContractCode();
//			
//
//			if (contractCode != null && contractService.existsByContractCode(contractCode)) {
//				
//				ResponseFromContractCode response = clientRequestService.contractCodeResponse(contractCode);
//				Integer userId = response.getUserId();
//				User user = entityDtoMapper.toEntity(clientRequest.getUserDto());
//				User savedUser = userService.update(userId, user);
//				
//				Integer clientId = response.getClientId();
//				Client client = clientService.getOne(clientId);
//				// Display Name field in Client
//				client.setDisplayname(savedUser.getFirstName());
//
////				ClientDTO clientDto = clientRequest.getClientDto();
////
////				clientDto.setUserid(savedUser.getUserId());
////				Client updatedClient = entityDtoMapper.toEntity(clientRequest.getClientDto());
////				Client savedClient = clientService.update(clientId,updatedClient);
//
//				ClientAddress clientAddress = clientAddressService.getClientAddressByClientId(clientId);
//				Integer addressId = clientAddress.getAddressid();
//				AddressDTO addressDTO = clientRequest.getAddressDto();
//				Address address = entityDtoMapper.toEntity(addressDTO);
//				Address savedAddress = addressService.update(addressId, address);
//
////				ClientAddress updatedClientAddress = new ClientAddress();
////				updatedClientAddress.setClientaddressid(clientAddress.getClientaddressid());
////				updatedClientAddress.setAddressid(savedAddress.getAddressId());
////				updatedClientAddress.setClientid(client.getClientid());
//
////				ClientAddress savedClientAddress = clientAddressService.update(clientAddress.getClientaddressid(),updatedClientAddress);
////
////				Integer contractId = contractService.getContractIdByContractCode(contractCode);
////				Integer communityId = communityService.findCommunityIdByContractId(contractId);
//				
//				Integer communityId = response.getCommunityId();
//
//				Community community = communityService.getOne(communityId);
//
//				String role = clientRequest.getBoardMemberRole();
//
//				if (role.equalsIgnoreCase("president") && community.getPresidentuserid() == null) {
//
//					community.setPresidentemailid(savedUser.getEmailId());
//					community.setPresidentuserid(savedUser.getUserId());
//
//				} else if (role.equals("tresurer") && community.getTreasureruserid() == null) {
//
//					community.setTreasureremailid(savedUser.getEmailId());
//					community.setTreasureruserid(savedUser.getUserId());
//
//				} else if (role.equalsIgnoreCase("secretery") && community.getSecretaryuserid() == null) {
//					community.setSecretaryemailid(savedUser.getEmailId());
//					community.setSecretaryuserid(savedUser.getUserId());
//				} else {
//					throw new ClientIdNotFoundException(
//							"The Choosen role " + role + " already added to the community.");
//				}
//
//				communityService.update(communityId, community);
//
//				Client updatedClientCommunityId = clientService.updateClientCommunityId(client.getClientid(),
//						communityId);
//				
//				BankDetailDTO bankDetailDto = clientRequest.getBankDetailDto();
//				bankDetailDto.setCommunityid(communityId);
//				bankDetailDto.setCreatedbyid(savedUser.getUserId());
//				bankDetailDto.setModifiedbyid(null);
//				
//				BankDetail bankDetail = entityDtoMapper.toEntity(bankDetailDto);
//				
//				BankDetail savedBankDetail = bankdetailService.create(bankDetail);
//				
//				System.out.println("BankDetail After Save : " + savedBankDetail);
//
////		System.out.println("Client after update communityID : " + updatedClient);
//
//				log.debug("REST request to save Client : {}", updatedClientCommunityId);
//				return new ResponseEntity<>(updatedClientCommunityId, HttpStatus.CREATED);
//			}
////			else {
////				String errorMessage = "Contract with code " + contractCode + " not found";
////				log.error(errorMessage);
////				return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
////			}
//		} catch (Exception e) {
//			log.error("Error occurred while creating client: {}", e.getMessage());
//			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		return null;
//
//	}

}
