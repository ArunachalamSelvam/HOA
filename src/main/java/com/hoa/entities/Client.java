package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Client"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Client", schema="public" )
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="clientId", nullable=false)
    private Integer    clientid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="userId", nullable=false)
    private Integer    userid ;

    @Column(name="communityId")
    private Integer    communityid ;

    @Column(name="displayName", length=150)
    private String     displayname ;

    @Column(name="numberOfHouses")
    private Integer    numberofhouses ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="userId", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

//    @OneToMany(mappedBy="client")
//    private List<ViolationDetail> listOfViolationdetail ; 
//
//    @OneToMany(mappedBy="client")
//    private List<News> listOfNews ; 
//
//    @OneToMany(mappedBy="client")
//    private List<PaymentDetail> listOfPaymentdetail ; 
//
//    @OneToMany(mappedBy="client")
//    private List<EmailSendTo> listOfEmailsendto ; 
//
//    @OneToMany(mappedBy="client")
//    private List<Contract> listOfContract ; 
//
//    @OneToMany(mappedBy="client")
//    private List<ClientAddress> listOfClientaddress ; 
//
//    @OneToMany(mappedBy="client")
//    private List<HoaFee> listOfHoafee ; 
//
//    @OneToMany(mappedBy="client")
//    private List<ServiceRequest> listOfServicerequest ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 


    /**
     * Constructor
     */
    public Client() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setClientid( Integer clientid ) {
        this.clientid = clientid ;
    }
    public Integer getClientid() {
        return this.clientid;
    }

    public void setUserid( Integer userid ) {
        this.userid = userid ;
    }
    public Integer getUserid() {
        return this.userid;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setDisplayname( String displayname ) {
        this.displayname = displayname ;
    }
    public String getDisplayname() {
        return this.displayname;
    }

    public void setNumberofhouses( Integer numberofhouses ) {
        this.numberofhouses = numberofhouses ;
    }
    public Integer getNumberofhouses() {
        return this.numberofhouses;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    //--- GETTERS FOR LINKS
    public User getUser() {
        return this.user;
    } 

//    public List<ViolationDetail> getListOfViolationdetail() {
//        return this.listOfViolationdetail;
//    } 
//
//    public List<News> getListOfNews() {
//        return this.listOfNews;
//    } 
//
//    public List<PaymentDetail> getListOfPaymentdetail() {
//        return this.listOfPaymentdetail;
//    } 
//
//    public List<EmailSendTo> getListOfEmailsendto() {
//        return this.listOfEmailsendto;
//    } 
//
//    public List<Contract> getListOfContract() {
//        return this.listOfContract;
//    } 
//
//    public List<ClientAddress> getListOfClientaddress() {
//        return this.listOfClientaddress;
//    } 
//
//    public List<HoaFee> getListOfHoafee() {
//        return this.listOfHoafee;
//    } 
//
//    public List<ServiceRequest> getListOfServicerequest() {
//        return this.listOfServicerequest;
//    } 

    public Community getCommunity() {
        return this.community;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(clientid);
        sb.append("|");
        sb.append(userid);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(displayname);
        sb.append("|");
        sb.append(numberofhouses);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
