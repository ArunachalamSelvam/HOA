package com.hoa.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hoa.dto.UserDTO;
import com.hoa.entities.User;
import com.hoa.repositories.UserRepository;
import com.hoa.utils.EntityDTOMapper;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Autowired
	private EntityDTOMapper entityDtoMapper;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findUserByUserEmailId(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getEmailId(), user.getPassword(),
				new ArrayList<>());
	}
	
	public User save(User user) {
		
		
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
}