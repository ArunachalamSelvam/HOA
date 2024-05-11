package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Violation"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Violation", schema="public" )
public class Violation implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="violationId", nullable=false)
    private Integer    violationId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="violationTypeID", nullable=false)
    private Integer    violationTypeID ;

    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="amount", nullable=false)
    private Double     amount ;

    @Column(name="lateCharge")
    private Double     lateCharge ;

    @Column(name="communityID", nullable=false)
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


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="violationTypeID", referencedColumnName="violationTypeId", insertable=false, updatable=false)
    private ViolationType violationType ; 

    @OneToMany(mappedBy="violation")
    private List<ViolationDetail> listOfViolationDetail ; 

    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public Violation() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setViolationid( Integer violationid ) {
        this.violationId = violationid ;
    }
    public Integer getViolationid() {
        return this.violationId;
    }

    public void setViolationtypeid( Integer violationtypeid ) {
        this.violationTypeID = violationtypeid ;
    }
    public Integer getViolationtypeid() {
        return this.violationTypeID;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
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

    //--- GETTERS FOR LINKS
    public ViolationType getViolationtype() {
        return this.violationType;
    } 

    public List<ViolationDetail> getListOfViolationdetail() {
        return this.listOfViolationDetail;
    } 

    public User getUser2() {
        return this.user2;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(violationId);
        sb.append("|");
        sb.append(violationTypeID);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(amount);
        sb.append("|");
        sb.append(lateCharge);
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
        return sb.toString(); 
    } 

}
