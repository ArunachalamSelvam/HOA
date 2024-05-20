package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    private Integer    clientId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="userId", nullable=false)
    private Integer    userId ;

    @Column(name="communityId")
    private Integer    communityId ;

    @Column(name="displayName", length=150)
    private String     displayName ;

    @Column(name="numberOfHouses")
    private Integer    numberOfHouses ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;


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
    @JsonBackReference
    private Community  community ; 


    /**
     * Constructor
     */
    public Client() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setClientid( Integer clientid ) {
        this.clientId = clientid ;
    }
    public Integer getClientid() {
        return this.clientId;
    }

    public void setUserid( Integer userid ) {
        this.userId = userid ;
    }
    public Integer getUserid() {
        return this.userId;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setDisplayname( String displayname ) {
        this.displayName = displayname ;
    }
    public String getDisplayname() {
        return this.displayName;
    }

    public void setNumberofhouses( Integer numberofhouses ) {
        this.numberOfHouses = numberofhouses ;
    }
    public Integer getNumberofhouses() {
        return this.numberOfHouses;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
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
        sb.append(clientId);
        sb.append("|");
        sb.append(userId);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(displayName);
        sb.append("|");
        sb.append(numberOfHouses);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
