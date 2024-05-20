package com.hoa.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoa.entities.Client;
import com.hoa.entities.Employee;
import com.hoa.entities.User;
import com.hoa.repositories.ClientRepository;
import com.hoa.repositories.EmployeeRepository;
import com.hoa.repositories.UserRepository;
import com.hoa.responseEntities.LoginResponse;

@Service
@Transactional
public class LoginResponseServiceImpl implements LoginResponseService {

	private final UserRepository userRepository;

	public LoginResponseServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public LoginResponse login(String emailId, String password) {
		List<User> users = userRepository.findUserByEmailId(emailId);
		for (User user : users) {
			if (user != null && user.getPassword().equals(password)) {
				Map<String, Object> results = userRepository.getUserResponseByEmailAndPassword(emailId, password);
				return mapToUserResponse(results);

			}
		}
		System.out.println("User Not Found ..");
		return null;

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
		return response;
	}

}
