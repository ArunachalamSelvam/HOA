package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "News"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="News", schema="public" )
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="newsId", nullable=false)
    private Integer    newsid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="title", length=128)
    private String     title ;

    @Column(name="newsContent", length=2147483647)
    private String     newscontent ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datePublished")
    private Date       datepublished ;

    @Column(name="publishtoClientId")
    private Integer    publishtoclientid ;

    @Column(name="communityId", nullable=false)
    private Integer    communityid ;

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
    @JoinColumn(name="publishtoClientId", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdById", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public News() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setNewsid( Integer newsid ) {
        this.newsid = newsid ;
    }
    public Integer getNewsid() {
        return this.newsid;
    }

    public void setTitle( String title ) {
        this.title = title ;
    }
    public String getTitle() {
        return this.title;
    }

    public void setNewscontent( String newscontent ) {
        this.newscontent = newscontent ;
    }
    public String getNewscontent() {
        return this.newscontent;
    }

    public void setDatepublished( Date datepublished ) {
        this.datepublished = datepublished ;
    }
    public Date getDatepublished() {
        return this.datepublished;
    }

    public void setPublishtoclientid( Integer publishtoclientid ) {
        this.publishtoclientid = publishtoclientid ;
    }
    public Integer getPublishtoclientid() {
        return this.publishtoclientid;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
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

    public Client getClient() {
        return this.client;
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
        sb.append(newsid);
        sb.append("|");
        sb.append(title);
        sb.append("|");
        sb.append(newscontent);
        sb.append("|");
        sb.append(datepublished);
        sb.append("|");
        sb.append(publishtoclientid);
        sb.append("|");
        sb.append(communityid);
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
