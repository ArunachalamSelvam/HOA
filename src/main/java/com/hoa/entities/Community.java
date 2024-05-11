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
    private Integer    communityId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", length=128)
    private String     name ;

    @Column(name="communityCode", length=255)
    private String     communityCode ;

    @Column(name="addressID")
    private Integer    addressId ;

    @Column(name="presidentEmailID", length=128)
    private String     presidentEmailID ;

    @Column(name="presidentInviteStatus", length=128)
    private String     presidentInviteStatus ;

    @Column(name="presidentUserId")
    private Integer    presidentUserId ;

    @Column(name="secretaryEmailID", length=128)
    private String     secretaryEmailID ;

    @Column(name="secretaryInviteStatus", length=128)
    private String     secretaryInviteStatus ;

    @Column(name="secretaryUserID")
    private Integer    secretaryUserID ;

    @Column(name="treasurerEmailID", length=128)
    private String     treasurerEmailID ;

    @Column(name="treasurerInviteStatus", length=128)
    private String     treasurerInviteStatus ;

    @Column(name="treasurerUserID")
    private Integer    treasurerUserID ;

    @Column(name="planId")
    private Integer    planId ;

    @Column(name="licenseStatus", length=128)
    private String     licenseStatus ;

    @Column(name="communitySize")
    private Integer    communitySize ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="planExpireDate")
    private Date       planExpireDate ;

    @Column(name="contactPerson", length=128)
    private String     contactPerson ;

    @Column(name="totalOwners")
    private Integer    totalOwners ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;

    @Column(name="createdById", nullable=false)
    private Integer    createdById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;

    @Column(name="modifiedById")
    private Integer    modifiedById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifiedDate ;

    @Column(name="timeZone", length=2147483647)
    private String     timeZone ;

    @Column(name="contractId")
    private Integer    contractId ;


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
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
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
        this.addressId = addressid ;
    }
    public Integer getAddressid() {
        return this.addressId;
    }

    public void setPresidentemailid( String presidentemailid ) {
        this.presidentEmailID = presidentemailid ;
    }
    public String getPresidentemailid() {
        return this.presidentEmailID;
    }

    public void setPresidentinvitestatus( String presidentinvitestatus ) {
        this.presidentInviteStatus = presidentinvitestatus ;
    }
    public String getPresidentinvitestatus() {
        return this.presidentInviteStatus;
    }

    public void setPresidentuserid( Integer presidentuserid ) {
        this.presidentUserId = presidentuserid ;
    }
    public Integer getPresidentuserid() {
        return this.presidentUserId;
    }

    public void setSecretaryemailid( String secretaryemailid ) {
        this.secretaryEmailID = secretaryemailid ;
    }
    public String getSecretaryemailid() {
        return this.secretaryEmailID;
    }

    public void setSecretaryinvitestatus( String secretaryinvitestatus ) {
        this.secretaryInviteStatus = secretaryinvitestatus ;
    }
    public String getSecretaryinvitestatus() {
        return this.secretaryInviteStatus;
    }

    public void setSecretaryuserid( Integer secretaryuserid ) {
        this.secretaryUserID = secretaryuserid ;
    }
    public Integer getSecretaryuserid() {
        return this.secretaryUserID;
    }

    public void setTreasureremailid( String treasureremailid ) {
        this.treasurerEmailID = treasureremailid ;
    }
    public String getTreasureremailid() {
        return this.treasurerEmailID;
    }

    public void setTreasurerinvitestatus( String treasurerinvitestatus ) {
        this.treasurerInviteStatus = treasurerinvitestatus ;
    }
    public String getTreasurerinvitestatus() {
        return this.treasurerInviteStatus;
    }

    public void setTreasureruserid( Integer treasureruserid ) {
        this.treasurerUserID = treasureruserid ;
    }
    public Integer getTreasureruserid() {
        return this.treasurerUserID;
    }

    public void setPlanid( Integer planid ) {
        this.planId = planid ;
    }
    public Integer getPlanid() {
        return this.planId;
    }

    public void setLicensestatus( String licensestatus ) {
        this.licenseStatus = licensestatus ;
    }
    public String getLicensestatus() {
        return this.licenseStatus;
    }

    public void setCommunitysize( Integer communitysize ) {
        this.communitySize = communitysize ;
    }
    public Integer getCommunitysize() {
        return this.communitySize;
    }

    public void setPlanexpiredate( Date planexpiredate ) {
        this.planExpireDate = planexpiredate ;
    }
    public Date getPlanexpiredate() {
        return this.planExpireDate;
    }

    public void setContactperson( String contactperson ) {
        this.contactPerson = contactperson ;
    }
    public String getContactperson() {
        return this.contactPerson;
    }

    public void setTotalowners( Integer totalowners ) {
        this.totalOwners = totalowners ;
    }
    public Integer getTotalowners() {
        return this.totalOwners;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdById = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdById;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedById = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedById;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifiedDate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifiedDate;
    }

    public void setTimezone( String timezone ) {
        this.timeZone = timezone ;
    }
    public String getTimezone() {
        return this.timeZone;
    }

    public void setContractid( Integer contractid ) {
        this.contractId = contractid ;
    }
    public Integer getContractid() {
        return this.contractId;
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
        sb.append(communityId);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(communityCode);
        sb.append("|");
        sb.append(addressId);
        sb.append("|");
        sb.append(presidentEmailID);
        sb.append("|");
        sb.append(presidentInviteStatus);
        sb.append("|");
        sb.append(presidentUserId);
        sb.append("|");
        sb.append(secretaryEmailID);
        sb.append("|");
        sb.append(secretaryInviteStatus);
        sb.append("|");
        sb.append(secretaryUserID);
        sb.append("|");
        sb.append(treasurerEmailID);
        sb.append("|");
        sb.append(treasurerInviteStatus);
        sb.append("|");
        sb.append(treasurerUserID);
        sb.append("|");
        sb.append(planId);
        sb.append("|");
        sb.append(licenseStatus);
        sb.append("|");
        sb.append(communitySize);
        sb.append("|");
        sb.append(planExpireDate);
        sb.append("|");
        sb.append(contactPerson);
        sb.append("|");
        sb.append(totalOwners);
        sb.append("|");
        sb.append(activeStatus);
        sb.append("|");
        sb.append(createdById);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(modifiedById);
        sb.append("|");
        sb.append(modifiedDate);
        sb.append("|");
        sb.append(timeZone);
        sb.append("|");
        sb.append(contractId);
        return sb.toString(); 
    } 

}
