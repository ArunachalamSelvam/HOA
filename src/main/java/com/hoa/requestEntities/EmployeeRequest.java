package com.hoa.requestEntities;

import com.hoa.dto.EmployeeDTO;
import com.hoa.dto.UserDTO;

public class EmployeeRequest {
	
	private EmployeeDTO employeeDto;
	private UserDTO userDto;
	
	public EmployeeRequest() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO getEmployeeDto() {
		return employeeDto;
	}
	public void setEmployeeDto(EmployeeDTO employeeDto) {
		this.employeeDto = employeeDto;
	}
	public UserDTO getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	
	

}
