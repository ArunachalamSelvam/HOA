package com.hoa.responseEntities;

public class CommunityListResponse {
	
	private Integer communityId;
	private Integer contractId;
	private String communityCode;
	private String contractCode;
	private String communityName;
	private Integer communitySize;
	private boolean activeStatus;
	
	public CommunityListResponse() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public Integer getCommunitySize() {
		return communitySize;
	}

	public void setCommunitySize(Integer communitySize) {
		this.communitySize = communitySize;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	

}
