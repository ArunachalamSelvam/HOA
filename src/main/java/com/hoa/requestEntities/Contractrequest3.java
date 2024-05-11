package com.hoa.requestEntities;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.ContractDTO;


public class Contractrequest3 {

	private ContractDTO contractDto;
	
	private ClientRequest clientRequest;
	
	private AddressDTO communityAddressDto;
	
	
	public Contractrequest3() {
		// TODO Auto-generated constructor stub
	}
	
	public ContractDTO getContractDto() {
		return contractDto;
	}
	public void setContractDto(ContractDTO contractDto) {
		this.contractDto = contractDto;
	}
	public ClientRequest getClientRequest() {
		return clientRequest;
	}
	public void setClientRequest(ClientRequest clientRequest) {
		this.clientRequest = clientRequest;
	}

	public AddressDTO getAddressDto() {
		return communityAddressDto;
	}

	public void setAddressDto(AddressDTO addressDto) {
		this.communityAddressDto = addressDto;
	}
	
	
}
