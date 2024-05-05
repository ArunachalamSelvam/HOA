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
    private Integer    emaildetailid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="communityId")
    private Integer    communityid ;

    @Column(name="emailType", length=128)
    private String     emailtype ;

    @Column(name="emailFrom", length=256)
    private String     emailfrom ;

    @Column(name="emailTo", length=256)
    private String     emailto ;

    @Column(name="subject", length=128)
    private String     subject ;

    @Column(name="content", length=2147483647)
    private String     content ;

    @Column(name="emailStatus", length=128)
    private String     emailstatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="sendDate")
    private Date       senddate ;


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
        this.emaildetailid = emaildetailid ;
    }
    public Integer getEmaildetailid() {
        return this.emaildetailid;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setEmailtype( String emailtype ) {
        this.emailtype = emailtype ;
    }
    public String getEmailtype() {
        return this.emailtype;
    }

    public void setEmailfrom( String emailfrom ) {
        this.emailfrom = emailfrom ;
    }
    public String getEmailfrom() {
        return this.emailfrom;
    }

    public void setEmailto( String emailto ) {
        this.emailto = emailto ;
    }
    public String getEmailto() {
        return this.emailto;
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
        this.emailstatus = emailstatus ;
    }
    public String getEmailstatus() {
        return this.emailstatus;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    public void setSenddate( Date senddate ) {
        this.senddate = senddate ;
    }
    public Date getSenddate() {
        return this.senddate;
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
        sb.append(emaildetailid);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(emailtype);
        sb.append("|");
        sb.append(emailfrom);
        sb.append("|");
        sb.append(emailto);
        sb.append("|");
        sb.append(subject);
        sb.append("|");
        sb.append(content);
        sb.append("|");
        sb.append(emailstatus);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(senddate);
        return sb.toString(); 
    } 

}
