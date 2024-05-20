package com.hoa.exception;

public class RolePageNotFoundException extends Exception{
	
	private String message;
	
	public RolePageNotFoundException(String message) {
		super(message);
	}

}
