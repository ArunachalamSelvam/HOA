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
    private Integer    servicerequestid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="serviceTypeId", nullable=false)
    private Integer    servicetypeid ;

    @Column(name="requestedClientID", nullable=false)
    private Integer    requestedclientid ;

    @Column(name="description", length=500)
    private String     description ;

    @Column(name="communityID", nullable=false)
    private Integer    communityid ;

    @Column(name="vendorID")
    private Integer    vendorid ;

    @Column(name="createdByID", nullable=false)
    private Integer    createdbyid ;

    @Column(name="modifiedByID")
    private Integer    modifiedbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifieddate ;

    @Column(name="serviceCharge")
    private Double     servicecharge ;

    @Column(name="serviceStatus", length=2147483647)
    private String     servicestatus ;

    @Column(name="paymentStatus", length=2147483647)
    private String     paymentstatus ;

    @Column(name="paymentDetailId")
    private Integer    paymentdetailid ;


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
    private ServiceType servicetype ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="paymentDetailId", referencedColumnName="paymentDetailId", insertable=false, updatable=false)
    private PaymentDetail paymentdetail ; 

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
        this.servicerequestid = servicerequestid ;
    }
    public Integer getServicerequestid() {
        return this.servicerequestid;
    }

    public void setServicetypeid( Integer servicetypeid ) {
        this.servicetypeid = servicetypeid ;
    }
    public Integer getServicetypeid() {
        return this.servicetypeid;
    }

    public void setRequestedclientid( Integer requestedclientid ) {
        this.requestedclientid = requestedclientid ;
    }
    public Integer getRequestedclientid() {
        return this.requestedclientid;
    }

    public void setDescription( String description ) {
        this.description = description ;
    }
    public String getDescription() {
        return this.description;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setVendorid( Integer vendorid ) {
        this.vendorid = vendorid ;
    }
    public Integer getVendorid() {
        return this.vendorid;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdbyid = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdbyid;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedbyid = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedbyid;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifieddate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifieddate;
    }

    public void setServicecharge( Double servicecharge ) {
        this.servicecharge = servicecharge ;
    }
    public Double getServicecharge() {
        return this.servicecharge;
    }

    public void setServicestatus( String servicestatus ) {
        this.servicestatus = servicestatus ;
    }
    public String getServicestatus() {
        return this.servicestatus;
    }

    public void setPaymentstatus( String paymentstatus ) {
        this.paymentstatus = paymentstatus ;
    }
    public String getPaymentstatus() {
        return this.paymentstatus;
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

    public Client getClient() {
        return this.client;
    } 

    public Vendor getVendor() {
        return this.vendor;
    } 

    public ServiceType getServicetype() {
        return this.servicetype;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

    public PaymentDetail getPaymentdetail() {
        return this.paymentdetail;
    } 

    public List<ServiceRequestNote> getListOfServicerequestnote() {
        return this.listOfServicerequestnote;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(servicerequestid);
        sb.append("|");
        sb.append(servicetypeid);
        sb.append("|");
        sb.append(requestedclientid);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(vendorid);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifieddate);
        sb.append("|");
        sb.append(servicecharge);
        sb.append("|");
        sb.append(servicestatus);
        sb.append("|");
        sb.append(paymentstatus);
        sb.append("|");
        sb.append(paymentdetailid);
        return sb.toString(); 
    } 

}
