package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Amenity"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Amenity", schema="public" )
public class Amenity implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="amenityId", nullable=false)
    private Integer    amenityId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="amenityTypeID", nullable=false)
    private Integer    amenityTypeId ;

    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="communityID")
    private Integer    communityId ;

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

    @Column(name="lateCharge")
    private Double     lateCharge ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="amenityTypeID", referencedColumnName="id", insertable=false, updatable=false)
    private AmenityType amenityType ; 

    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

//    @OneToMany(mappedBy="amenity")
//    private List<Amenitybooking> listOfAmenitybooking ; 


    /**
     * Constructor
     */
    public Amenity() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setAmenityid( Integer amenityid ) {
        this.amenityId = amenityid ;
    }
    public Integer getAmenityid() {
        return this.amenityId;
    }

    public void setAmenitytypeid( Integer amenitytypeid ) {
        this.amenityTypeId = amenitytypeid ;
    }
    public Integer getAmenitytypeid() {
        return this.amenityTypeId;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
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

    public void setLatecharge( Double latecharge ) {
        this.lateCharge = latecharge ;
    }
    public Double getLatecharge() {
        return this.lateCharge;
    }

    //--- GETTERS FOR LINKS
    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

    public AmenityType getAmenitytype() {
        return this.amenityType;
    } 

    public User getUser2() {
        return this.user2;
    } 

//    public List<Amenitybooking> getListOfAmenitybooking() {
//        return this.listOfAmenitybooking;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(amenityId);
        sb.append("|");
        sb.append(amenityTypeId);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(communityId);
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
        sb.append(lateCharge);
        return sb.toString(); 
    } 

}
