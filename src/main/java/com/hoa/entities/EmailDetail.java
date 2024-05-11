package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Emaildetail"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="EmailDetail", schema="public" )
public class EmailDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="emailDetailId", nullable=false)
    private Integer    emailDetailId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="communityId")
    private Integer    communityId ;

    @Column(name="emailType", length=128)
    private String     emailType ;

    @Column(name="emailFrom", length=256)
    private String     emailFrom ;

    @Column(name="emailTo", length=256)
    private String     emailTo ;

    @Column(name="subject", length=128)
    private String     subject ;

    @Column(name="content", length=2147483647)
    private String     content ;

    @Column(name="emailStatus", length=128)
    private String     emailStatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createdDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="sendDate")
    private Date       sendDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="emaildetail")
    private List<EmailSendTo> listOfEmailsendto ; 

    @ManyToOne
    @JoinColumn(name="communityId", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 


    /**
     * Constructor
     */
    public EmailDetail() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setEmaildetailid( Integer emaildetailid ) {
        this.emailDetailId = emaildetailid ;
    }
    public Integer getEmaildetailid() {
        return this.emailDetailId;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityId = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityId;
    }

    public void setEmailtype( String emailtype ) {
        this.emailType = emailtype ;
    }
    public String getEmailtype() {
        return this.emailType;
    }

    public void setEmailfrom( String emailfrom ) {
        this.emailFrom = emailfrom ;
    }
    public String getEmailfrom() {
        return this.emailFrom;
    }

    public void setEmailto( String emailto ) {
        this.emailTo = emailto ;
    }
    public String getEmailto() {
        return this.emailTo;
    }

    public void setSubject( String subject ) {
        this.subject = subject ;
    }
    public String getSubject() {
        return this.subject;
    }

    public void setContent( String content ) {
        this.content = content ;
    }
    public String getContent() {
        return this.content;
    }

    public void setEmailstatus( String emailstatus ) {
        this.emailStatus = emailstatus ;
    }
    public String getEmailstatus() {
        return this.emailStatus;
    }

    public void setCreateddate( Date createddate ) {
        this.createdDate = createddate ;
    }
    public Date getCreateddate() {
        return this.createdDate;
    }

    public void setSenddate( Date senddate ) {
        this.sendDate = senddate ;
    }
    public Date getSenddate() {
        return this.sendDate;
    }

    //--- GETTERS FOR LINKS
    public List<EmailSendTo> getListOfEmailsendto() {
        return this.listOfEmailsendto;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(emailDetailId);
        sb.append("|");
        sb.append(communityId);
        sb.append("|");
        sb.append(emailType);
        sb.append("|");
        sb.append(emailFrom);
        sb.append("|");
        sb.append(emailTo);
        sb.append("|");
        sb.append(subject);
        sb.append("|");
        sb.append(content);
        sb.append("|");
        sb.append(emailStatus);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(sendDate);
        return sb.toString(); 
    } 

}
