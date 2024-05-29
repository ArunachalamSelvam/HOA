package com.hoa.responseEntities;

public class EmployeeListResponse {

	private Integer employeeId;
	private String employeeNo;
	private Integer managerId;
	private Integer userId;
	private String firstName;
	private String emailId;
	private String mobileNumber;
	private Boolean activeStatus;
	private String designationName;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public Boolean getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	
	@Override
	public String toString() {
		return "EmployeeListResponse [employeeId=" + employeeId + ", employeeNo=" + employeeNo + ", managerId="
				+ managerId + ", userId=" + userId + ", firstName=" + firstName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", activeStatus=" + activeStatus + ", designationName="
				+ designationName + "]";
	}
	
	public EmployeeListResponse(Integer employeeId, String employeeNo, Integer managerId, Integer userId,
			String firstName, String emailId, String mobileNumber, Boolean activeStatus, String designationName) {
		super();
		this.employeeId = employeeId;
		this.employeeNo = employeeNo;
		this.managerId = managerId;
		this.userId = userId;
		this.firstName = firstName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.activeStatus = activeStatus;
		this.designationName = designationName;
	}
	
	public EmployeeListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}