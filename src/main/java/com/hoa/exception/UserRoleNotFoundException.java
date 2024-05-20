package com.hoa.exception;

public class UserRoleNotFoundException extends Exception {
	
	private String message;
	
	public UserRoleNotFoundException(String message) {
		super(message);
		
	}

}
