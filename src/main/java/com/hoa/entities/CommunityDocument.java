package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Communitydocument"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="CommunityDocument", schema="public" )
public class CommunityDocument implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="communityDocumentId", nullable=false)
    private Integer    communitydocumentid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="communityID", nullable=false)
    private Integer    communityid ;

    @Column(name="ownerID", nullable=false)
    private Integer    ownerid ;

    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="uploadedDate")
    private Date       uploadeddate ;

    @Column(name="uploadedByID")
    private Integer    uploadedbyid ;

    @Column(name="documentUrl", length=256)
    private String     documenturl ;

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

    @Column(name="documentType", length=128)
    private String     documenttype ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="ownerID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user3 ; 

    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="uploadedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user4 ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public CommunityDocument() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setCommunitydocumentid( Integer communitydocumentid ) {
        this.communitydocumentid = communitydocumentid ;
    }
    public Integer getCommunitydocumentid() {
        return this.communitydocumentid;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setOwnerid( Integer ownerid ) {
        this.ownerid = ownerid ;
    }
    public Integer getOwnerid() {
        return this.ownerid;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setUploadeddate( Date uploadeddate ) {
        this.uploadeddate = uploadeddate ;
    }
    public Date getUploadeddate() {
        return this.uploadeddate;
    }

    public void setUploadedbyid( Integer uploadedbyid ) {
        this.uploadedbyid = uploadedbyid ;
    }
    public Integer getUploadedbyid() {
        return this.uploadedbyid;
    }

    public void setDocumenturl( String documenturl ) {
        this.documenturl = documenturl ;
    }
    public String getDocumenturl() {
        return this.documenturl;
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

    public void setDocumenttype( String documenttype ) {
        this.documenttype = documenttype ;
    }
    public String getDocumenttype() {
        return this.documenttype;
    }

    //--- GETTERS FOR LINKS
    public User getUser3() {
        return this.user3;
    } 

    public User getUser2() {
        return this.user2;
    } 

    public User getUser4() {
        return this.user4;
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
        sb.append(communitydocumentid);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(ownerid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(uploadeddate);
        sb.append("|");
        sb.append(uploadedbyid);
        sb.append("|");
        sb.append(documenturl);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifieddate);
        sb.append("|");
        sb.append(documenttype);
        return sb.toString(); 
    } 

}
