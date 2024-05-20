package com.hoa.exception;

public class ClientAddressNotFoundException extends Exception{
	
	private String message;
	
	public ClientAddressNotFoundException(String message) {
		super(message);
	}

}
