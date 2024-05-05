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
    
    private final EntityDTOMapper entityDtoMapper;

	public ClientRequestController(ClientService clientService, UserService userService, AddressService addressService,
			ClientaddressService clientAddressService, EntityDTOMapper entityDtoMapper) {
		super();
		this.clientService = clientService;
		this.userService = userService;
		this.addressService = addressService;
		this.clientAddressService = clientAddressService;
		this.entityDtoMapper = entityDtoMapper;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Client> createClient(@RequestBody @Valid ClientRequest clientRequest) {
		try {
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
		clientAddress.setAddressid(savedAddress.getAddressid());
		clientAddress.setClientid(savedClient.getClientid());
		
		ClientAddress savedClientAddress = clientAddressService.create(clientAddress);
		
         log.debug("REST request to save Client : {}", client);
         return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
         
		}catch (Exception e) {
            log.error("Error occurred while creating client: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
		
		
    }

    
    
    
    
    

}
