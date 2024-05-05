package com.hoa.advice;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hoa.exception.AddressNotFoundException;
import com.hoa.exception.ClientIdNotFoundException;
import com.hoa.exception.UserNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInvalidArgument(MethodArgumentNotValidException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		e.getBindingResult().getFieldErrors().forEach(error ->{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		
		return errorMap;
	}
	
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(ConstraintViolationException.class)
	    public Map<String, String> handleConstraintViolation(ConstraintViolationException e) {
	        Map<String, String> errorMap = new LinkedHashMap<>();
	        e.getConstraintViolations().forEach(violation -> {
	            errorMap.put(violation.getPropertyPath().toString(), violation.getMessage());
	        });
	        return errorMap;
	    }
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String,String> handleBuisnessException(UserNotFoundException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(AddressNotFoundException.class)
	public Map<String,String> handleBuisnessException(AddressNotFoundException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(ClientIdNotFoundException.class)
	public Map<String,String> handleBuisnessException(ClientIdNotFoundException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
}
