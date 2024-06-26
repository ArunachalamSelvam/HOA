/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoa.repositories.AddressRepository;
import com.hoa.repositories.RoleRepository;
import com.hoa.repositories.UserRepository;
import com.hoa.requestEntities.UserUpdateRequest;
import com.hoa.responseEntities.ContractListResponse;
import com.hoa.responseEntities.UserListResponse;
import com.hoa.dto.AddressDTO;
import com.hoa.dto.UserDTO;
import com.hoa.entities.Address;
import com.hoa.entities.Role;
import com.hoa.entities.User;
import com.hoa.exception.AddressNotFoundException;
import com.hoa.exception.UserNotFoundException;
import com.hoa.jwt.JwtUserDetailsService;
import com.hoa.service.UserService;
import com.hoa.utils.EntityDTOMapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Service Implementation for managing {@link User}.
 * 
 * @author aek
 */
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	private final RoleRepository roleRepository;
	
	private final EmailService emailService;
	
	private final EntityDTOMapper entityDtoMapper;
	
	private final AddressRepository addressRepository;
	
	private final JwtUserDetailsService userDetailService;

	public UserServiceImpl(UserRepository repo, RoleRepository roleRepository, EmailService emailService,EntityDTOMapper entityDtoMapper, AddressRepository addressRepository, JwtUserDetailsService userDetailService) {
		this.repository = repo;
		this.roleRepository = roleRepository;
		this.emailService = emailService;
		this.addressRepository = addressRepository;
		this.entityDtoMapper = entityDtoMapper;
		this.userDetailService = userDetailService;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public User create(User user) {
		try {
			return userDetailService.save(user);

		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws UserNotFoundException
	 */
	@Override
	public User update(Integer id, User d) throws UserNotFoundException {
		try {
			d.setUserId(id);
			System.out.println("\033[31m" + "Existing User Id : " + d.getUserId() + "\033[0m");

			if (repository.existsById(id)) {
				return repository.saveAndFlush(d);
			} else {
				throw new UserNotFoundException("User Id with : " + id + " not found.");
			}
		} catch (UserNotFoundException ex) {
			throw ex; // Re-throw UserNotFoundException to be handled by the exception handler
		} catch (Exception ex) {
			ex.printStackTrace(); // or log the exception
			return null;
		}
	}
	
	
	@Override
	public UserUpdateRequest updateUserWithAddress(Integer userId, Integer addressId, UserUpdateRequest userUpdateRequest) throws UserNotFoundException, AddressNotFoundException {
	    UserDTO userDto = userUpdateRequest.getUserDto();
	    AddressDTO addressDto = userUpdateRequest.getAddressDto();

	    userDto.setUserId(userId);
	    User user = entityDtoMapper.toEntity(userDto);

	    addressDto.setAddressId(addressId);
	    Address address = entityDtoMapper.toEntity(addressDto);

	    System.out.println("\033[31m" + "Existing User Id : " + user.getUserId() + "\033[0m");

	    boolean userExists = repository.existsById(userId);
	    boolean addressExists = addressRepository.existsById(addressId);

	    if (!userExists && !addressExists) {
	        throw new UserNotFoundException("User Id with: " + userId + " not found.");
	    } else if (!addressExists) {
	        throw new AddressNotFoundException("Address Id with: " + addressId + " not found.");
	    } else if (!userExists) {
	        throw new UserNotFoundException("User Id with: " + userId + " not found.");
	    } 

	    // Save the user and address
	    repository.saveAndFlush(user);
	    addressRepository.saveAndFlush(address);

	    // Prepare the response
	    UserDTO updatedUserDto = entityDtoMapper.toDTO(user);
	    AddressDTO updatedAddressDto = entityDtoMapper.toDTO(address);
	    UserUpdateRequest response = new UserUpdateRequest();
	    response.setUserDto(updatedUserDto);
	    response.setAddressDto(updatedAddressDto);

	    return response;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @throws UserNotFoundException
	 */
	@Override
	public User getOne(Integer id) throws UserNotFoundException {
		try {
			return repository.findById(id).orElse(null);

		} catch (Exception ex) {
			throw new UserNotFoundException("User Id with : " + id + "not found.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<User> getAll() {
		try {
			return repository.findAll();

		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getTotal() {
		try {
			return repository.count();
		} catch (Exception ex) {
			return 0;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Page<User> findAllPaginate(Pageable pageable) {

		return repository.findAll(pageable);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Page<User> findAllSpecification(Specification<User> specs, Pageable pageable) {
		return repository.findAll(specs, pageable);
	}

	@Override
	@Transactional
	public User createUserWithRole(User user) {

		Role role = user.getRole();

		if (role == null) {
			throw new IllegalArgumentException("Role cannot be null");
		}

		// Save the role first if it doesn't exist
		if (role.getRoleid() == null) {
			role = roleRepository.save(role);
		}

		// Assign the role to the user
		user.setRole(role);

		return repository.save(user);
	}

//	@Override
//	public User login(String emailId, String password) {
//		User user = repository.findUserByEmailId(emailId);
//		if (user != null && user.getPassword().equals(password)) {
//			return user;
//		}
//		return null;
//	}

	@Override
	@Transactional
	public void setActiveStatus(Integer userId, boolean activeStatus) throws UserNotFoundException {
        User user = repository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

        boolean oldStatus = user.getActiveStatus();
        user.setActiveStatus(activeStatus);

        if (!oldStatus && activeStatus) {
            // Assuming user.getEmail(), user.getUserName(), and user.getPassword() are available methods
            try {
                emailService.sendUserCredentials(user.getEmailId(), user.getFirstName()+" "+user.getMiddleName()+" "+user.getLastName(), user.getPassword());
            } catch (MessagingException e) {
                e.printStackTrace();
                // Handle the exception appropriately
            }
        }
        repository.save(user);
    }

	@Override
	public List<UserListResponse> getUsersByCommunityId(Integer communityId) {
	    List<Map<String, Object>> userMaps = repository.userListByCommunityId(communityId);
	    return userMaps.stream()
	                   .map(this::mapToUserListResponse)
	                   .collect(Collectors.toList());
	}

	private UserListResponse mapToUserListResponse(Map<String, Object> row) {
	    UserListResponse userListResponse = new UserListResponse();
	    userListResponse.setAddressId((Integer) row.get("addressId"));
	    userListResponse.setUserId((Integer) row.get("userId"));
	    userListResponse.setFirstName((String) row.get("firstName"));
	    userListResponse.setEmailId((String) row.get("emailId"));
	    userListResponse.setMobileNumber((String) row.get("mobileNumber"));
	    userListResponse.setClientId((Integer) row.get("clientId"));
	    userListResponse.setRoleName((String) row.get("roleName"));
	    userListResponse.setActiveStatus(row.get("activeStatus") != null ? row.get("activeStatus").toString() : null);
	    return userListResponse;
	}

	
	
	

}
