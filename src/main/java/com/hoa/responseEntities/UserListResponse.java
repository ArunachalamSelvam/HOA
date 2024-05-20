package com.hoa.responseEntities;

public class UserListResponse {
	
	private String firstName;
	private String emailId;
	private String mobileNumber;
	private Integer clientId;
	private String roleName;
	private String activeStatus;
	
	public UserListResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getClinetId() {
		return clientId;
	}

	public void setClientId(Integer clinetId) {
		this.clientId = clinetId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	

}
