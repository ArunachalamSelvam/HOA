package com.hoa.requestEntities;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.ClientDTO;
import com.hoa.dto.UserDTO;

public class ClientRequest {
	
	private UserDTO userDto;
	private ClientDTO clientDto;
	private AddressDTO addressDto;
	
	public ClientRequest() {
		// TODO Auto-generated constructor stub
	}
	public UserDTO getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	public ClientDTO getClientDto() {
		return clientDto;
	}
	public void setClientDto(ClientDTO clientDto) {
		this.clientDto = clientDto;
	}
	public AddressDTO getAddressDto() {
		return addressDto;
	}
	public void setAddressDto(AddressDTO addressDto) {
		this.addressDto = addressDto;
	}
	

}
