package com.hoa.responseEntities;

import java.util.Date;

public class ContractListResponse {
	private Integer contractId;
	private Integer clientId;
	private String contractCode;
	private String contractActiveStatus;
	private String businessName;
	private Double annualRenewalFee;
	private String renewalCycles;
	private Boolean isTermsAccepted;
	private Integer communityId;
	private Date createdDate;
	private String clientDisplayName;
	private Boolean clientActiveStatus;
	private String userFirstName;
	private String userLastName;
	private String emailId;
	private String mobileNumber;
	private String city;
	private Integer zipCode;
	private String country;
	private String salesPersonEmail;
	private String salesPersonMobileNumber;

	public ContractListResponse() {
		// TODO Auto-generated constructor stub
	}

	// Constructor
	public ContractListResponse(Integer contractId, Integer clientId, Integer communityId, String contractCode,
			String contractActiveStatus, String businessName, Double annualRenewalFee, String renewalCycles,
			Boolean isTermsAccepted, Date createdDate, String clientDisplayName, Boolean clientActiveStatus,
			String userFirstName, String userLastName, String emailId, String mobileNumber, String city,
			Integer zipCode, String country,String salesPersonEmail,String salesPersonMobileNumber) {
		this.contractId = contractId;
		this.clientId = clientId;
		this.communityId = communityId;
		this.contractCode = contractCode;
		this.contractActiveStatus = contractActiveStatus;
		this.businessName = businessName;
		this.annualRenewalFee = annualRenewalFee;
		this.renewalCycles = renewalCycles;
		this.isTermsAccepted = isTermsAccepted;
//        this.activeStatus = activeStatus;
		this.createdDate = createdDate;
		this.clientDisplayName = clientDisplayName;
		this.clientActiveStatus = clientActiveStatus;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
		this.salesPersonEmail = salesPersonEmail;
		this.salesPersonMobileNumber = salesPersonMobileNumber;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Double getAnnualRenewalFee() {
		return annualRenewalFee;
	}

	public void setAnnualRenewalFee(Double annualRenewalFee) {
		this.annualRenewalFee = annualRenewalFee;
	}

	public String getRenewalCycles() {
		return renewalCycles;
	}

	public void setRenewalCycles(String renewalCycles) {
		this.renewalCycles = renewalCycles;
	}

	public Boolean getIsTermsAccepted() {
		return isTermsAccepted;
	}

	public void setIsTermsAccepted(Boolean isTermsAccepted) {
		this.isTermsAccepted = isTermsAccepted;
	}

//	public String getActiveStatus() {
//		return activeStatus;
//	}
//
//	public void setActiveStatus(String activeStatus) {
//		this.activeStatus = activeStatus;
//	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getClientDisplayName() {
		return clientDisplayName;
	}

	public void setClientDisplayName(String clientDisplayName) {
		this.clientDisplayName = clientDisplayName;
	}

	public Boolean getClientActiveStatus() {
		return clientActiveStatus;
	}

	public void setClientActiveStatus(Boolean clientActiveStatus) {
		this.clientActiveStatus = clientActiveStatus;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getContractActiveStatus() {
		return contractActiveStatus;
	}

	public void setContractActiveStatus(String contractActiveStatus) {
		this.contractActiveStatus = contractActiveStatus;
	}

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public String getSalesPersonEmail() {
		return salesPersonEmail;
	}

	public void setSalesPersonEmail(String salesPersonEmail) {
		this.salesPersonEmail = salesPersonEmail;
	}

	public String getSalesPersonMobileNumber() {
		return salesPersonMobileNumber;
	}

	public void setSalesPersonMobileNumber(String salesPersonMobileNumber) {
		this.salesPersonMobileNumber = salesPersonMobileNumber;
	}

	// Getters and Setters (optional)

}
