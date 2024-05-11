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
    private Integer    countryId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="countryName", nullable=false, length=128)
    private String     countryName ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;


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
        this.countryId = countryid ;
    }
    public Integer getCountryid() {
        return this.countryId;
    }

    public void setCountryname( String countryname ) {
        this.countryName = countryname ;
    }
    public String getCountryname() {
        return this.countryName;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
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
        sb.append(countryId);
        sb.append("|");
        sb.append(countryName);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
