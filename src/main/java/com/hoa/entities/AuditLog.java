package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Auditlog"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="AuditLog", schema="public" )
public class AuditLog implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="auditLogId", nullable=false)
    private Integer    auditLogId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="userId", nullable=false)
    private Integer    userId ;

    @Column(name="actionPerformed", length=255)
    private String     actionPerformed ;

    @Column(name="pageName", length=128)
    private String     pageName ;

    @Column(name="communityId")
    private Integer    communityId ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="userId", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 


    /**
     * Constructor
     */
    public AuditLog() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setAuditlogid( Integer auditlogid ) {
        this.auditLogId = auditlogid ;
    }
    public Integer getAuditlogid() {
        return this.auditLogId;
    }

    public void setUserid( Integer userid ) {
        this.userId = userid ;
    }
    public Integer getUserid() {
        return this.userId;
    }

    public void setActionperformed( String actionperformed ) {
        this.actionPerformed = actionperformed ;
    }
    public String getActionperformed() {
        return this.actionPerformed;
    }

    public void setPagename( String pagename ) {
        this.pageName = pagename ;
    }
    public String getPagename() {
        return this.pageName;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    //--- GETTERS FOR LINKS
    public User getUser() {
        return this.user;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(auditLogId);
        sb.append("|");
        sb.append(userId);
        sb.append("|");
        sb.append(actionPerformed);
        sb.append("|");
        sb.append(pageName);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(createdDate);
        return sb.toString(); 
    } 

}
