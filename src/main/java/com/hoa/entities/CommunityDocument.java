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
    private Integer    communityDocumentId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="communityID", nullable=false)
    private Integer    communityId ;

    @Column(name="ownerID", nullable=false)
    private Integer    ownerId ;

    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="uploadedDate")
    private Date       uploadedDate ;

    @Column(name="uploadedByID")
    private Integer    uploadedById ;

    @Column(name="documentUrl", length=256)
    private String     documentUrl ;

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

    @Column(name="documentType", length=128)
    private String     documentType ;


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
        this.communityDocumentId = communitydocumentid ;
    }
    public Integer getCommunitydocumentid() {
        return this.communityDocumentId;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setOwnerid( Integer ownerid ) {
        this.ownerId = ownerid ;
    }
    public Integer getOwnerid() {
        return this.ownerId;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setUploadeddate( Date uploadeddate ) {
        this.uploadedDate = uploadeddate ;
    }
    public Date getUploadeddate() {
        return this.uploadedDate;
    }

    public void setUploadedbyid( Integer uploadedbyid ) {
        this.uploadedById = uploadedbyid ;
    }
    public Integer getUploadedbyid() {
        return this.uploadedById;
    }

    public void setDocumenturl( String documenturl ) {
        this.documentUrl = documenturl ;
    }
    public String getDocumenturl() {
        return this.documentUrl;
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

    public void setDocumenttype( String documenttype ) {
        this.documentType = documenttype ;
    }
    public String getDocumenttype() {
        return this.documentType;
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
        sb.append(communityDocumentId);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(ownerId);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(uploadedDate);
        sb.append("|");
        sb.append(uploadedById);
        sb.append("|");
        sb.append(documentUrl);
        sb.append("|");
        sb.append(createdById);
        sb.append("|");
        sb.append(modifiedById);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(modifiedDate);
        sb.append("|");
        sb.append(documentType);
        return sb.toString(); 
    } 

}
