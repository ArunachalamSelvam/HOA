package com.hoa.dto;

import java.util.Date;

public class AmenityBookingDTO {
	
	    private Integer amenityBookingId;
	    private Integer amenityId;
	    private Date bookingDate;
	    private Date bookingStart;
	    private Date bookingEnd;
	    private Integer communityId;
	    private Integer bookedUserId;
	    private Integer bookedForClientId;
	    private Integer createdById;
	    private Integer modifiedById;
	    private Date createdDate;
	    private Date modifiedDate;
	    private Double amount;
	    private String paymentStatus;
	    private Integer paymentDetailId;

	    // Getter and Setter for amenitybookingid
	    public Integer getAmenitybookingid() {
	        return amenityBookingId;
	    }

	    public void setAmenitybookingid(Integer amenitybookingid) {
	        this.amenityBookingId = amenitybookingid;
	    }

	    // Getter and Setter for amenityid
	    public Integer getAmenityid() {
	        return amenityId;
	    }

	    public void setAmenityid(Integer amenityid) {
	        this.amenityId = amenityid;
	    }

	    // Getter and Setter for bookingdate
	    public Date getBookingdate() {
	        return bookingDate;
	    }

	    public void setBookingdate(Date bookingdate) {
	        this.bookingDate = bookingdate;
	    }

	    // Getter and Setter for bookingstart
	    public Date getBookingstart() {
	        return bookingStart;
	    }

	    public void setBookingstart(Date bookingstart) {
	        this.bookingStart = bookingstart;
	    }

	    // Getter and Setter for bookingend
	    public Date getBookingend() {
	        return bookingEnd;
	    }

	    public void setBookingend(Date bookingend) {
	        this.bookingEnd = bookingend;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityId;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityId = communityid;
	    }

	    // Getter and Setter for bookeduserid
	    public Integer getBookeduserid() {
	        return bookedUserId;
	    }

	    public void setBookeduserid(Integer bookeduserid) {
	        this.bookedUserId = bookeduserid;
	    }

	    // Getter and Setter for bookedforclientid
	    public Integer getBookedforclientid() {
	        return bookedForClientId;
	    }

	    public void setBookedforclientid(Integer bookedforclientid) {
	        this.bookedForClientId = bookedforclientid;
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

	    // Getter and Setter for paymentstatus
	    public String getPaymentstatus() {
	        return paymentStatus;
	    }

	    public void setPaymentstatus(String paymentstatus) {
	        this.paymentStatus = paymentstatus;
	    }

	    // Getter and Setter for paymentdetailid
	    public Integer getPaymentdetailid() {
	        return paymentDetailId;
	    }

	    public void setPaymentdetailid(Integer paymentdetailid) {
	        this.paymentDetailId = paymentdetailid;
	    }

		@Override
		public String toString() {
			return "AmenitybookingDto [amenitybookingid=" + amenityBookingId + ", amenityid=" + amenityId
					+ ", bookingdate=" + bookingDate + ", bookingstart=" + bookingStart + ", bookingend=" + bookingEnd
					+ ", communityid=" + communityId + ", bookeduserid=" + bookedUserId + ", bookedforclientid="
					+ bookedForClientId + ", createdbyid=" + createdById + ", modifiedbyid=" + modifiedById
					+ ", createddate=" + createdDate + ", modifieddate=" + modifiedDate + ", amount=" + amount
					+ ", paymentstatus=" + paymentStatus + ", paymentdetailid=" + paymentDetailId + "]";
		}

		public AmenityBookingDTO(Integer amenitybookingid, Integer amenityid, Date bookingdate, Date bookingstart,
				Date bookingend, Integer communityid, Integer bookeduserid, Integer bookedforclientid,
				Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate, Double amount,
				String paymentstatus, Integer paymentdetailid) {
			super();
			this.amenityBookingId = amenitybookingid;
			this.amenityId = amenityid;
			this.bookingDate = bookingdate;
			this.bookingStart = bookingstart;
			this.bookingEnd = bookingend;
			this.communityId = communityid;
			this.bookedUserId = bookeduserid;
			this.bookedForClientId = bookedforclientid;
			this.createdById = createdbyid;
			this.modifiedById = modifiedbyid;
			this.createdDate = createddate;
			this.modifiedDate = modifieddate;
			this.amount = amount;
			this.paymentStatus = paymentstatus;
			this.paymentDetailId = paymentdetailid;
		}

		public AmenityBookingDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	
}
