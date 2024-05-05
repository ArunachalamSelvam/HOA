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
    private Integer    bankid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="communityId")
    private Integer    communityid ;

    @Column(name="routingNumber", length=128)
    private String     routingnumber ;

    @Column(name="accountNumber", length=256)
    private String     accountnumber ;

    @Column(name="isVerified")
    private Boolean    isverified ;

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
        this.bankid = bankid ;
    }
    public Integer getBankid() {
        return this.bankid;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setRoutingnumber( String routingnumber ) {
        this.routingnumber = routingnumber ;
    }
    public String getRoutingnumber() {
        return this.routingnumber;
    }

    public void setAccountnumber( String accountnumber ) {
        this.accountnumber = accountnumber ;
    }
    public String getAccountnumber() {
        return this.accountnumber;
    }

    public void setIsverified( Boolean isverified ) {
        this.isverified = isverified ;
    }
    public Boolean getIsverified() {
        return this.isverified;
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
        sb.append(bankid);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(routingnumber);
        sb.append("|");
        sb.append(accountnumber);
        sb.append("|");
        sb.append(isverified);
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
