package com.hoa.responseEntities;

public class ResponseFromContractCode {
	
	private Integer clientId;
	private Integer userId;
	private Integer clientAddressId;
	private Integer communityId;
	private Integer addressId;
	private int contractId;
	
	public ResponseFromContractCode() {
		// TODO Auto-generated constructor stub
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getClientAddressId() {
		return clientAddressId;
	}

	public void setClientAddressId(Integer clientAddressId) {
		this.clientAddressId = clientAddressId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public int getContractId() {
		return contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	
	

}
