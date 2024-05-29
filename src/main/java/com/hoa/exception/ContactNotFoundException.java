package com.hoa.exception;

public class ContactNotFoundException extends Exception {
	
	private String message;
	
	public ContactNotFoundException(String message) {
		super(message);
	}

}
