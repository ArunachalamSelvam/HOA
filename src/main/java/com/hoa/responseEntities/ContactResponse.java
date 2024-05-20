package com.hoa.responseEntities;

import java.util.Date;

public class ContactResponse {
	
	    private Integer contactId;
	    private String name;
	    private String email;
	    private String phoneNumber;
	    private String description;
	    private Boolean termsAccepted;
	    private Boolean followUp;
	    private String city;
	    private Integer countryId;
	    private Integer stateId;
	    private Integer planId;
	    private Date createdDate;
	    private String planRange;
	    private String planType;
	    private String planPeriod;
	    
		public Integer getContactId() {
			return contactId;
		}
		public void setContactId(Integer contactId) {
			this.contactId = contactId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Boolean getTermsAccepted() {
			return termsAccepted;
		}
		public void setTermsAccepted(Boolean termsAccepted) {
			this.termsAccepted = termsAccepted;
		}
		public Boolean getFollowUp() {
			return followUp;
		}
		public void setFollowUp(Boolean followUp) {
			this.followUp = followUp;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Integer getCountryId() {
			return countryId;
		}
		public void setCountryId(Integer countryId) {
			this.countryId = countryId;
		}
		public Integer getStateId() {
			return stateId;
		}
		public void setStateId(Integer stateId) {
			this.stateId = stateId;
		}
		public Integer getPlanId() {
			return planId;
		}
		public void setPlanId(Integer planId) {
			this.planId = planId;
		}
		public Date getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		public String getPlanRange() {
			return planRange;
		}
		public void setPlanRange(String planRange) {
			this.planRange = planRange;
		}
		public String getPlanType() {
			return planType;
		}
		public void setPlanType(String planType) {
			this.planType = planType;
		}
		public String getPlanPeriod() {
			return planPeriod;
		}
		public void setPlanPeriod(String planPeriod) {
			this.planPeriod = planPeriod;
		}
		
		@Override
		public String toString() {
			return "ContactResponse [contactId=" + contactId + ", name=" + name + ", email=" + email + ", phoneNumber="
					+ phoneNumber + ", description=" + description + ", termsAccepted=" + termsAccepted + ", followUp="
					+ followUp + ", city=" + city + ", countryId=" + countryId + ", stateId=" + stateId + ", planId="
					+ planId + ", createdDate=" + createdDate + ", planRange=" + planRange + ", planType=" + planType
					+ ", planPeriod=" + planPeriod + "]";
		}
		
		public ContactResponse(Integer contactId, String name, String email, String phoneNumber, String description,
				Boolean termsAccepted, Boolean followUp, String city, Integer countryId, Integer stateId,
				Integer planId, Date createdDate, String planRange, String planType, String planPeriod) {
			super();
			this.contactId = contactId;
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.description = description;
			this.termsAccepted = termsAccepted;
			this.followUp = followUp;
			this.city = city;
			this.countryId = countryId;
			this.stateId = stateId;
			this.planId = planId;
			this.createdDate = createdDate;
			this.planRange = planRange;
			this.planType = planType;
			this.planPeriod = planPeriod;
		}
		
		public ContactResponse() {
			super();
			// TODO Auto-generated constructor stub
		}	
		
}