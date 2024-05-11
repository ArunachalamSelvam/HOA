package com.hoa.dto;

import java.util.Date;

public class EnquiryDTO {

	    private Integer enquiryId;
	    private String firstName;
	    private String lastName;
	    private String emailId;
	    private String phone;
	    private String city;
	    private Integer countryId;
	    private Integer stateId;
	    private Integer planId;
	    private Date createdDate;
//	    private CountryDTO country;
//	    private StateDTO state;
//	    private PlanDTO plan;

	    // Getters and Setters for all fields

	    public Integer getEnquiryid() {
	        return enquiryId;
	    }

	    public void setEnquiryid(Integer enquiryid) {
	        this.enquiryId = enquiryid;
	    }

	    public String getFirstname() {
	        return firstName;
	    }

	    public void setFirstname(String firstname) {
	        this.firstName = firstname;
	    }

	    public String getLastname() {
	        return lastName;
	    }

	    public void setLastname(String lastname) {
	        this.lastName = lastname;
	    }

	    public String getEmailid() {
	        return emailId;
	    }

	    public void setEmailid(String emailid) {
	        this.emailId = emailid;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public Integer getCountryid() {
	        return countryId;
	    }

	    public void setCountryid(Integer countryid) {
	        this.countryId = countryid;
	    }

	    public Integer getStateid() {
	        return stateId;
	    }

	    public void setStateid(Integer stateid) {
	        this.stateId = stateid;
	    }

	    public Integer getPlanid() {
	        return planId;
	    }

	    public void setPlanid(Integer planid) {
	        this.planId = planid;
	    }

	    public Date getCreateddate() {
	        return createdDate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createdDate = createddate;
	    }

//	    public CountryDTO getCountry() {
//	        return country;
//	    }
//
//	    public void setCountry(CountryDTO country) {
//	        this.country = country;
//	    }
//
//	    public StateDTO getState() {
//	        return state;
//	    }
//
//	    public void setState(StateDTO state) {
//	        this.state = state;
//	    }
//
//	    public PlanDTO getPlan() {
//	        return plan;
//	    }
//
//	    public void setPlan(PlanDTO plan) {
//	        this.plan = plan;
//	    }

		@Override
		public String toString() {
			return "EnquiryDto [enquiryid=" + enquiryId + ", firstname=" + firstName + ", lastname=" + lastName
					+ ", emailid=" + emailId + ", phone=" + phone + ", city=" + city + ", countryid=" + countryId
					+ ", stateid=" + stateId + ", planid=" + planId + ", createddate=" + createdDate +"]";
		}

		public EnquiryDTO(Integer enquiryid, String firstname, String lastname, String emailid, String phone,
				String city, Integer countryid, Integer stateid, Integer planid, Date createddate) {
			super();
			this.enquiryId = enquiryid;
			this.firstName = firstname;
			this.lastName = lastname;
			this.emailId = emailid;
			this.phone = phone;
			this.city = city;
			this.countryId = countryid;
			this.stateId = stateid;
			this.planId = planid;
			this.createdDate = createddate;
			
		}

		public EnquiryDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
