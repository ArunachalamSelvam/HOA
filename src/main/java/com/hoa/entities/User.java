package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "User"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="User", schema="public" )
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="userId", nullable=false)
    private Integer    userId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="firstName", nullable=false, length=128)
    private String     firstName ;

    @Column(name="middleName", length=128)
    private String     middleName ;

    @Column(name="lastName", length=128)
    private String     lastName ;

    @Column(name="mobileNumber", nullable=false, length=128)
    private String     mobileNumber ;

    @Column(name="mobileIsVerified")
    private Boolean    mobileIsVerified ;

    @Column(name="emailID", nullable=false, length=128)
    private String     emailId ;

    @Column(name="emailIdIsVerified")
    private Boolean    emailIdIsVerified ;

    @Column(name="isClient")
    private Boolean    isClient ;

    @Column(name="otp")
    private Integer    otp ;

    @Column(name="roleId")
    private Integer    roleId ;

    @Column(name="password", length=256)
    private String     password ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastLogin")
    private Date       lastLogin ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="user")
//    private List<Client> listOfClient ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Hoafee> listOfHoafee2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Address> listOfAddress ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Paymentdetail> listOfPaymentdetail ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Violation> listOfViolation ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Bankdetail> listOfBankdetail2 ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Contract> listOfContract2 ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Violationdetail> listOfViolationdetail2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<News> listOfNews ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Amenity> listOfAmenity ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Paymentdetail> listOfPaymentdetail2 ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Amenity> listOfAmenity2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Vendor> listOfVendor ; 
//
//    @OneToMany(mappedBy="user4")
//    private List<Communitydocument> listOfCommunitydocument4 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Communitydocument> listOfCommunitydocument ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Address> listOfAddress2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Amenitybooking> listOfAmenitybooking ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<News> listOfNews2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Hoafee> listOfHoafee ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Contract> listOfContract ; 

    @ManyToOne
    @JoinColumn(name="roleId", referencedColumnName="roleId", insertable=false, updatable=false)
    private Role       role ; 

