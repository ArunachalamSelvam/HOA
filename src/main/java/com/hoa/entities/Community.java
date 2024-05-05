package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Community"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Community", schema="public" )
public class Community implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="communityID", nullable=false)
    private Integer    communityid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", length=128)
    private String     name ;

    @Column(name="communityCode", length=255)
    private String     communityCode ;

    @Column(name="addressID")
    private Integer    addressid ;

    @Column(name="presidentEmailID", length=128)
    private String     presidentemailid ;

    @Column(name="presidentInviteStatus", length=128)
    private String     presidentinvitestatus ;

    @Column(name="presidentUserId")
    private Integer    presidentuserid ;

    @Column(name="secretaryEmailID", length=128)
    private String     secretaryemailid ;

    @Column(name="secretaryInviteStatus", length=128)
    private String     secretaryinvitestatus ;

    @Column(name="secretaryUserID")
    private Integer    secretaryuserid ;

    @Column(name="treasurerEmailID", length=128)
    private String     treasureremailid ;

    @Column(name="treasurerInviteStatus", length=128)
    private String     treasurerinvitestatus ;

    @Column(name="treasurerUserID")
    private Integer    treasureruserid ;

    @Column(name="planId")
    private Integer    planid ;

    @Column(name="licenseStatus", length=128)
    private String     licensestatus ;

    @Column(name="communitySize")
    private Integer    communitysize ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="planExpireDate")
    private Date       planexpiredate ;

    @Column(name="contactPerson", length=128)
    private String     contactperson ;

    @Column(name="totalOwners")
    private Integer    totalowners ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;

    @Column(name="createdById", nullable=false)
    private Integer    createdbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;

    @Column(name="modifiedById")
    private Integer    modifiedbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifieddate ;

    @Column(name="timeZone", length=2147483647)
    private String     timezone ;

    @Column(name="contractId")
    private Integer    contractid ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="community")
//    private List<HoaFee> listOfHoafee ; 
//
//    @OneToMany(mappedBy="community")
//    private List<Faq>  listOfFaq ; 
//
//    @OneToMany(mappedBy="community")
//    private List<ServiceRequest> listOfServicerequest ; 
//
//    @OneToMany(mappedBy="community")
//    private List<Violation> listOfViolation ; 
//
//    @OneToMany(mappedBy="community")
//    private List<CommunityDocument> listOfCommunitydocument ; 
//
//    @OneToMany(mappedBy="community")
//    private List<News> listOfNews ; 
//
//    @OneToMany(mappedBy="community")
//    private List<AuditLog> listOfAuditlog ; 
//
//    @OneToMany(mappedBy="community")
//    private List<EmailDetail> listOfEmaildetail ; 
//
//    @OneToMany(mappedBy="community")
//    private List<AmenityBooking> listOfAmenitybooking ; 
//
//    @OneToMany(mappedBy="community")
//    private List<Vendor> listOfVendor ; 

    @ManyToOne
    @JoinColumn(name="planId", referencedColumnName="planId", insertable=false, updatable=false)
    private Plan       plan ; 

//    @OneToMany(mappedBy="community")
//    private List<Client> listOfClient ; 

    @ManyToOne
    @JoinColumn(name="contractId", referencedColumnName="contractId", insertable=false, updatable=false)
    private Contract   contract ; 

