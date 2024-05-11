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
    private Integer    addressId ;

    //--- ENTITY DATA FIELDS 

   
    @Column(name="address", nullable=false, length=256)
    private String     address ;

    @Column(name="city", length=128)
    private String     city ;

    @Column(name="stateId")
    private Integer    stateId ;

    @Column(name="countryId")
    private Integer    countryId ;
    
    @Column(name="zip_code")
    private Integer    zipCode ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;

//    @Column(name="createdById", nullable=false)
//    private Integer    createdById ;
//
//    @Column(name="modifiedById")
//    private Integer    modifiedById ;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name="createdDate", nullable=false)
//    private Date       createdDate ;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name="modifiedDate")
//    private Date       modifieddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="address")
//    private List<Clientaddress> listOfClientaddress ; 
//
//    @OneToMany(mappedBy="address")
//    private List<Community> listOfCommunity ; 

//    @ManyToOne
//    @JoinColumn(name="modifiedById", referencedColumnName="userId", insertable=false, updatable=false)
//    private User       user2 ; 
//
//    @ManyToOne
//    @JoinColumn(name="countryId", referencedColumnName="countryId", insertable=false, updatable=false)
//    private Country    country ; 
//
//    @ManyToOne
//    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
//    private User       user ; 
//
//    @ManyToOne
//    @JoinColumn(name="stateId", referencedColumnName="stateId", insertable=false, updatable=false)
//    private State      state ; 

//    @OneToMany(mappedBy="address")
//    private List<Contract> listOfContract ; 


    /**
     * Constructor
     */
    public Address() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setAddressid( Integer addressid ) {
        this.addressId = addressid ;
    }
    public Integer getAddressId() {
        return this.addressId;
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
        this.stateId = stateid ;
    }
    public Integer getStateId() {
        return this.stateId;
    }

    public void setCountryId( Integer countryid ) {
        this.countryId = countryid ;
    }
    public Integer getCountryId() {
        return this.countryId;
    }

    public void setActiveStatus( Boolean activeStatus ) {
        this.activeStatus = activeStatus ;
    }
    public Boolean getActiveStatus() {
        return this.activeStatus;
    }

//    public void setCreatedbyid( Integer createdbyid ) {
//        this.createdById = createdbyid ;
//    }
//    public Integer getCreatedbyid() {
//        return this.createdById;
//    }
//
//    public void setModifiedbyid( Integer modifiedbyid ) {
//        this.modifiedById = modifiedbyid ;
//    }
//    public Integer getModifiedbyid() {
//        return this.modifiedById;
//    }
//
//    public void setCreateddate( Date createddate ) {
//        this.createdDate = createddate ;
//    }
//    public Date getCreateddate() {
//        return this.createdDate;
//    }
//
//    public void setModifieddate( Date modifieddate ) {
//        this.modifieddate = modifieddate ;
//    }
//    public Date getModifieddate() {
//        return this.modifieddate;
//    }

    //--- GETTERS FOR LINKS
//    public List<Clientaddress> getListOfClientaddress() {
//        return this.listOfClientaddress;
//    } 
//
//    public List<Community> getListOfCommunity() {
//        return this.listOfCommunity;
//    } 

//    public User getUser2() {
//        return this.user2;
//    } 
//
//    public Country getCountry() {
//        return this.country;
//    } 
//
//    public User getUser() {
//        return this.user;
//    } 
//
//    public State getState() {
//        return this.state;
//    } 

//    public List<Contract> getListOfContract() {
//        return this.listOfContract;
//    } 

    
    public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	//--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(addressId);
        sb.append("|");
        sb.append(address);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(stateId);
        sb.append("|");
        sb.append(countryId);
        sb.append("|");
        sb.append(activeStatus);
        sb.append("|");
       
        return sb.toString(); 
    } 

}
