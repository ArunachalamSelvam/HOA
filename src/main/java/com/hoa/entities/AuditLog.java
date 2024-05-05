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
    private Integer    auditlogid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="userId", nullable=false)
    private Integer    userid ;

    @Column(name="actionPerformed", length=255)
    private String     actionperformed ;

    @Column(name="pageName", length=128)
    private String     pagename ;

    @Column(name="communityId")
    private Integer    communityid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;


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
        this.auditlogid = auditlogid ;
    }
    public Integer getAuditlogid() {
        return this.auditlogid;
    }

    public void setUserid( Integer userid ) {
        this.userid = userid ;
    }
    public Integer getUserid() {
        return this.userid;
    }

    public void setActionperformed( String actionperformed ) {
        this.actionperformed = actionperformed ;
    }
    public String getActionperformed() {
        return this.actionperformed;
    }

    public void setPagename( String pagename ) {
        this.pagename = pagename ;
    }
    public String getPagename() {
        return this.pagename;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
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
        sb.append(auditlogid);
        sb.append("|");
        sb.append(userid);
        sb.append("|");
        sb.append(actionperformed);
        sb.append("|");
        sb.append(pagename);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(createddate);
        return sb.toString(); 
    } 

}
