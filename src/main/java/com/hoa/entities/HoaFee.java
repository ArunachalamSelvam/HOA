package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Hoafee"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="HOAFee", schema="public" )
public class HoaFee implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="hoaFeeId", nullable=false)
    private Integer    hoafeeid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="clientId")
    private Integer    clientid ;

    @Column(name="communityId")
    private Integer    communityid ;

    @Column(name="paymentDetailId")
    private Integer    paymentdetailid ;

    @Column(name="paymentStatus", length=128)
    private String     paymentstatus ;

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


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="modifiedById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="clientId", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 

    @ManyToOne
    @JoinColumn(name="paymentDetailId", referencedColumnName="paymentDetailId", insertable=false, updatable=false)
    private PaymentDetail paymentdetail ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 


    /**
     * Constructor
     */
    public HoaFee() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setHoafeeid( Integer hoafeeid ) {
        this.hoafeeid = hoafeeid ;
    }
    public Integer getHoafeeid() {
        return this.hoafeeid;
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

    public void setPaymentdetailid( Integer paymentdetailid ) {
        this.paymentdetailid = paymentdetailid ;
    }
    public Integer getPaymentdetailid() {
        return this.paymentdetailid;
    }

    public void setPaymentstatus( String paymentstatus ) {
        this.paymentstatus = paymentstatus ;
    }
    public String getPaymentstatus() {
        return this.paymentstatus;
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

    //--- GETTERS FOR LINKS
    public User getUser() {
        return this.user;
    } 

    public User getUser2() {
        return this.user2;
    } 

    public Client getClient() {
        return this.client;
    } 

    public PaymentDetail getPaymentdetail() {
        return this.paymentdetail;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(hoafeeid);
        sb.append("|");
        sb.append(clientid);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(paymentdetailid);
        sb.append("|");
        sb.append(paymentstatus);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(modifieddate);
        return sb.toString(); 
    } 

}
