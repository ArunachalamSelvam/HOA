package com.hoa.exception;

public class ContractNotFoundException extends Exception{

	private String message;
	
	public ContractNotFoundException(String message) {
		super(message);
	}
}
