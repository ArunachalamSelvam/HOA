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
    private Integer    userid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="firstName", nullable=false, length=128)
    private String     firstname ;

    @Column(name="middleName", length=128)
    private String     middlename ;

    @Column(name="lastName", length=128)
    private String     lastname ;

    @Column(name="mobileNumber", nullable=false, length=128)
    private String     mobilenumber ;

    @Column(name="mobileIsVerified")
    private Boolean    mobileisverified ;

    @Column(name="emailID", nullable=false, length=128)
    private String     emailId ;

    @Column(name="emailIdIsVerified")
    private Boolean    emailidisverified ;

    @Column(name="isClient")
    private Boolean    isclient ;

    @Column(name="otp")
    private Integer    otp ;

    @Column(name="roleId")
    private Integer    roleid ;

    @Column(name="password", length=256)
    private String     password ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastLogin")
    private Date       lastlogin ;


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
        this.userid = userid ;
    }
    public Integer getUserid() {
        return this.userid;
    }

    public void setFirstname( String firstname ) {
        this.firstname = firstname ;
    }
    public String getFirstname() {
        return this.firstname;
    }

    public void setMiddlename( String middlename ) {
        this.middlename = middlename ;
    }
    public String getMiddlename() {
        return this.middlename;
    }

    public void setLastname( String lastname ) {
        this.lastname = lastname ;
    }
    public String getLastname() {
        return this.lastname;
    }

    public void setMobilenumber( String mobilenumber ) {
        this.mobilenumber = mobilenumber ;
    }
    public String getMobilenumber() {
        return this.mobilenumber;
    }

    public void setMobileisverified( Boolean mobileisverified ) {
        this.mobileisverified = mobileisverified ;
    }
    public Boolean getMobileisverified() {
        return this.mobileisverified;
    }

    public void setEmailid( String emailid ) {
        this.emailId = emailid ;
    }
    public String getEmailid() {
        return this.emailId;
    }

    public void setEmailidisverified( Boolean emailidisverified ) {
        this.emailidisverified = emailidisverified ;
    }
    public Boolean getEmailidisverified() {
        return this.emailidisverified;
    }

    public void setIsclient( Boolean isclient ) {
        this.isclient = isclient ;
    }
    public Boolean getIsclient() {
        return this.isclient;
    }

    public void setOtp( Integer otp ) {
        this.otp = otp ;
    }
    public Integer getOtp() {
        return this.otp;
    }

    public void setRoleid( Integer roleid ) {
        this.roleid = roleid ;
    }
    public Integer getRoleid() {
        return this.roleid;
    }

    public void setPassword( String password ) {
        this.password = password ;
    }
    public String getPassword() {
        return this.password;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    public void setLastlogin( Date lastlogin ) {
        this.lastlogin = lastlogin ;
    }
    public Date getLastlogin() {
        return this.lastlogin;
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
        sb.append(userid);
        sb.append("|");
        sb.append(firstname);
        sb.append("|");
        sb.append(middlename);
        sb.append("|");
        sb.append(lastname);
        sb.append("|");
        sb.append(mobilenumber);
        sb.append("|");
        sb.append(mobileisverified);
        sb.append("|");
        sb.append(emailId);
        sb.append("|");
        sb.append(emailidisverified);
        sb.append("|");
        sb.append(isclient);
        sb.append("|");
        sb.append(otp);
        sb.append("|");
        sb.append(roleid);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(activestatus);
        sb.append("|");
        sb.append(lastlogin);
        return sb.toString(); 
    } 

}
