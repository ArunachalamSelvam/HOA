package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Vendor"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Vendor", schema="public" )
public class Vendor implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="vendorId", nullable=false)
    private Integer    vendorId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="emailId", nullable=false, length=128)
    private String     emailId ;

    @Column(name="phone", nullable=false, length=128)
    private String     phone ;

    @Column(name="zipCode", nullable=false, length=128)
    private String     zipCode ;

    @Column(name="serviceTypeID", nullable=false)
    private Integer    serviceTypeId ;

    @Column(name="communityID", nullable=false)
    private Integer    communityId ;

    @Temporal(TemporalType.DATE)
    @Column(name="licenseExpiryDate")
    private Date       licenseExpiryDate ;

    @Column(name="createdByID", nullable=false)
    private Integer    createdById ;

    @Column(name="modifiedByID")
    private Integer    modifieById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifiedDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="serviceTypeID", referencedColumnName="id", insertable=false, updatable=false)
    private ServiceType servicetype ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @OneToMany(mappedBy="vendor")
    private List<ServiceRequest> listOfServicerequest ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public Vendor() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setVendorid( Integer vendorid ) {
        this.vendorId = vendorid ;
    }
    public Integer getVendorid() {
        return this.vendorId;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
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

    public void setZipcode( String zipcode ) {
        this.zipCode = zipcode ;
    }
    public String getZipcode() {
        return this.zipCode;
    }

    public void setServicetypeid( Integer servicetypeid ) {
        this.serviceTypeId = servicetypeid ;
    }
    public Integer getServicetypeid() {
        return this.serviceTypeId;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setLicenseexpirydate( Date licenseexpirydate ) {
        this.licenseExpiryDate = licenseexpirydate ;
    }
    public Date getLicenseexpirydate() {
        return this.licenseExpiryDate;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdById = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdById;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifieById = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifieById;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifiedDate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifiedDate;
    }

    //--- GETTERS FOR LINKS
    public User getUser2() {
        return this.user2;
    } 

    public ServiceType getServicetype() {
        return this.servicetype;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public List<ServiceRequest> getListOfServicerequest() {
        return this.listOfServicerequest;
    } 

    public User getUser() {
        return this.user;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(vendorId);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(emailId);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(zipCode);
        sb.append("|");
        sb.append(serviceTypeId);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(licenseExpiryDate);
        sb.append("|");
        sb.append(createdById);
        sb.append("|");
        sb.append(modifieById);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(modifiedDate);
        return sb.toString(); 
    } 

}
