package com.hoa.dto;

import java.util.Date;

public class AmenityDTO {

	    private Integer amenityId;
	    private Integer amenityTypeId;
	    private String name;
	    private Integer communityId;
	    private Integer createdById;
	    private Integer modifiedById;
	    private Date createdDate;
	    private Date modifiedDate;
	    private Double amount;
	    private Double lateCharge;

	    // Getter and Setter for amenityid
	    public Integer getAmenityid() {
	        return amenityId;
	    }

	    public void setAmenityid(Integer amenityid) {
	        this.amenityId = amenityid;
	    }

	    // Getter and Setter for amenitytypeid
	    public Integer getAmenitytypeid() {
	        return amenityTypeId;
	    }

	    public void setAmenitytypeid(Integer amenitytypeid) {
	        this.amenityTypeId = amenitytypeid;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityId;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityId = communityid;
	    }

	    // Getter and Setter for createdbyid
	    public Integer getCreatedbyid() {
	        return createdById;
	    }

	    public void setCreatedbyid(Integer createdbyid) {
	        this.createdById = createdbyid;
	    }

	    // Getter and Setter for modifiedbyid
	    public Integer getModifiedbyid() {
	        return modifiedById;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedById = modifiedbyid;
	    }

	    // Getter and Setter for createddate
	    public Date getCreateddate() {
	        return createdDate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createdDate = createddate;
	    }

	    // Getter and Setter for modifieddate
	    public Date getModifieddate() {
	        return modifiedDate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifiedDate = modifieddate;
	    }

	    // Getter and Setter for amount
	    public Double getAmount() {
	        return amount;
	    }

	    public void setAmount(Double amount) {
	        this.amount = amount;
	    }

	    // Getter and Setter for latecharge
	    public Double getLatecharge() {
	        return lateCharge;
	    }

	    public void setLatecharge(Double latecharge) {
	        this.lateCharge = latecharge;
	    }

		@Override
		public String toString() {
			return "AmenityDto [amenityid=" + amenityId + ", amenitytypeid=" + amenityTypeId + ", name=" + name
					+ ", communityid=" + communityId + ", createdbyid=" + createdById + ", modifiedbyid=" + modifiedById
					+ ", createddate=" + createdDate + ", modifieddate=" + modifiedDate + ", amount=" + amount
					+ ", latecharge=" + lateCharge + "]";
		}

		public AmenityDTO(Integer amenityid, Integer amenitytypeid, String name, Integer communityid,
				Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate, Double amount,
				Double latecharge) {
			super();
			this.amenityId = amenityid;
			this.amenityTypeId = amenitytypeid;
			this.name = name;
			this.communityId = communityid;
			this.createdById = createdbyid;
			this.modifiedById = modifiedbyid;
			this.createdDate = createddate;
			this.modifiedDate = modifieddate;
			this.amount = amount;
			this.lateCharge = latecharge;
		}

		public AmenityDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
