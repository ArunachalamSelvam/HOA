package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Violationdetail"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="ViolationDetail", schema="public" )
public class ViolationDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="violationId", nullable=false)
    private Integer    violationid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="violationDate", nullable=false)
    private Date       violationdate ;

    @Column(name="communityId")
    private Integer    communityid ;

    @Column(name="amount")
    private Double     amount ;

    @Column(name="clientId")
    private Integer    clientid ;

    @Column(name="paymentStatus", length=128)
    private String     paymentstatus ;

    @Column(name="violationStatus", length=128)
    private String     violationstatus ;

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

    @Column(name="paymentDetailId")
    private Integer    paymentdetailid ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="modifiedById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="paymentDetailId", referencedColumnName="paymentDetailId", insertable=false, updatable=false)
    private PaymentDetail paymentdetail ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="violationId", referencedColumnName="violationId", insertable=false, updatable=false)
    private Violation  violation ; 

    @ManyToOne
    @JoinColumn(name="clientId", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 


    /**
     * Constructor
     */
    public ViolationDetail() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    public void setViolationid( Integer violationid ) {
        this.violationid = violationid ;
    }
    public Integer getViolationid() {
        return this.violationid;
    }

    public void setViolationdate( Date violationdate ) {
        this.violationdate = violationdate ;
    }
    public Date getViolationdate() {
        return this.violationdate;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setAmount( Double amount ) {
        this.amount = amount ;
    }
    public Double getAmount() {
        return this.amount;
    }

    public void setClientid( Integer clientid ) {
        this.clientid = clientid ;
    }
    public Integer getClientid() {
        return this.clientid;
    }

    public void setPaymentstatus( String paymentstatus ) {
        this.paymentstatus = paymentstatus ;
    }
    public String getPaymentstatus() {
        return this.paymentstatus;
    }

    public void setViolationstatus( String violationstatus ) {
        this.violationstatus = violationstatus ;
    }
    public String getViolationstatus() {
        return this.violationstatus;
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

    public void setPaymentdetailid( Integer paymentdetailid ) {
        this.paymentdetailid = paymentdetailid ;
    }
    public Integer getPaymentdetailid() {
        return this.paymentdetailid;
    }

    //--- GETTERS FOR LINKS
    public User getUser2() {
        return this.user2;
    } 

    public PaymentDetail getPaymentdetail() {
        return this.paymentdetail;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

    public Violation getViolation() {
        return this.violation;
    } 

    public Client getClient() {
        return this.client;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(violationid);
        sb.append("|");
        sb.append(violationdate);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(amount);
        sb.append("|");
        sb.append(clientid);
        sb.append("|");
        sb.append(paymentstatus);
        sb.append("|");
        sb.append(violationstatus);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(modifieddate);
        sb.append("|");
        sb.append(paymentdetailid);
        return sb.toString(); 
    } 

}
