package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "State"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="State", schema="public" )
public class State implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="stateId", nullable=false)
    private Integer    stateId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="stateName", nullable=false, length=128)
    private String     stateName ;

    @Column(name="countryId", nullable=false)
    private Integer    countryId ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="state")
//    private List<Enquiry> listOfEnquiry ; 

    @ManyToOne
    @JoinColumn(name="countryId", referencedColumnName="countryId", insertable=false, updatable=false)
    private Country    country ; 

//    @OneToMany(mappedBy="state")
//    private List<Address> listOfAddress ; 


    /**
     * Constructor
     */
    public State() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setStateid( Integer stateid ) {
        this.stateId = stateid ;
    }
    public Integer getStateid() {
        return this.stateId;
    }

    public void setStatename( String statename ) {
        this.stateName = statename ;
    }
    public String getStatename() {
        return this.stateName;
    }

    public void setCountryid( Integer countryid ) {
        this.countryId = countryid ;
    }
    public Integer getCountryid() {
        return this.countryId;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    //--- GETTERS FOR LINKS
//    public List<Enquiry> getListOfEnquiry() {
//        return this.listOfEnquiry;
//    } 

    public Country getCountry() {
        return this.country;
    } 

//    public List<Address> getListOfAddress() {
//        return this.listOfAddress;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(stateId);
        sb.append("|");
        sb.append(stateName);
        sb.append("|");
        sb.append(countryId);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
