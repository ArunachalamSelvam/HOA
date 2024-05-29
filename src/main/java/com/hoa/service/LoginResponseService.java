package com.hoa.service;

import com.hoa.exception.UserNotFoundException;
import com.hoa.responseEntities.LoginResponse;

public interface LoginResponseService {

	LoginResponse login(String emailId, String password) throws UserNotFoundException;

}
