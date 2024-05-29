package com.hoa.responseEntities;

import java.util.Date;



public class ContractUpdateResponse {
	private Integer contractId;
    private Integer salesPersonId;
    private Integer clientId;
    private String contractCode;
    private String businessName;
    private Integer businessAddressId;
    private String communicationChannel;
    private Integer planId;
    private Double annualRenewalFee;
    private Double oneTimeSetUp;
    private Integer sizeOfTheCommunity;
    private String renewalCycles;
    private Boolean isTermsAccepted;
    private Integer createdById;
    private Date createdDate;
    private Integer modifiedById;
    private Date modifiedDate;
    private String salesPersonName;

    // Business Address
    private String businessAddress;
    private String businessAddressCity;
    private Integer businessAddressStateId;
    private Integer businessAddressCountryId;
    private Integer businessAddressZipCode;
    private Boolean businessAddressActiveStatus;

    // Client User
    private Integer userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobileNumber;
    private Boolean mobileIsVerified;
    private String emailId;
    private Boolean emailIdIsVerified;
    private Boolean isClient;
    private Integer otp;
    private Integer roleId;
    private String password;
    private Boolean userActiveStatus;
    private Date lastLogin;

    // Client
    private Integer communityId;
    private String displayName;
    private Integer numberOfHouses;
    private Boolean clientActiveStatus;

    // Client Address Aggregation
    private Integer clientAddressId;
    private String clientAddress;
    private String clientAddressCity;
    private Integer clientAddressStateId;
    private Integer clientAddressCountryId;
    private Integer clientAddressZipCode;
    private Boolean clientAddressActiveStatus;

