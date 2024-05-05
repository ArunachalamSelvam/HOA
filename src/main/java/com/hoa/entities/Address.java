package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * JPA entity class for "Address"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Address", schema="public" )
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="addressId", nullable=false)
    private Integer    addressid ;

    //--- ENTITY DATA FIELDS 

   
    @Column(name="address", nullable=false, length=256)
    private String     address ;

    @Column(name="city", length=128)
    private String     city ;

    @Column(name="stateId")
    private Integer    stateid ;

    @Column(name="countryId")
    private Integer    countryid ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;

    @Column(name="createdById", nullable=false)
    private Integer    createdbyid ;

    @Column(name="modifiedById")
    private Integer    modifiedbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifieddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="address")
//    private List<Clientaddress> listOfClientaddress ; 
//
//    @OneToMany(mappedBy="address")
//    private List<Community> listOfCommunity ; 

    @ManyToOne
    @JoinColumn(name="modifiedById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="countryId", referencedColumnName="countryId", insertable=false, updatable=false)
    private Country    country ; 

    @ManyToOne
    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="stateId", referencedColumnName="stateId", insertable=false, updatable=false)
    private State      state ; 

    @OneToMany(mappedBy="address")
    private List<Contract> listOfContract ; 


    /**
     * Constructor
     */
    public Address() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setAddressid( Integer addressid ) {
        this.addressid = addressid ;
    }
    public Integer getAddressid() {
        return this.addressid;
    }

    public void setAddress( String address ) {
        this.address = address ;
    }
    public String getAddress() {
        return this.address;
    }

    public void setCity( String city ) {
        this.city = city ;
    }
    public String getCity() {
        return this.city;
    }

    public void setStateid( Integer stateid ) {
        this.stateid = stateid ;
    }
    public Integer getStateid() {
        return this.stateid;
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

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdbyid = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdbyid;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedbyid = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedbyid;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifieddate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifieddate;
    }

    //--- GETTERS FOR LINKS
//    public List<Clientaddress> getListOfClientaddress() {
//        return this.listOfClientaddress;
//    } 
//
//    public List<Community> getListOfCommunity() {
//        return this.listOfCommunity;
//    } 

    public User getUser2() {
        return this.user2;
    } 

    public Country getCountry() {
        return this.country;
    } 

    public User getUser() {
        return this.user;
    } 

    public State getState() {
        return this.state;
    } 

    public List<Contract> getListOfContract() {
        return this.listOfContract;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(addressid);
        sb.append("|");
        sb.append(address);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(stateid);
        sb.append("|");
        sb.append(countryid);
        sb.append("|");
        sb.append(activestatus);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifieddate);
        return sb.toString(); 
    } 

}
