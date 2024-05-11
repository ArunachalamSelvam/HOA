package com.hoa.service;

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
public class LoginResponseServiceImpl implements LoginResponseService{
	
    private final UserRepository userRepository;
    
    private final ClientRepository clientRepository;
    
    private final EmployeeRepository employeeRepository;
    
    

	public LoginResponseServiceImpl(UserRepository userRepository, ClientRepository clientRepository, EmployeeRepository employeeRepository) {
		super();
		this.userRepository = userRepository;
		this.clientRepository = clientRepository;
		this.employeeRepository = employeeRepository;
	}
    
    @Override
	public LoginResponse login(String emailId, String password) {
		User user = userRepository.findUserByEmailId(emailId);
		
		if(user!=null && user.getPassword().equals(password)) {
			
			Client client = clientRepository.findClientByUserId(user.getUserid()); 
			Employee employee = employeeRepository.findEmployeeByUserId(user.getUserid());
			System.out.println("User : " + user);
			
			System.out.println("Client : " + client);
			System.out.println("Employee : " + employee);
			LoginResponse response = new LoginResponse();
			response.setUserId(user.getUserid());
			if(client!=null) {
				response.setClientId(client.getClientid());
				response.setCommunityId(client.getCommunityid());
			}
			if(employee!=null) {
				response.setEmployeeId(employee.getEmployeeid());
			}
			response.setEmailId(emailId);
			response.setRoleId(user.getRoleid());
			
			return response;
		}else {
			System.out.println("User Not Found ..");
			return null;
		}
		
	}

}
