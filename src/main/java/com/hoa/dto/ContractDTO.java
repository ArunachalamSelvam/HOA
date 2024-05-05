package com.hoa.dto;

import java.util.Date;

public class ContractDTO {

	    private Integer contractid;
	    private Integer salespersonid;
	    private Integer clientid;
	    private String contractcode;
	    private String businessname;
	    private Integer businessaddressid;
	    private String communicationchannel;
	    private Integer planid;
	    private Double annualrenewalfee;
	    private Double onetimesetup;
	    private Integer sizeofthecommunity;
	    private String renewalcycles;
	    private Boolean istermsaccepted;
	    private Integer createdbyid;
	    private Date createddate;
	    private Integer modifiedbyid;
	    private Date modifieddate;

	    // Getters and Setters for all fields

	    public Integer getContractid() {
	        return contractid;
	    }

	    public void setContractid(Integer contractid) {
	        this.contractid = contractid;
	    }

	    public Integer getSalespersonid() {
	        return salespersonid;
	    }

	    public void setSalespersonid(Integer salespersonid) {
	        this.salespersonid = salespersonid;
	    }

	    public Integer getClientid() {
	        return clientid;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientid = clientid;
	    }

	    public String getContractcode() {
	        return contractcode;
	    }

	    public void setContractcode(String contractcode) {
	        this.contractcode = contractcode;
	    }

	    public String getBuisnessname() {
	        return businessname;
	    }

	    public void setBuisnessname(String buisnessname) {
	        this.businessname = buisnessname;
	    }

	    public Integer getBusinessaddressid() {
	        return businessaddressid;
	    }

	    public void setBusinessaddressid(Integer businessaddressid) {
	        this.businessaddressid = businessaddressid;
	    }

	    public String getCommunicationchannel() {
	        return communicationchannel;
	    }

	    public void setCommunicationchannel(String communicationchannel) {
	        this.communicationchannel = communicationchannel;
	    }

	    public Integer getPlanid() {
	        return planid;
	    }

	    public void setPlanid(Integer planid) {
	        this.planid = planid;
	    }

	    public Double getAnnualrenewalfee() {
	        return annualrenewalfee;
	    }

	    public void setAnnualrenewalfee(Double annualrenewalfee) {
	        this.annualrenewalfee = annualrenewalfee;
	    }

	    public Double getOnetimesetup() {
	        return onetimesetup;
	    }

	    public void setOnetimesetup(Double onetimesetup) {
	        this.onetimesetup = onetimesetup;
	    }

	    public Integer getSizeofthecommunity() {
	        return sizeofthecommunity;
	    }

	    public void setSizeofthecommunity(Integer sizeofthecommunity) {
	        this.sizeofthecommunity = sizeofthecommunity;
	    }

	    public String getRenewalcycles() {
	        return renewalcycles;
	    }

	    public void setRenewalcycles(String renewalcycles) {
	        this.renewalcycles = renewalcycles;
	    }

	    public Boolean getIstermsaccepted() {
	        return istermsaccepted;
	    }

	    public void setIstermsaccepted(Boolean istermsaccepted) {
	        this.istermsaccepted = istermsaccepted;
	    }

	    public Integer getCreatedbyid() {
	        return createdbyid;
	    }

	    public void setCreatedbyid(Integer createdbyid) {
	        this.createdbyid = createdbyid;
	    }

	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    public Integer getModifiedbyid() {
	        return modifiedbyid;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedbyid = modifiedbyid;
	    }

	    public Date getModifieddate() {
	        return modifieddate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifieddate = modifieddate;
	    }

		@Override
		public String toString() {
			return "ContractDto [contractid=" + contractid + ", salespersonid=" + salespersonid + ", clientid="
					+ clientid + ", contractcode=" + contractcode + ", buisnessname=" + businessname
					+ ", businessaddressid=" + businessaddressid + ", communicationchannel=" + communicationchannel
					+ ", planid=" + planid + ", annualrenewalfee=" + annualrenewalfee + ", onetimesetup=" + onetimesetup
					+ ", sizeofthecommunity=" + sizeofthecommunity + ", renewalcycles=" + renewalcycles
					+ ", istermsaccepted=" + istermsaccepted + ", createdbyid=" + createdbyid + ", createddate="
					+ createddate + ", modifiedbyid=" + modifiedbyid + ", modifieddate=" + modifieddate + "]";
		}

		public ContractDTO(Integer contractid, Integer salespersonid, Integer clientid, String contractcode,
				String buisnessname, Integer businessaddressid, String communicationchannel, Integer planid,
				Double annualrenewalfee, Double onetimesetup, Integer sizeofthecommunity, String renewalcycles,
				Boolean istermsaccepted, Integer createdbyid, Date createddate, Integer modifiedbyid,
				Date modifieddate) {
			super();
			this.contractid = contractid;
			this.salespersonid = salespersonid;
			this.clientid = clientid;
			this.contractcode = contractcode;
			this.businessname = buisnessname;
			this.businessaddressid = businessaddressid;
			this.communicationchannel = communicationchannel;
			this.planid = planid;
			this.annualrenewalfee = annualrenewalfee;
			this.onetimesetup = onetimesetup;
			this.sizeofthecommunity = sizeofthecommunity;
			this.renewalcycles = renewalcycles;
			this.istermsaccepted = istermsaccepted;
			this.createdbyid = createdbyid;
			this.createddate = createddate;
			this.modifiedbyid = modifiedbyid;
			this.modifieddate = modifieddate;
		}

		public ContractDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
