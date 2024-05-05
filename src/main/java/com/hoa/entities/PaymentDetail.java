package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Paymentdetail"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="PaymentDetail", schema="public" )
public class PaymentDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="paymentDetailId", nullable=false)
    private Integer    paymentdetailid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="clientId")
    private Integer    clientid ;

    @Column(name="communityId")
    private Integer    communityid ;

    @Column(name="paymentType", length=128)
    private String     paymenttype ;

    @Column(name="paymentMethod", length=128)
    private String     paymentmethod ;

    @Column(name="amount")
    private Double     amount ;

    @Column(name="paymentStatus", length=128)
    private String     paymentstatus ;

    @Column(name="isApproved")
    private Boolean    isapproved ;

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

    @Column(name="paymentBank", length=128)
    private String     paymentbank ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="paymentDate")
    private Date       paymentdate ;

    @Column(name="reason", length=255)
    private String     reason ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="paymentdetail")
//    private List<AmenityBooking> listOfAmenitybooking ; 
//
//    @OneToMany(mappedBy="paymentdetail")
//    private List<ServiceRequest> listOfServicerequest ; 

    @ManyToOne
    @JoinColumn(name="modifiedById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

//    @OneToMany(mappedBy="paymentdetail")
//    private List<HoaFee> listOfHoafee ; 

    @ManyToOne
    @JoinColumn(name="clientId", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 
//
//    @OneToMany(mappedBy="paymentdetail")
//    private List<ViolationDetail> listOfViolationdetail ; 


    /**
     * Constructor
     */
    public PaymentDetail() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setPaymentdetailid( Integer paymentdetailid ) {
        this.paymentdetailid = paymentdetailid ;
    }
    public Integer getPaymentdetailid() {
        return this.paymentdetailid;
    }

    public void setClientid( Integer clientid ) {
        this.clientid = clientid ;
    }
    public Integer getClientid() {
        return this.clientid;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setPaymenttype( String paymenttype ) {
        this.paymenttype = paymenttype ;
    }
    public String getPaymenttype() {
        return this.paymenttype;
    }

    public void setPaymentmethod( String paymentmethod ) {
        this.paymentmethod = paymentmethod ;
    }
    public String getPaymentmethod() {
        return this.paymentmethod;
    }

    public void setAmount( Double amount ) {
        this.amount = amount ;
    }
    public Double getAmount() {
        return this.amount;
    }

    public void setPaymentstatus( String paymentstatus ) {
        this.paymentstatus = paymentstatus ;
    }
    public String getPaymentstatus() {
        return this.paymentstatus;
    }

    public void setIsapproved( Boolean isapproved ) {
        this.isapproved = isapproved ;
    }
    public Boolean getIsapproved() {
        return this.isapproved;
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

    public void setPaymentbank( String paymentbank ) {
        this.paymentbank = paymentbank ;
    }
    public String getPaymentbank() {
        return this.paymentbank;
    }

    public void setPaymentdate( Date paymentdate ) {
        this.paymentdate = paymentdate ;
    }
    public Date getPaymentdate() {
        return this.paymentdate;
    }

    public void setReason( String reason ) {
        this.reason = reason ;
    }
    public String getReason() {
        return this.reason;
    }

    //--- GETTERS FOR LINKS
//    public List<AmenityBooking> getListOfAmenitybooking() {
//        return this.listOfAmenitybooking;
//    } 
//
//    public List<ServiceRequest> getListOfServicerequest() {
//        return this.listOfServicerequest;
//    } 

    public User getUser2() {
        return this.user2;
    } 

//    public List<HoaFee> getListOfHoafee() {
//        return this.listOfHoafee;
//    } 

    public Client getClient() {
        return this.client;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

//    public List<ViolationDetail> getListOfViolationdetail() {
//        return this.listOfViolationdetail;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(paymentdetailid);
        sb.append("|");
        sb.append(clientid);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(paymenttype);
        sb.append("|");
        sb.append(paymentmethod);
        sb.append("|");
        sb.append(amount);
        sb.append("|");
        sb.append(paymentstatus);
        sb.append("|");
        sb.append(isapproved);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(modifieddate);
        sb.append("|");
        sb.append(paymentbank);
        sb.append("|");
        sb.append(paymentdate);
        sb.append("|");
        sb.append(reason);
        return sb.toString(); 
    } 

}
