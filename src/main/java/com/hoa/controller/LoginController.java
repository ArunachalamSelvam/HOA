package com.hoa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoa.requestEntities.LoginRequest;
import com.hoa.responseEntities.LoginResponse;
import com.hoa.service.LoginResponseService;


@RestController
@RequestMapping("/api/login-api")
public class LoginController {
	private final Logger log = LoggerFactory.getLogger(UserController.class);


	private final LoginResponseService responseService;

	public LoginController(LoginResponseService responseService) {
	
		this.responseService = responseService;
	}




	@PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = responseService.login(loginRequest.getEmailId(), loginRequest.getPassword());
        if (response != null) {
        	 log.debug("REST request to Login Response : {}", response);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

}
