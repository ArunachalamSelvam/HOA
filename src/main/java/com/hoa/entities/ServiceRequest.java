package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Servicerequest"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="ServiceRequest", schema="public" )
public class ServiceRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="serviceRequestId", nullable=false)
    private Integer    serviceRequestId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="serviceTypeId", nullable=false)
    private Integer    serviceTypeId ;

    @Column(name="requestedClientID", nullable=false)
    private Integer    requestedClientID ;

    @Column(name="description", length=500)
    private String     description ;

    @Column(name="communityID", nullable=false)
    private Integer    communityId ;

    @Column(name="vendorID")
    private Integer    vendorId ;

    @Column(name="createdByID", nullable=false)
    private Integer    createdByID ;

    @Column(name="modifiedByID")
    private Integer    modifiedByID ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifiedDate ;

    @Column(name="serviceCharge")
    private Double     serviceCharge ;

    @Column(name="serviceStatus", length=2147483647)
    private String     serviceStatus ;

    @Column(name="paymentStatus", length=2147483647)
    private String     paymentStatus ;

    @Column(name="paymentDetailId")
    private Integer    paymentDetailId ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="requestedClientID", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 

    @ManyToOne
    @JoinColumn(name="vendorID", referencedColumnName="vendorId", insertable=false, updatable=false)
    private Vendor     vendor ; 

    @ManyToOne
    @JoinColumn(name="serviceTypeId", referencedColumnName="id", insertable=false, updatable=false)
    private ServiceType serviceType ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="paymentDetailId", referencedColumnName="paymentDetailId", insertable=false, updatable=false)
    private PaymentDetail paymentDetail ; 

    @OneToMany(mappedBy="servicerequest")
    private List<ServiceRequestNote> listOfServicerequestnote ; 


    /**
     * Constructor
     */
    public ServiceRequest() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setServicerequestid( Integer servicerequestid ) {
        this.serviceRequestId = servicerequestid ;
    }
    public Integer getServicerequestid() {
        return this.serviceRequestId;
    }

    public void setServicetypeid( Integer servicetypeid ) {
        this.serviceTypeId = servicetypeid ;
    }
    public Integer getServicetypeid() {
        return this.serviceTypeId;
    }

    public void setRequestedclientid( Integer requestedclientid ) {
        this.requestedClientID = requestedclientid ;
    }
    public Integer getRequestedclientid() {
        return this.requestedClientID;
    }

    public void setDescription( String description ) {
        this.description = description ;
    }
    public String getDescription() {
        return this.description;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setVendorid( Integer vendorid ) {
        this.vendorId = vendorid ;
    }
    public Integer getVendorid() {
        return this.vendorId;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdByID = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdByID;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedByID = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedByID;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifiedDate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifiedDate;
    }

    public void setServicecharge( Double servicecharge ) {
        this.serviceCharge = servicecharge ;
    }
    public Double getServicecharge() {
        return this.serviceCharge;
    }

    public void setServicestatus( String servicestatus ) {
        this.serviceStatus = servicestatus ;
    }
    public String getServicestatus() {
        return this.serviceStatus;
    }

    public void setPaymentstatus( String paymentstatus ) {
        this.paymentStatus = paymentstatus ;
    }
    public String getPaymentstatus() {
        return this.paymentStatus;
    }

    public void setPaymentdetailid( Integer paymentdetailid ) {
        this.paymentDetailId = paymentdetailid ;
    }
    public Integer getPaymentdetailid() {
        return this.paymentDetailId;
    }

    //--- GETTERS FOR LINKS
    public User getUser2() {
        return this.user2;
    } 

    public Client getClient() {
        return this.client;
    } 

    public Vendor getVendor() {
        return this.vendor;
    } 

    public ServiceType getServicetype() {
        return this.serviceType;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

    public PaymentDetail getPaymentdetail() {
        return this.paymentDetail;
    } 

    public List<ServiceRequestNote> getListOfServicerequestnote() {
        return this.listOfServicerequestnote;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(serviceRequestId);
        sb.append("|");
        sb.append(serviceTypeId);
        sb.append("|");
        sb.append(requestedClientID);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(vendorId);
        sb.append("|");
        sb.append(createdByID);
        sb.append("|");
        sb.append(modifiedByID);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(modifiedDate);
        sb.append("|");
        sb.append(serviceCharge);
        sb.append("|");
        sb.append(serviceStatus);
        sb.append("|");
        sb.append(paymentStatus);
        sb.append("|");
        sb.append(paymentDetailId);
        return sb.toString(); 
    } 

}