//    @OneToMany(mappedBy="community")
//    private List<PaymentDetail> listOfPaymentdetail ; 
//
//    @OneToMany(mappedBy="community")
//    private List<BankDetail> listOfBankdetail ; 
//
//    @OneToMany(mappedBy="community")
//    private List<Amenity> listOfAmenity ; 
//
//    @OneToMany(mappedBy="community")
//    private List<ViolationDetail> listOfViolationdetail ; 

    @ManyToOne
    @JoinColumn(name="addressID", referencedColumnName="addressId", insertable=false, updatable=false)
    private Address    address ; 


    /**
     * Constructor
     */
    public Community() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setCommunitycode( String communitycode ) {
        this.communityCode = communitycode ;
    }
    public String getCommunitycode() {
        return this.communityCode;
    }

    public void setAddressid( Integer addressid ) {
        this.addressid = addressid ;
    }
    public Integer getAddressid() {
        return this.addressid;
    }

    public void setPresidentemailid( String presidentemailid ) {
        this.presidentemailid = presidentemailid ;
    }
    public String getPresidentemailid() {
        return this.presidentemailid;
    }

    public void setPresidentinvitestatus( String presidentinvitestatus ) {
        this.presidentinvitestatus = presidentinvitestatus ;
    }
    public String getPresidentinvitestatus() {
        return this.presidentinvitestatus;
    }

    public void setPresidentuserid( Integer presidentuserid ) {
        this.presidentuserid = presidentuserid ;
    }
    public Integer getPresidentuserid() {
        return this.presidentuserid;
    }

    public void setSecretaryemailid( String secretaryemailid ) {
        this.secretaryemailid = secretaryemailid ;
    }
    public String getSecretaryemailid() {
        return this.secretaryemailid;
    }

    public void setSecretaryinvitestatus( String secretaryinvitestatus ) {
        this.secretaryinvitestatus = secretaryinvitestatus ;
    }
    public String getSecretaryinvitestatus() {
        return this.secretaryinvitestatus;
    }

    public void setSecretaryuserid( Integer secretaryuserid ) {
        this.secretaryuserid = secretaryuserid ;
    }
    public Integer getSecretaryuserid() {
        return this.secretaryuserid;
    }

    public void setTreasureremailid( String treasureremailid ) {
        this.treasureremailid = treasureremailid ;
    }
    public String getTreasureremailid() {
        return this.treasureremailid;
    }

    public void setTreasurerinvitestatus( String treasurerinvitestatus ) {
        this.treasurerinvitestatus = treasurerinvitestatus ;
    }
    public String getTreasurerinvitestatus() {
        return this.treasurerinvitestatus;
    }

    public void setTreasureruserid( Integer treasureruserid ) {
        this.treasureruserid = treasureruserid ;
    }
    public Integer getTreasureruserid() {
        return this.treasureruserid;
    }

    public void setPlanid( Integer planid ) {
        this.planid = planid ;
    }
    public Integer getPlanid() {
        return this.planid;
    }

    public void setLicensestatus( String licensestatus ) {
        this.licensestatus = licensestatus ;
    }
    public String getLicensestatus() {
        return this.licensestatus;
    }

    public void setCommunitysize( Integer communitysize ) {
        this.communitysize = communitysize ;
    }
    public Integer getCommunitysize() {
        return this.communitysize;
    }

    public void setPlanexpiredate( Date planexpiredate ) {
        this.planexpiredate = planexpiredate ;
    }
    public Date getPlanexpiredate() {
        return this.planexpiredate;
    }

    public void setContactperson( String contactperson ) {
        this.contactperson = contactperson ;
    }
    public String getContactperson() {
        return this.contactperson;
    }

    public void setTotalowners( Integer totalowners ) {
        this.totalowners = totalowners ;
    }
    public Integer getTotalowners() {
        return this.totalowners;
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

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedbyid = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedbyid;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifieddate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifieddate;
    }

    public void setTimezone( String timezone ) {
        this.timezone = timezone ;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public void setContractid( Integer contractid ) {
        this.contractid = contractid ;
    }
    public Integer getContractid() {
        return this.contractid;
    }

    //--- GETTERS FOR LINKS
//    public List<HoaFee> getListOfHoafee() {
//        return this.listOfHoafee;
//    } 
//
//    public List<Faq> getListOfFaq() {
//        return this.listOfFaq;
//    } 
//
//    public List<ServiceRequest> getListOfServicerequest() {
//        return this.listOfServicerequest;
//    } 
//
//    public List<Violation> getListOfViolation() {
//        return this.listOfViolation;
//    } 
//
//    public List<CommunityDocument> getListOfCommunitydocument() {
//        return this.listOfCommunitydocument;
//    } 
//
//    public List<News> getListOfNews() {
//        return this.listOfNews;
//    } 
//
//    public List<AuditLog> getListOfAuditlog() {
//        return this.listOfAuditlog;
//    } 
//
//    public List<EmailDetail> getListOfEmaildetail() {
//        return this.listOfEmaildetail;
//    } 
//
//    public List<AmenityBooking> getListOfAmenitybooking() {
//        return this.listOfAmenitybooking;
//    } 
//
//    public List<Vendor> getListOfVendor() {
//        return this.listOfVendor;
//    } 
//
//    public Plan getPlan() {
//        return this.plan;
//    } 
//
//    public List<Client> getListOfClient() {
//        return this.listOfClient;
//    } 
//
//    public Contract getContract() {
//        return this.contract;
//    } 
//
//    public List<PaymentDetail> getListOfPaymentdetail() {
//        return this.listOfPaymentdetail;
//    } 
//
//    public List<BankDetail> getListOfBankdetail() {
//        return this.listOfBankdetail;
//    } 
//
//    public List<Amenity> getListOfAmenity() {
//        return this.listOfAmenity;
//    } 
//
//    public List<ViolationDetail> getListOfViolationdetail() {
//        return this.listOfViolationdetail;
//    } 

    public Address getAddress() {
        return this.address;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(communityid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(communityCode);
        sb.append("|");
        sb.append(addressid);
        sb.append("|");
        sb.append(presidentemailid);
        sb.append("|");
        sb.append(presidentinvitestatus);
        sb.append("|");
        sb.append(presidentuserid);
        sb.append("|");
        sb.append(secretaryemailid);
        sb.append("|");
        sb.append(secretaryinvitestatus);
        sb.append("|");
        sb.append(secretaryuserid);
        sb.append("|");
        sb.append(treasureremailid);
        sb.append("|");
        sb.append(treasurerinvitestatus);
        sb.append("|");
        sb.append(treasureruserid);
        sb.append("|");
        sb.append(planid);
        sb.append("|");
        sb.append(licensestatus);
        sb.append("|");
        sb.append(communitysize);
        sb.append("|");
        sb.append(planexpiredate);
        sb.append("|");
        sb.append(contactperson);
        sb.append("|");
        sb.append(totalowners);
        sb.append("|");
        sb.append(activestatus);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(modifieddate);
        sb.append("|");
        sb.append(timezone);
        sb.append("|");
        sb.append(contractid);
        return sb.toString(); 
    } 

}
