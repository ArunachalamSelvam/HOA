package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Country"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Country", schema="public" )
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="countryId", nullable=false)
    private Integer    countryid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="countryName", nullable=false, length=128)
    private String     countryname ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="country")
//    private List<State> listOfState ; 
//
//    @OneToMany(mappedBy="country")
//    private List<Address> listOfAddress ; 
//
//    @OneToMany(mappedBy="country")
//    private List<Enquiry> listOfEnquiry ; 


    /**
     * Constructor
     */
    public Country() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setCountryid( Integer countryid ) {
        this.countryid = countryid ;
    }
    public Integer getCountryid() {
        return this.countryid;
    }

    public void setCountryname( String countryname ) {
        this.countryname = countryname ;
    }
    public String getCountryname() {
        return this.countryname;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    //--- GETTERS FOR LINKS
//    public List<State> getListOfState() {
//        return this.listOfState;
//    } 
//
//    public List<Address> getListOfAddress() {
//        return this.listOfAddress;
//    } 
//
//    public List<Enquiry> getListOfEnquiry() {
//        return this.listOfEnquiry;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(countryid);
        sb.append("|");
        sb.append(countryname);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
