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
    private Integer    stateid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="stateName", nullable=false, length=128)
    private String     statename ;

    @Column(name="countryId", nullable=false)
    private Integer    countryid ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


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
        this.stateid = stateid ;
    }
    public Integer getStateid() {
        return this.stateid;
    }

    public void setStatename( String statename ) {
        this.statename = statename ;
    }
    public String getStatename() {
        return this.statename;
    }

    public void setCountryid( Integer countryid ) {
        this.countryid = countryid ;
    }
    public Integer getCountryid() {
        return this.countryid;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
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
        sb.append(stateid);
        sb.append("|");
        sb.append(statename);
        sb.append("|");
        sb.append(countryid);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
