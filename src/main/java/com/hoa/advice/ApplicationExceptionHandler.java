package com.hoa.advice;

import java.nio.file.AccessDeniedException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.security.sasl.AuthenticationException;
import javax.validation.ConstraintViolationException;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.hoa.exception.AddressNotFoundException;
import com.hoa.exception.ClientIdNotFoundException;
import com.hoa.exception.CommunityNotFoundException;
import com.hoa.exception.ContractNotFoundException;
import com.hoa.exception.EmployeeNotFoundException;
import com.hoa.exception.RolePageNotFoundException;
import com.hoa.exception.UserNotFoundException;
import com.hoa.exception.UserRoleAlreadyExistsInCommunityException;
import com.hoa.exception.UserRoleNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleInvalidArgument(IllegalArgumentException e) {
        Map<String, String> errorMap = new LinkedHashMap<>();
        errorMap.put("error", e.getMessage());
        return ResponseEntity.badRequest().body(errorMap);
    }
	
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
	 
	 @ResponseStatus(HttpStatus.NOT_FOUND)
	 @ExceptionHandler(ConfigDataResourceNotFoundException.class)
	 public Map<String, String> handleResourceNotFoundException(ConfigDataResourceNotFoundException e) {
	     Map<String, String> errorMap = new LinkedHashMap<>();
	     errorMap.put("message", e.getMessage());
	     return errorMap;
	 }
	 
	 @ResponseStatus(HttpStatus.CONFLICT)
	 @ExceptionHandler(DataIntegrityViolationException.class)
	 public Map<String, String> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
	     Map<String, String> errorMap = new LinkedHashMap<>();
	     errorMap.put("message", "Data integrity violation: " + e.getMessage());
	     return errorMap;
	 }


	 @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	 @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	 public Map<String, String> handleMethodNotAllowedException(HttpRequestMethodNotSupportedException e) {
	     Map<String, String> errorMap = new LinkedHashMap<>();
	     errorMap.put("message", "Method not allowed: " + e.getMethod());
	     return errorMap;
	 }
	 
	 @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	 @ExceptionHandler(Exception.class)
	 public Map<String, String> handleInternalServerError(Exception e) {
	     Map<String, String> errorMap = new LinkedHashMap<>();
	     errorMap.put("message", "Internal server error: " + e.getMessage());
	     return errorMap;
	 }


	 @ResponseStatus(HttpStatus.UNAUTHORIZED)
	 @ExceptionHandler(AuthenticationException.class)
	 public Map<String, String> handleAuthenticationException(AuthenticationException e) {
	     Map<String, String> errorMap = new LinkedHashMap<>();
	     errorMap.put("message", "Authentication failed: " + e.getMessage());
	     return errorMap;
	 }
	 
	 @ResponseStatus(HttpStatus.FORBIDDEN)
	 @ExceptionHandler(AccessDeniedException.class)
	 public Map<String, String> handleAuthorizationException(AccessDeniedException e) {
	     Map<String, String> errorMap = new LinkedHashMap<>();
	     errorMap.put("message", "Authorization failed: " + e.getMessage());
	     return errorMap;
	 }
	 
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	 @ExceptionHandler(MethodArgumentTypeMismatchException.class)
	 public Map<String, String> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
	     Map<String, String> errorMap = new LinkedHashMap<>();
	     errorMap.put("message", "Method argument type mismatch: " + e.getName());
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
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(ContractNotFoundException.class)
	public Map<String,String> handleBuisnessException(ContractNotFoundException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(CommunityNotFoundException.class)
	public Map<String,String> handleBuisnessException(CommunityNotFoundException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(EmployeeNotFoundException.class)
	public Map<String,String> handleBuisnessException(EmployeeNotFoundException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserRoleNotFoundException.class)
	public Map<String,String> handleBuisnessException(UserRoleNotFoundException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserRoleAlreadyExistsInCommunityException.class)
	public Map<String,String> handleBuisnessException(UserRoleAlreadyExistsInCommunityException e){
		Map<String,String> errorMap = new LinkedHashMap<>();
		errorMap.put("Error Message", e.getMessage());
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({RolePageNotFoundException.class})
    public ResponseEntity<String> handleRolePageNotFoundException(RolePageNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
