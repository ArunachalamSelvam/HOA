package com.hoa.dto;

import java.util.Date;

public class ContractDTO {

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
//	    private boolean activeStatus;

	    // Getters and Setters for all fields

	    public Integer getContractid() {
	        return contractId;
	    }

	    public void setContractid(Integer contractid) {
	        this.contractId = contractid;
	    }

	    public Integer getSalespersonid() {
	        return salesPersonId;
	    }

	    public void setSalespersonid(Integer salespersonid) {
	        this.salesPersonId = salespersonid;
	    }

	    public Integer getClientid() {
	        return clientId;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientId = clientid;
	    }

	    public String getContractcode() {
	        return contractCode;
	    }

	    public void setContractcode(String contractcode) {
	        this.contractCode = contractcode;
	    }

	    public String getBuisnessname() {
	        return businessName;
	    }

	    public void setBuisnessname(String buisnessname) {
	        this.businessName = buisnessname;
	    }

	    public Integer getBusinessaddressid() {
	        return businessAddressId;
	    }

	    public void setBusinessaddressid(Integer businessaddressid) {
	        this.businessAddressId = businessaddressid;
	    }

	    public String getCommunicationchannel() {
	        return communicationChannel;
	    }

	    public void setCommunicationchannel(String communicationchannel) {
	        this.communicationChannel = communicationchannel;
	    }

	    public Integer getPlanid() {
	        return planId;
	    }

	    public void setPlanid(Integer planid) {
	        this.planId = planid;
	    }

	    public Double getAnnualrenewalfee() {
	        return annualRenewalFee;
	    }

	    public void setAnnualrenewalfee(Double annualrenewalfee) {
	        this.annualRenewalFee = annualrenewalfee;
	    }

	    public Double getOnetimesetup() {
	        return oneTimeSetUp;
	    }

	    public void setOnetimesetup(Double onetimesetup) {
	        this.oneTimeSetUp = onetimesetup;
	    }

	    public Integer getSizeofthecommunity() {
	        return sizeOfTheCommunity;
	    }

	    public void setSizeofthecommunity(Integer sizeofthecommunity) {
	        this.sizeOfTheCommunity = sizeofthecommunity;
	    }

	    public String getRenewalcycles() {
	        return renewalCycles;
	    }

	    public void setRenewalcycles(String renewalcycles) {
	        this.renewalCycles = renewalcycles;
	    }

	    public Boolean getIstermsaccepted() {
	        return isTermsAccepted;
	    }

	    public void setIstermsaccepted(Boolean istermsaccepted) {
	        this.isTermsAccepted = istermsaccepted;
	    }

	    public Integer getCreatedbyid() {
	        return createdById;
	    }

	    public void setCreatedbyid(Integer createdbyid) {
	        this.createdById = createdbyid;
	    }

	    public Date getCreateddate() {
	        return createdDate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createdDate = createddate;
	    }

	    public Integer getModifiedbyid() {
	        return modifiedById;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedById = modifiedbyid;
	    }

	    public Date getModifieddate() {
	        return modifiedDate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifiedDate = modifieddate;
	    }
	    
	    

//		public boolean isActiveStatus() {
//			return activeStatus;
//		}
//
//		public void setActiveStatus(boolean activeStatus) {
//			this.activeStatus = activeStatus;
//		}

		@Override
		public String toString() {
			return "ContractDto [contractid=" + contractId + ", salespersonid=" + salesPersonId + ", clientid="
					+ clientId + ", contractcode=" + contractCode + ", buisnessname=" + businessName
					+ ", businessaddressid=" + businessAddressId + ", communicationchannel=" + communicationChannel
					+ ", planid=" + planId + ", annualrenewalfee=" + annualRenewalFee + ", onetimesetup=" + oneTimeSetUp
					+ ", sizeofthecommunity=" + sizeOfTheCommunity + ", renewalcycles=" + renewalCycles
					+ ", istermsaccepted=" + isTermsAccepted + ", createdbyid=" + createdById + ", createddate="
					+ createdDate + ", modifiedbyid=" + modifiedById + ", modifieddate=" + modifiedDate + "]";
		}

		public ContractDTO(Integer contractid, Integer salespersonid, Integer clientid, String contractcode,
				String buisnessname, Integer businessaddressid, String communicationchannel, Integer planid,
				Double annualrenewalfee, Double onetimesetup, Integer sizeofthecommunity, String renewalcycles,
				Boolean istermsaccepted, Integer createdbyid, Date createddate, Integer modifiedbyid,
				Date modifieddate) {
			super();
			this.contractId = contractid;
			this.salesPersonId = salespersonid;
			this.clientId = clientid;
			this.contractCode = contractcode;
			this.businessName = buisnessname;
			this.businessAddressId = businessaddressid;
			this.communicationChannel = communicationchannel;
			this.planId = planid;
			this.annualRenewalFee = annualrenewalfee;
			this.oneTimeSetUp = onetimesetup;
			this.sizeOfTheCommunity = sizeofthecommunity;
			this.renewalCycles = renewalcycles;
			this.isTermsAccepted = istermsaccepted;
			this.createdById = createdbyid;
			this.createdDate = createddate;
			this.modifiedById = modifiedbyid;
			this.modifiedDate = modifieddate;
//			this.activeStatus = activeStatus;
		}

		public ContractDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
