package com.hoa.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoa.controller.UserController;
import com.hoa.entities.Client;
import com.hoa.entities.Employee;
import com.hoa.entities.User;
import com.hoa.exception.UserNotFoundException;
import com.hoa.repositories.ClientRepository;
import com.hoa.repositories.EmployeeRepository;
import com.hoa.repositories.UserRepository;
import com.hoa.responseEntities.LoginResponse;

@Service
@Transactional
public class LoginResponseServiceImpl implements LoginResponseService {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	private final UserRepository userRepository;

	public LoginResponseServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public LoginResponse login(String emailId, String password) throws UserNotFoundException {
		List<User> users = userRepository.findUserByEmailId(emailId);
		for (User user : users) {
			System.out.println("Password : " + user.getPassword());
			
			 logger.info("Checking password for user: {}", user.getEmailId());
	            
	            if (   isValidUser(user, password) && (isAuthorizedUser(user)|| user.getActiveStatus())) {
	                Map<String, Object> results = userRepository.getUserResponseByEmailAndPassword(emailId, password);
	                return mapToUserResponse(results);
	            }
		}
		System.out.println("User Not Found ..");
        logger.warn("User not found or not authorized for email: {}", emailId);
		throw new UserNotFoundException("User Not found");

	}
	
	private boolean isValidUser(User user, String password) {
	    return user != null && user.getPassword() != null && user.getPassword().equals(password);
	}

	private boolean isAuthorizedUser(User user) {
		// Ensure user is valid and has a role that is not restricted
		System.out.println("Community & activeStatus check : " + 	userRepository.isValidUser(user.getEmailId(), user.getPassword()));
        return 
                user.getRoleId() != 1004 
                && user.getRoleId() != 1005 
                && user.getRoleId() != 1000
                		&& 	userRepository.isValidUser(user.getEmailId(), user.getPassword()) ;
	}

	private LoginResponse mapToUserResponse(Map<String, Object> result) {
		LoginResponse response = new LoginResponse();
		response.setUserId(((Integer) result.get("userId")));
		response.setEmailId((String) result.get("emailId"));
		response.setRoleId(result.get("roleId") != null ? ((Number) result.get("roleId")).intValue() : null);
		response.setClientId(result.get("clientId") != null ? ((Number) result.get("clientId")).intValue() : null);
		response.setCommunityId(
				result.get("communityId") != null ? ((Number) result.get("communityId")).intValue() : null);
		response.setEmployeeId(
				result.get("employeeId") != null ? ((Number) result.get("employeeId")).intValue() : null);
		response.setManagerId(result.get("managerId") != null ? ((Number) result.get("managerId")).intValue() : null);
		response.setCommunityActiveStatus(
				result.get("communityActiveStatus") != null && (Boolean) result.get("communityActiveStatus"));

		return response;
	}

}
