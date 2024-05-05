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
    private Integer    enquiryid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="firstName", nullable=false, length=128)
    private String     firstname ;

    @Column(name="lastName", length=128)
    private String     lastname ;

    @Column(name="emailId", length=128)
    private String     emailid ;

    @Column(name="phone", length=20)
    private String     phone ;

    @Column(name="city", length=128)
    private String     city ;

    @Column(name="countryId")
    private Integer    countryid ;

    @Column(name="stateId")
    private Integer    stateid ;

    @Column(name="planId")
    private Integer    planid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;


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
        this.enquiryid = enquiryid ;
    }
    public Integer getEnquiryid() {
        return this.enquiryid;
    }

    public void setFirstname( String firstname ) {
        this.firstname = firstname ;
    }
    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname( String lastname ) {
        this.lastname = lastname ;
    }
    public String getLastname() {
        return this.lastname;
    }

    public void setEmailid( String emailid ) {
        this.emailid = emailid ;
    }
    public String getEmailid() {
        return this.emailid;
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
        this.countryid = countryid ;
    }
    public Integer getCountryid() {
        return this.countryid;
    }

    public void setStateid( Integer stateid ) {
        this.stateid = stateid ;
    }
    public Integer getStateid() {
        return this.stateid;
    }

    public void setPlanid( Integer planid ) {
        this.planid = planid ;
    }
    public Integer getPlanid() {
        return this.planid;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
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
        sb.append(enquiryid);
        sb.append("|");
        sb.append(firstname);
        sb.append("|");
        sb.append(lastname);
        sb.append("|");
        sb.append(emailid);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(countryid);
        sb.append("|");
        sb.append(stateid);
        sb.append("|");
        sb.append(planid);
        sb.append("|");
        sb.append(createddate);
        return sb.toString(); 
    } 

}
