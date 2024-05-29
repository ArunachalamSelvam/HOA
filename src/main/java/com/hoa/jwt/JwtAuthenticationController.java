package com.hoa.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hoa.dto.UserDTO;
import com.hoa.entities.User;
import com.hoa.responseEntities.LoginResponse;
import com.hoa.service.LoginResponseService;
import com.hoa.service.LoginResponseServiceImpl;
import com.hoa.utils.EntityDTOMapper;




@RestController
@RequestMapping("/api/public")
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@Autowired
	private EntityDTOMapper entityDTOMapper;
	
	@Autowired
	private LoginResponseService loginResponseService;

	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		


		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
		
		
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		
		final String token = jwtTokenUtil.generateToken(userDetails);
		
		System.out.println("user name : " + userDetails.getUsername() +" "+"password : "+ userDetails.getPassword());
		
		LoginResponse response = loginResponseService.login(userDetails.getUsername(), userDetails.getPassword());
		
		response.setToken(token);

		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> saveUser(@RequestBody UserDTO userDto) throws Exception {
		User user = entityDTOMapper.toEntity(userDto);
		return ResponseEntity.ok(userDetailsService.save(user));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}