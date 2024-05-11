package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Enquiry"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Enquiry", schema="public" )
public class Enquiry implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="enquiryId", nullable=false)
    private Integer    enquiryId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="firstName", nullable=false, length=128)
    private String     firstName ;

    @Column(name="lastName", length=128)
    private String     lastName ;

    @Column(name="emailId", length=128)
    private String     emailId ;

    @Column(name="phone", length=20)
    private String     phone ;

    @Column(name="city", length=128)
    private String     city ;

    @Column(name="countryId")
    private Integer    countryId ;

    @Column(name="stateId")
    private Integer    stateId ;

    @Column(name="planId")
    private Integer    planId ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="countryId", referencedColumnName="countryId", insertable=false, updatable=false)
    private Country    country ; 

    @ManyToOne
    @JoinColumn(name="stateId", referencedColumnName="stateId", insertable=false, updatable=false)
    private State      state ; 

    @ManyToOne
    @JoinColumn(name="planId", referencedColumnName="planId", insertable=false, updatable=false)
    private Plan       plan ; 


    /**
     * Constructor
     */
    public Enquiry() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setEnquiryid( Integer enquiryid ) {
        this.enquiryId = enquiryid ;
    }
    public Integer getEnquiryid() {
        return this.enquiryId;
    }

    public void setFirstname( String firstname ) {
        this.firstName = firstname ;
    }
    public String getFirstname() {
        return this.firstName;
    }

    public void setLastname( String lastname ) {
        this.lastName = lastname ;
    }
    public String getLastname() {
        return this.lastName;
    }

    public void setEmailid( String emailid ) {
        this.emailId = emailid ;
    }
    public String getEmailid() {
        return this.emailId;
    }

    public void setPhone( String phone ) {
        this.phone = phone ;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setCity( String city ) {
        this.city = city ;
    }
    public String getCity() {
        return this.city;
    }

    public void setCountryid( Integer countryid ) {
        this.countryId = countryid ;
    }
    public Integer getCountryid() {
        return this.countryId;
    }

    public void setStateid( Integer stateid ) {
        this.stateId = stateid ;
    }
    public Integer getStateid() {
        return this.stateId;
    }

    public void setPlanid( Integer planid ) {
        this.planId = planid ;
    }
    public Integer getPlanid() {
        return this.planId;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    //--- GETTERS FOR LINKS
    public Country getCountry() {
        return this.country;
    } 

    public State getState() {
        return this.state;
    } 

    public Plan getPlan() {
        return this.plan;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(enquiryId);
        sb.append("|");
        sb.append(firstName);
        sb.append("|");
        sb.append(lastName);
        sb.append("|");
        sb.append(emailId);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(countryId);
        sb.append("|");
        sb.append(stateId);
        sb.append("|");
        sb.append(planId);
        sb.append("|");
        sb.append(createdDate);
        return sb.toString(); 
    } 

}
