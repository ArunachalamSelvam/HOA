package com.hoa.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_Id")
    private Integer contactId;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "phoneno", length = 20)
    private String phoneNumber;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "termsAccepted")
    private Boolean termsAccepted;

    @Column(name = "followUp")
    private Boolean followUp;

    @Column(name = "city", length = 255)
    private String city;

    @Column(name = "countryID")
    private Integer countryId;

    @Column(name = "stateID")
    private Integer stateId;

    @Column(name = "planID")
    private Integer planId;

    @Column(name = "createdDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    
    @Column(name="activeStatus")
    private Boolean    activeStatus ;
    
    @Column(name = "zipCode")
    private Integer zipCode;
    
    @ManyToOne
    @JoinColumn(name = "countryID", referencedColumnName = "countryID", insertable = false, updatable = false)
    private Country country;

    @ManyToOne
    @JoinColumn(name = "stateID", referencedColumnName = "stateID", insertable = false, updatable = false)
    private State state;

    @ManyToOne
    @JoinColumn(name = "planID", referencedColumnName = "planID", insertable = false, updatable = false)
    private Plan plan;
    
    // Constructors, getters, and setters

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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	

    
    public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	
	
	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}
}
