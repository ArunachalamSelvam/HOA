package com.hoa.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.ClientDTO;
import com.hoa.entities.Address;
import com.hoa.entities.Client;
import com.hoa.entities.ClientAddress;
import com.hoa.entities.User;
import com.hoa.requestEntities.ClientRequest;
import com.hoa.service.AddressService;
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

	private final ContractService contractService;

	private final CommunityService communityService;

	private final EntityDTOMapper entityDtoMapper;

	public ClientRequestController(ClientService clientService, UserService userService, AddressService addressService,
			ClientaddressService clientAddressService, ContractService contractService,
			CommunityService communityService, EntityDTOMapper entityDtoMapper, CommunityService communityService2) {
		super();
		this.clientService = clientService;
		this.userService = userService;
		this.addressService = addressService;
		this.clientAddressService = clientAddressService;
		this.contractService = contractService;
		this.communityService = communityService2;
		this.entityDtoMapper = entityDtoMapper;
	}

	@PostMapping("/add")
	public ResponseEntity<?> createClient(@RequestBody @Valid ClientRequest clientRequest) {
		try {
			String contractCode = clientRequest.getContractCode();
			if (contractService.existsByContractCode(contractCode)) {
				User user = entityDtoMapper.toEntity(clientRequest.getUserDto());
				User savedUser = userService.create(user);

				ClientDTO clientDto = clientRequest.getClientDto();

				clientDto.setUserid(savedUser.getUserid());
				Client client = entityDtoMapper.toEntity(clientRequest.getClientDto());
				Client savedClient = clientService.create(client);

				AddressDTO addressDTO = clientRequest.getAddressDto();
				Address address = entityDtoMapper.toEntity(addressDTO);
				Address savedAddress = addressService.create(address);

				ClientAddress clientAddress = new ClientAddress();
				clientAddress.setAddressid(savedAddress.getAddressId());
				clientAddress.setClientid(savedClient.getClientid());

				ClientAddress savedClientAddress = clientAddressService.create(clientAddress);

				Integer contractId = contractService.getContractIdByContractCode(contractCode);
				Integer communityId = communityService.findCommunityIdByContractId(contractId);

				Client updatedClient = clientService.updateClientCommunityId(savedClient.getClientid(), communityId);

//		System.out.println("Client after update communityID : " + updatedClient);

				log.debug("REST request to save Client : {}", client);
				return new ResponseEntity<>(updatedClient, HttpStatus.CREATED);
			} else {
				String errorMessage = "Contract with code " + contractCode + " not found";
				log.error(errorMessage);
				return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			log.error("Error occurred while creating client: {}", e.getMessage());
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
