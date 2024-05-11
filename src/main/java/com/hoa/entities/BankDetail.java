package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Bankdetail"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="BankDetail", schema="public" )
public class BankDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="bankId", nullable=false)
    private Integer    bankId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="communityId")
    private Integer    communityId ;

    @Column(name="routingNumber", length=128)
    private String     routingNumber ;

    @Column(name="accountNumber", length=256)
    private String     accountNumber ;

    @Column(name="isVerified")
    private Boolean    isVerified ;

    @Column(name="createdById", nullable=false)
    private Integer    createdById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;

    @Column(name="modifiedById")
    private Integer    modifiedById ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifiedDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="modifiedById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public BankDetail() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setBankid( Integer bankid ) {
        this.bankId = bankid ;
    }
    public Integer getBankid() {
        return this.bankId;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setRoutingnumber( String routingnumber ) {
        this.routingNumber = routingnumber ;
    }
    public String getRoutingnumber() {
        return this.routingNumber;
    }

    public void setAccountnumber( String accountnumber ) {
        this.accountNumber = accountnumber ;
    }
    public String getAccountnumber() {
        return this.accountNumber;
    }

    public void setIsverified( Boolean isverified ) {
        this.isVerified = isverified ;
    }
    public Boolean getIsverified() {
        return this.isVerified;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdById = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdById;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedById = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedById;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifiedDate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifiedDate;
    }

    //--- GETTERS FOR LINKS
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
        sb.append(bankId);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(routingNumber);
        sb.append("|");
        sb.append(accountNumber);
        sb.append("|");
        sb.append(isVerified);
        sb.append("|");
        sb.append(createdById);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(modifiedById);
        sb.append("|");
        sb.append(modifiedDate);
        return sb.toString(); 
    } 

}
