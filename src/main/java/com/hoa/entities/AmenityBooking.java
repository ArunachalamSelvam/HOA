package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Amenitybooking"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="AmenityBooking", schema="public" )
public class AmenityBooking implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="amenityBookingId", nullable=false)
    private Integer    amenityBookingId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="amenityID", nullable=false)
    private Integer    amenityId ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="bookingDate", nullable=false)
    private Date       bookingDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="bookingStart", nullable=false)
    private Date       bookingStart ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="bookingEnd", nullable=false)
    private Date       bookingEnd ;

    @Column(name="communityID", nullable=false)
    private Integer    communityId ;

    @Column(name="bookedUserID", nullable=false)
    private Integer    bookedUserId ;

    @Column(name="bookedForClientID")
    private Integer    bookedForClientId ;

    @Column(name="createdByID", nullable=false)
    private Integer    createdById ;

    @Column(name="modifiedByID")
    private Integer    modifiedById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifiedDate ;

    @Column(name="amount", nullable=false)
    private Double     amount ;

    @Column(name="paymentStatus", nullable=false, length=128)
    private String     paymentStatus ;

    @Column(name="paymentDetailId")
    private Integer    paymentDetailId ;


    @Column(name="bookingStatus", nullable=false, length=128)
    private String     bookingStatus ;
    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user3 ; 

    @ManyToOne
    @JoinColumn(name="amenityID", referencedColumnName="amenityId", insertable=false, updatable=false)
    private Amenity    amenity ; 

    @ManyToOne
    @JoinColumn(name="bookedUserID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="paymentDetailId", referencedColumnName="paymentDetailId", insertable=false, updatable=false)
    private PaymentDetail paymentDetail ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 


    /**
     * Constructor
     */
    public AmenityBooking() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setAmenitybookingid( Integer amenitybookingid ) {
        this.amenityBookingId = amenitybookingid ;
    }
    public Integer getAmenitybookingid() {
        return this.amenityBookingId;
    }

    public void setAmenityid( Integer amenityid ) {
        this.amenityId = amenityid ;
    }
    public Integer getAmenityid() {
        return this.amenityId;
    }

    public void setBookingdate( Date bookingdate ) {
        this.bookingDate = bookingdate ;
    }
    public Date getBookingdate() {
        return this.bookingDate;
    }

    public void setBookingstart( Date bookingstart ) {
        this.bookingStart = bookingstart ;
    }
    public Date getBookingstart() {
        return this.bookingStart;
    }

    public void setBookingend( Date bookingend ) {
        this.bookingEnd = bookingend ;
    }
    public Date getBookingend() {
        return this.bookingEnd;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setBookeduserid( Integer bookeduserid ) {
        this.bookedUserId = bookeduserid ;
    }
    public Integer getBookeduserid() {
        return this.bookedUserId;
    }

    public void setBookedforclientid( Integer bookedforclientid ) {
        this.bookedForClientId = bookedforclientid ;
    }
    public Integer getBookedforclientid() {
        return this.bookedForClientId;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdById = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdById;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedById = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedById;
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

    public void setAmount( Double amount ) {
        this.amount = amount ;
    }
    public Double getAmount() {
        return this.amount;
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
    public User getUser3() {
        return this.user3;
    } 

    public Amenity getAmenity() {
        return this.amenity;
    } 

    public User getUser() {
        return this.user;
    } 

    public PaymentDetail getPaymentdetail() {
        return this.paymentDetail;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser2() {
        return this.user2;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(amenityBookingId);
        sb.append("|");
        sb.append(amenityId);
        sb.append("|");
        sb.append(bookingDate);
        sb.append("|");
        sb.append(bookingStart);
        sb.append("|");
        sb.append(bookingEnd);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(bookedUserId);
        sb.append("|");
        sb.append(bookedForClientId);
        sb.append("|");
        sb.append(createdById);
        sb.append("|");
        sb.append(modifiedById);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(modifiedDate);
        sb.append("|");
        sb.append(amount);
        sb.append("|");
        sb.append(paymentStatus);
        sb.append("|");
        sb.append(paymentDetailId);
        return sb.toString(); 
    } 

}
