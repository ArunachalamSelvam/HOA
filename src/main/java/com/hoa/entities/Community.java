package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * JPA entity class for "Community"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name = "Community", schema = "public")
public class Community implements Serializable {

	private static final long serialVersionUID = 1L;

	// --- ENTITY PRIMARY KEY
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "communityID", nullable = false)
	private Integer communityId;

	// --- ENTITY DATA FIELDS
	@Column(name = "name", length = 128)
	private String name;

	@Column(name = "communityCode", length = 255)
	private String communityCode;

	@Column(name = "addressID")
	private Integer addressId;

	@Column(name = "presidentEmailID", length = 128)
	private String presidentEmailID;

	@Column(name = "presidentInviteStatus", length = 128)
	private String presidentInviteStatus;

	@Column(name = "presidentUserId")
	private Integer presidentUserId;

	@Column(name = "secretaryEmailID", length = 128)
	private String secretaryEmailID;

	@Column(name = "secretaryInviteStatus", length = 128)
	private String secretaryInviteStatus;

	@Column(name = "secretaryUserID")
	private Integer secretaryUserID;

	@Column(name = "treasurerEmailID", length = 128)
	private String treasurerEmailID;

	@Column(name = "treasurerInviteStatus", length = 128)
	private String treasurerInviteStatus;

	@Column(name = "adminUserID")
	private Integer adminUserID;

	@Column(name = "adminEmailID", length = 128)
	private String adminEmailID;

	@Column(name = "adminInviteStatus", length = 128)
	private String adminInviteStatus;

	@Column(name = "treasurerUserID")
	private Integer treasurerUserID;

	@Column(name = "planId")
	private Integer planId;

	@Column(name = "licenseStatus", length = 128)
	private String licenseStatus;

	@Column(name = "communitySize")
	private Integer communitySize;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "planExpireDate")
	private Date planExpireDate;

	@Column(name = "contactPerson", length = 128)
	private String contactPerson;

	@Column(name = "totalOwners")
	private Integer totalOwners;

	@Column(name = "activeStatus")
	private Boolean activeStatus;

	@Column(name = "createdById", nullable = false)
	private Integer createdById;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdDate", nullable = false)
	private Date createdDate;

	@Column(name = "modifiedById")
	private Integer modifiedById;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate")
	private Date modifiedDate;

	@Column(name = "timeZone", length = 2147483647)
	private String timeZone;

	@Column(name = "contractId")
	private Integer contractId;

	// --- ENTITY LINKS ( RELATIONSHIP )
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
	@JoinColumn(name = "planId", referencedColumnName = "planId", insertable = false, updatable = false)
	private Plan plan;

//    @OneToMany(mappedBy="community")
//    private List<Client> listOfClient ; 

	@ManyToOne
	@JoinColumn(name = "contractId", referencedColumnName = "contractId", insertable = false, updatable = false)
	@JsonBackReference
	private Contract contract;

	@ManyToOne
	@JoinColumn(name = "presidentUserId", referencedColumnName = "userId", insertable = false, updatable = false)
	private User president;

	@ManyToOne
	@JoinColumn(name = "treasurerUserID", referencedColumnName = "userId", insertable = false, updatable = false)
	private User treasurer;

	@ManyToOne
	@JoinColumn(name = "secretaryUserID", referencedColumnName = "userId", insertable = false, updatable = false)
	private User secretary;

	@ManyToOne
	@JoinColumn(name = "adminUserID", referencedColumnName = "userId", insertable = false, updatable = false)
	private User admin;

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
	@JoinColumn(name = "addressID", referencedColumnName = "addressId", insertable = false, updatable = false)
	private Address address;

	/**
	 * Constructor
	 */
	public Community() {
		super();
	}

	// --- GETTERS & SETTERS FOR FIELDS

	// --- GETTERS FOR LINKS
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

	// --- toString specific method
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

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getPresidentEmailID() {
		return presidentEmailID;
	}

	public void setPresidentEmailID(String presidentEmailID) {
		this.presidentEmailID = presidentEmailID;
	}

	public String getPresidentInviteStatus() {
		return presidentInviteStatus;
	}

	public void setPresidentInviteStatus(String presidentInviteStatus) {
		this.presidentInviteStatus = presidentInviteStatus;
	}

	public Integer getPresidentUserId() {
		return presidentUserId;
	}

	public void setPresidentUserId(Integer presidentUserId) {
		this.presidentUserId = presidentUserId;
	}

	public String getSecretaryEmailID() {
		return secretaryEmailID;
	}

	public void setSecretaryEmailID(String secretaryEmailID) {
		this.secretaryEmailID = secretaryEmailID;
	}

	public String getSecretaryInviteStatus() {
		return secretaryInviteStatus;
	}

	public void setSecretaryInviteStatus(String secretaryInviteStatus) {
		this.secretaryInviteStatus = secretaryInviteStatus;
	}

	public Integer getSecretaryUserID() {
		return secretaryUserID;
	}

	public void setSecretaryUserID(Integer secretaryUserID) {
		this.secretaryUserID = secretaryUserID;
	}

	public String getTreasurerEmailID() {
		return treasurerEmailID;
	}

	public void setTreasurerEmailID(String treasurerEmailID) {
		this.treasurerEmailID = treasurerEmailID;
	}

	public String getTreasurerInviteStatus() {
		return treasurerInviteStatus;
	}

	public void setTreasurerInviteStatus(String treasurerInviteStatus) {
		this.treasurerInviteStatus = treasurerInviteStatus;
	}

	public Integer getAdminUserID() {
		return adminUserID;
	}

	public void setAdminUserID(Integer adminUserID) {
		this.adminUserID = adminUserID;
	}

	public String getAdminEmailID() {
		return adminEmailID;
	}

	public void setAdminEmailID(String adminEmailID) {
		this.adminEmailID = adminEmailID;
	}

	public String getAdminInviteStatus() {
		return adminInviteStatus;
	}

	public void setAdminInviteStatus(String adminInviteStatus) {
		this.adminInviteStatus = adminInviteStatus;
	}

	public Integer getTreasurerUserID() {
		return treasurerUserID;
	}

	public void setTreasurerUserID(Integer treasurerUserID) {
		this.treasurerUserID = treasurerUserID;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getLicenseStatus() {
		return licenseStatus;
	}

	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}

	public Integer getCommunitySize() {
		return communitySize;
	}

	public void setCommunitySize(Integer communitySize) {
		this.communitySize = communitySize;
	}

	public Date getPlanExpireDate() {
		return planExpireDate;
	}

	public void setPlanExpireDate(Date planExpireDate) {
		this.planExpireDate = planExpireDate;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Integer getTotalOwners() {
		return totalOwners;
	}

	public void setTotalOwners(Integer totalOwners) {
		this.totalOwners = totalOwners;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getCreatedById() {
		return createdById;
	}

	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getModifiedById() {
		return modifiedById;
	}

	public void setModifiedById(Integer modifiedById) {
		this.modifiedById = modifiedById;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public User getPresident() {
		return president;
	}

	public void setPresident(User president) {
		this.president = president;
	}

	public User getTreasurer() {
		return treasurer;
	}

	public void setTreasurer(User treasurer) {
		this.treasurer = treasurer;
	}

	public User getSecretary() {
		return secretary;
	}

	public void setSecretary(User secretary) {
		this.secretary = secretary;
	}

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