    // Plan
    private Integer planRangeId;
    private Integer planPeriodId;
    private Integer planTypeId;
    private Double planPrice;
	public Integer getContractId() {
		return contractId;
	}
	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}
	public Integer getSalesPersonId() {
		return salesPersonId;
	}
	public void setSalesPersonId(Integer salesPersonId) {
		this.salesPersonId = salesPersonId;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
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
	public Integer getBusinessAddressId() {
		return businessAddressId;
	}
	public void setBusinessAddressId(Integer businessAddressId) {
		this.businessAddressId = businessAddressId;
	}
	public String getCommunicationChannel() {
		return communicationChannel;
	}
	public void setCommunicationChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public Double getAnnualRenewalFee() {
		return annualRenewalFee;
	}
	public void setAnnualRenewalFee(Double annualRenewalFee) {
		this.annualRenewalFee = annualRenewalFee;
	}
	public Double getOneTimeSetUp() {
		return oneTimeSetUp;
	}
	public void setOneTimeSetUp(Double oneTimeSetUp) {
		this.oneTimeSetUp = oneTimeSetUp;
	}
	public Integer getSizeOfTheCommunity() {
		return sizeOfTheCommunity;
	}
	public void setSizeOfTheCommunity(Integer sizeOfTheCommunity) {
		this.sizeOfTheCommunity = sizeOfTheCommunity;
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
	public Integer getCreatedById() {
		return createdById;
	}
	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date localDateTime) {
		this.createdDate = localDateTime;
	}
	public Integer getModifiedById() {
		return modifiedById;
	}
	public void setModifiedById(Integer modifiedById) {
		this.modifiedById = modifiedById;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getSalesPersonName() {
		return salesPersonName;
	}
	public void setSalesPersonName(String salesPersonName) {
		this.salesPersonName = salesPersonName;
	}
	public String getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	public String getBusinessAddressCity() {
		return businessAddressCity;
	}
	public void setBusinessAddressCity(String businessAddressCity) {
		this.businessAddressCity = businessAddressCity;
	}
	public Integer getBusinessAddressStateId() {
		return businessAddressStateId;
	}
	public void setBusinessAddressStateId(Integer businessAddressStateId) {
		this.businessAddressStateId = businessAddressStateId;
	}
	public Integer getBusinessAddressCountryId() {
		return businessAddressCountryId;
	}
	public void setBusinessAddressCountryId(Integer businessAddressCountryId) {
		this.businessAddressCountryId = businessAddressCountryId;
	}
	public Integer getBusinessAddressZipCode() {
		return businessAddressZipCode;
	}
	public void setBusinessAddressZipCode(Integer businessAddressZipCode) {
		this.businessAddressZipCode = businessAddressZipCode;
	}
	public Boolean getBusinessAddressActiveStatus() {
		return businessAddressActiveStatus;
	}
	public void setBusinessAddressActiveStatus(Boolean businessAddressActiveStatus) {
		this.businessAddressActiveStatus = businessAddressActiveStatus;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Boolean getMobileIsVerified() {
		return mobileIsVerified;
	}
	public void setMobileIsVerified(Boolean mobileIsVerified) {
		this.mobileIsVerified = mobileIsVerified;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Boolean getEmailIdIsVerified() {
		return emailIdIsVerified;
	}
	public void setEmailIdIsVerified(Boolean emailIdIsVerified) {
		this.emailIdIsVerified = emailIdIsVerified;
	}
	public Boolean getIsClient() {
		return isClient;
	}
	public void setIsClient(Boolean isClient) {
		this.isClient = isClient;
	}
	public Integer getOtp() {
		return otp;
	}
	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getUserActiveStatus() {
		return userActiveStatus;
	}
	public void setUserActiveStatus(Boolean userActiveStatus) {
		this.userActiveStatus = userActiveStatus;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Integer getCommunityId() {
		return communityId;
	}
	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Integer getNumberOfHouses() {
		return numberOfHouses;
	}
	public void setNumberOfHouses(Integer numberOfHouses) {
		this.numberOfHouses = numberOfHouses;
	}
	public Boolean getClientActiveStatus() {
		return clientActiveStatus;
	}
	public void setClientActiveStatus(Boolean clientActiveStatus) {
		this.clientActiveStatus = clientActiveStatus;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getClientAddressCity() {
		return clientAddressCity;
	}
	public void setClientAddressCity(String clientAddressCity) {
		this.clientAddressCity = clientAddressCity;
	}
	public Integer getClientAddressStateId() {
		return clientAddressStateId;
	}
	public void setClientAddressStateId(Integer clientAddressStateId) {
		this.clientAddressStateId = clientAddressStateId;
	}
	public Integer getClientAddressCountryId() {
		return clientAddressCountryId;
	}
	public void setClientAddressCountryId(Integer clientAddressCountryId) {
		this.clientAddressCountryId = clientAddressCountryId;
	}
	public Integer getClientAddressZipCode() {
		return clientAddressZipCode;
	}
	public void setClientAddressZipCode(Integer clientAddressZipCode) {
		this.clientAddressZipCode = clientAddressZipCode;
	}
	public Boolean getClientAddressActiveStatus() {
		return clientAddressActiveStatus;
	}
	public void setClientAddressActiveStatus(Boolean clientAddressActiveStatus) {
		this.clientAddressActiveStatus = clientAddressActiveStatus;
	}
	public Integer getPlanRange() {
		return planRangeId;
	}
	public void setPlanRangeId(Integer planRangeId) {
		this.planRangeId = planRangeId;
	}
	public Integer getPlanPeriodId() {
		return planPeriodId;
	}
	public void setPlanPeriodId(Integer planPeriodId) {
		this.planPeriodId = planPeriodId;
	}
	public Integer getPlanTypeId() {
		return planTypeId;
	}
	public void setPlanTypeId(Integer planTypeId) {
		this.planTypeId = planTypeId;
	}
	public Double getPlanPrice() {
		return planPrice;
	}
	public void setPlanPrice(Double planPrice) {
		this.planPrice = planPrice;
	}
	public Integer getClientAddressId() {
		return clientAddressId;
	}
	public void setClientAddressId(Integer clientAddressId) {
		this.clientAddressId = clientAddressId;
	}
    
    
	

}
