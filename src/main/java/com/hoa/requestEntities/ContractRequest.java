package com.hoa.requestEntities;

import com.hoa.dto.CommunityDTO;
import com.hoa.dto.ContractDTO;
import com.hoa.dto.UserDTO;

public class ContractRequest {
	
	private ContractDTO contractDto;
	private CommunityDTO communityDto;
	private UserDTO userDto;
	
	public ContractRequest() {
		// TODO Auto-generated constructor stub
	}
	public ContractDTO getContractDto() {
		return contractDto;
	}
	public void setContractDto(ContractDTO contractDto) {
		this.contractDto = contractDto;
	}
	public CommunityDTO getCommunityDto() {
		return communityDto;
	}
	public void setCommunityDto(CommunityDTO communityDto) {
		this.communityDto = communityDto;
	}
	public UserDTO getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	
	

}
