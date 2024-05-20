package com.hoa.requestEntities;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.BankDetailDTO;
import com.hoa.dto.ClientDTO;
import com.hoa.dto.UserDTO;

public class ClientRequest {
	
	private UserDTO userDto;
	private ClientDTO clientDto;
	private AddressDTO addressDto;
	private BankDetailDTO bankDetailDto;
	private String contractCode;
	private String communityCode;
	private String boardMemberRole;
	
	
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
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getBoardMemberRole() {
		return boardMemberRole;
	}
	public void setBoardMemberRole(String boardMemberRole) {
		this.boardMemberRole = boardMemberRole;
	}
	public String getCommunityCode() {
		return communityCode;
	}
	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}
	public BankDetailDTO getBankDetailDto() {
		return bankDetailDto;
	}
	public void setBankDetailDto(BankDetailDTO bankDetailDto) {
		this.bankDetailDto = bankDetailDto;
	}
	
	
	

}
