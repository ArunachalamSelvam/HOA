package com.hoa.exception;

public class CommunityNotFoundException extends Exception {
	
	private String message;
	
	public CommunityNotFoundException(String message) {
		super(message);
	}

}
