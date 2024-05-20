package com.hoa.exception;

public class UserRoleAlreadyExistsInCommunityException extends Exception {
	
	private String message;
	
	public UserRoleAlreadyExistsInCommunityException(String message) {
		super(message);
	}

}
