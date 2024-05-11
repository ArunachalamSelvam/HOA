package com.hoa.dto;

import java.util.Date;

public class BankDetailDTO {

	    private Integer bankId;
	    private Integer communityId;
	    private String routingNumber;
	    private String accountNumber;
	    private Boolean isVerified;
	    private Integer createdById;
	    private Date createdDate;
	    private Integer modifiedById;
	    private Date modifiedDate;
	   

	    // Getter and Setter for bankid
	    public Integer getBankid() {
	        return bankId;
	    }

	    public void setBankid(Integer bankid) {
	        this.bankId = bankid;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityId;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityId = communityid;
	    }

	    // Getter and Setter for routingnumber
	    public String getRoutingnumber() {
	        return routingNumber;
	    }

	    public void setRoutingnumber(String routingnumber) {
	        this.routingNumber = routingnumber;
	    }

	    // Getter and Setter for accountnumber
	    public String getAccountnumber() {
	        return accountNumber;
	    }

	    public void setAccountnumber(String accountnumber) {
	        this.accountNumber = accountnumber;
	    }

	    // Getter and Setter for isverified
	    public Boolean getIsverified() {
	        return isVerified;
	    }

	    public void setIsverified(Boolean isverified) {
	        this.isVerified = isverified;
	    }

	    // Getter and Setter for createdbyid
	    public Integer getCreatedbyid() {
	        return createdById;
	    }

	    public void setCreatedbyid(Integer createdbyid) {
	        this.createdById = createdbyid;
	    }

	    // Getter and Setter for createddate
	    public Date getCreateddate() {
	        return createdDate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createdDate = createddate;
	    }

	    // Getter and Setter for modifiedbyid
	    public Integer getModifiedbyid() {
	        return modifiedById;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedById = modifiedbyid;
	    }

	    // Getter and Setter for modifieddate
	    public Date getModifieddate() {
	        return modifiedDate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifiedDate = modifieddate;
	    }

	    // Getter and Setter for user
//	    public UserDTO getUser() {
//	        return user;
//	    }
//
//	    public void setUser(UserDTO user) {
//	        this.user = user;
//	    }
//
//	    // Getter and Setter for user2
//	    public UserDTO getUser2() {
//	        return user2;
//	    }
//
//	    public void setUser2(UserDTO user2) {
//	        this.user2 = user2;
//	    }
//
//	    // Getter and Setter for community
//	    public CommunityDTO getCommunity() {
//	        return community;
//	    }
//
//	    public void setCommunity(CommunityDTO community) {
//	        this.community = community;
//	    }

		@Override
		public String toString() {
			return "BankdetailDto [bankid=" + bankId + ", communityid=" + communityId + ", routingnumber="
					+ routingNumber + ", accountnumber=" + accountNumber + ", isverified=" + isVerified
					+ ", createdbyid=" + createdById + ", createddate=" + createdDate + ", modifiedbyid=" + modifiedById
					+ ", modifieddate=" + modifiedDate  + "]";
		}

		public BankDetailDTO(Integer bankid, Integer communityid, String routingnumber, String accountnumber,
				Boolean isverified, Integer createdbyid, Date createddate, Integer modifiedbyid, Date modifieddate) {
			super();
			this.bankId = bankid;
			this.communityId = communityid;
			this.routingNumber = routingnumber;
			this.accountNumber = accountnumber;
			this.isVerified = isverified;
			this.createdById = createdbyid;
			this.createdDate = createddate;
			this.modifiedById = modifiedbyid;
			this.modifiedDate = modifieddate;
		
		}

		public BankDetailDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
