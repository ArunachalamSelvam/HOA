package com.hoa.requestEntities;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.UserDTO;

public class UserUpdateRequest {
	
	private UserDTO userDto;
	private AddressDTO addressDto;
	
	public UserUpdateRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	public AddressDTO getAddressDto() {
		return addressDto;
	}
	public void setAddressDto(AddressDTO addressDto) {
		this.addressDto = addressDto;
	}
	
	

}