//    @OneToMany(mappedBy="user")
//    private List<Servicerequest> listOfServicerequest ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Clientaddress> listOfClientaddress ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Employee> listOfEmployee ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Servicerequest> listOfServicerequest2 ; 
//
//    @OneToMany(mappedBy="user3")
//    private List<Amenitybooking> listOfAmenitybooking3 ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Faq>  listOfFaq2 ; 
//
//    @OneToMany(mappedBy="user3")
//    private List<Communitydocument> listOfCommunitydocument3 ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Amenitybooking> listOfAmenitybooking2 ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Violation> listOfViolation2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Bankdetail> listOfBankdetail ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Vendor> listOfVendor2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Violationdetail> listOfViolationdetail ; 
//
//    @OneToMany(mappedBy="user2")
//    private List<Communitydocument> listOfCommunitydocument2 ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Faq>  listOfFaq ; 
//
//    @OneToMany(mappedBy="user")
//    private List<Auditlog> listOfAuditlog ; 


    /**
     * Constructor
     */
    public User() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setUserid( Integer userid ) {
        this.userId = userid ;
    }
    public Integer getUserid() {
        return this.userId;
    }

    public void setFirstname( String firstname ) {
        this.firstName = firstname ;
    }
    public String getFirstname() {
        return this.firstName;
    }

    public void setMiddlename( String middlename ) {
        this.middleName = middlename ;
    }
    public String getMiddlename() {
        return this.middleName;
    }

    public void setLastname( String lastname ) {
        this.lastName = lastname ;
    }
    public String getLastname() {
        return this.lastName;
    }

    public void setMobilenumber( String mobilenumber ) {
        this.mobileNumber = mobilenumber ;
    }
    public String getMobilenumber() {
        return this.mobileNumber;
    }

    public void setMobileisverified( Boolean mobileisverified ) {
        this.mobileIsVerified = mobileisverified ;
    }
    public Boolean getMobileisverified() {
        return this.mobileIsVerified;
    }

    public void setEmailid( String emailid ) {
        this.emailId = emailid ;
    }
    public String getEmailid() {
        return this.emailId;
    }

    public void setEmailidisverified( Boolean emailidisverified ) {
        this.emailIdIsVerified = emailidisverified ;
    }
    public Boolean getEmailidisverified() {
        return this.emailIdIsVerified;
    }

    public void setIsclient( Boolean isclient ) {
        this.isClient = isclient ;
    }
    public Boolean getIsclient() {
        return this.isClient;
    }

    public void setOtp( Integer otp ) {
        this.otp = otp ;
    }
    public Integer getOtp() {
        return this.otp;
    }

    public void setRoleid( Integer roleid ) {
        this.roleId = roleid ;
    }
    public Integer getRoleid() {
        return this.roleId;
    }

    public void setPassword( String password ) {
        this.password = password ;
    }
    public String getPassword() {
        return this.password;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    public void setLastlogin( Date lastlogin ) {
        this.lastLogin = lastlogin ;
    }
    public Date getLastlogin() {
        return this.lastLogin;
    }

//    //--- GETTERS FOR LINKS
//    public List<Client> getListOfClient() {
//        return this.listOfClient;
//    } 
//
//    public List<Hoafee> getListOfHoafee2() {
//        return this.listOfHoafee2;
//    } 
//
//    public List<Address> getListOfAddress() {
//        return this.listOfAddress;
//    } 
//
//    public List<Paymentdetail> getListOfPaymentdetail() {
//        return this.listOfPaymentdetail;
//    } 
//
//    public List<Violation> getListOfViolation() {
//        return this.listOfViolation;
//    } 
//
//    public List<Bankdetail> getListOfBankdetail2() {
//        return this.listOfBankdetail2;
//    } 
//
//    public List<Contract> getListOfContract2() {
//        return this.listOfContract2;
//    } 
//
//    public List<Violationdetail> getListOfViolationdetail2() {
//        return this.listOfViolationdetail2;
//    } 
//
//    public List<News> getListOfNews() {
//        return this.listOfNews;
//    } 
//
//    public List<Amenity> getListOfAmenity() {
//        return this.listOfAmenity;
//    } 
//
//    public List<Paymentdetail> getListOfPaymentdetail2() {
//        return this.listOfPaymentdetail2;
//    } 
//
//    public List<Amenity> getListOfAmenity2() {
//        return this.listOfAmenity2;
//    } 
//
//    public List<Vendor> getListOfVendor() {
//        return this.listOfVendor;
//    } 
//
//    public List<Communitydocument> getListOfCommunitydocument4() {
//        return this.listOfCommunitydocument4;
//    } 
//
//    public List<Communitydocument> getListOfCommunitydocument() {
//        return this.listOfCommunitydocument;
//    } 
//
//    public List<Address> getListOfAddress2() {
//        return this.listOfAddress2;
//    } 
//
//    public List<Amenitybooking> getListOfAmenitybooking() {
//        return this.listOfAmenitybooking;
//    } 
//
//    public List<News> getListOfNews2() {
//        return this.listOfNews2;
//    } 
//
//    public List<Hoafee> getListOfHoafee() {
//        return this.listOfHoafee;
//    } 
//
//    public List<Contract> getListOfContract() {
//        return this.listOfContract;
//    } 

    public Role getRole() {
        return this.role;
    } 
    
    public void setRole(Role role) {
    	this.role = role;
    }

//    public List<Servicerequest> getListOfServicerequest() {
//        return this.listOfServicerequest;
//    } 
//
//    public List<Clientaddress> getListOfClientaddress() {
//        return this.listOfClientaddress;
//    } 
//
//    public List<Employee> getListOfEmployee() {
//        return this.listOfEmployee;
//    } 
//
//    public List<Servicerequest> getListOfServicerequest2() {
//        return this.listOfServicerequest2;
//    } 
//
//    public List<Amenitybooking> getListOfAmenitybooking3() {
//        return this.listOfAmenitybooking3;
//    } 
//
//    public List<Faq> getListOfFaq2() {
//        return this.listOfFaq2;
//    } 
//
//    public List<Communitydocument> getListOfCommunitydocument3() {
//        return this.listOfCommunitydocument3;
//    } 
//
//    public List<Amenitybooking> getListOfAmenitybooking2() {
//        return this.listOfAmenitybooking2;
//    } 
//
//    public List<Violation> getListOfViolation2() {
//        return this.listOfViolation2;
//    } 
//
//    public List<Bankdetail> getListOfBankdetail() {
//        return this.listOfBankdetail;
//    } 
//
//    public List<Vendor> getListOfVendor2() {
//        return this.listOfVendor2;
//    } 
//
//    public List<Violationdetail> getListOfViolationdetail() {
//        return this.listOfViolationdetail;
//    } 
//
//    public List<Communitydocument> getListOfCommunitydocument2() {
//        return this.listOfCommunitydocument2;
//    } 
//
//    public List<Faq> getListOfFaq() {
//        return this.listOfFaq;
//    } 
//
//    public List<Auditlog> getListOfAuditlog() {
//        return this.listOfAuditlog;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(userId);
        sb.append("|");
        sb.append(firstName);
        sb.append("|");
        sb.append(middleName);
        sb.append("|");
        sb.append(lastName);
        sb.append("|");
        sb.append(mobileNumber);
        sb.append("|");
        sb.append(mobileIsVerified);
        sb.append("|");
        sb.append(emailId);
        sb.append("|");
        sb.append(emailIdIsVerified);
        sb.append("|");
        sb.append(isClient);
        sb.append("|");
        sb.append(otp);
        sb.append("|");
        sb.append(roleId);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(activeStatus);
        sb.append("|");
        sb.append(lastLogin);
        return sb.toString(); 
    } 

}
