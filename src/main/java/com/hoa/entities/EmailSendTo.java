package com.hoa.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "Emailsendto"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="EmailSendTo", schema="public" )
public class EmailSendTo implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="emailSendToId", nullable=false)
    private Integer    emailSendToId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="emailDetailId")
    private Integer    emailDetailId ;

    @Column(name="emailTo", length=256)
    private String     emailTo ;

    @Column(name="clientId")
    private Integer    clientId ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="clientId", referencedColumnName="clientId", insertable=false, updatable=false)
    private Client     client ; 

    @ManyToOne
    @JoinColumn(name="emailDetailId", referencedColumnName="emailDetailId", insertable=false, updatable=false)
    private EmailDetail emaildetail ; 


    /**
     * Constructor
     */
    public EmailSendTo() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setEmailsendtoid( Integer emailsendtoid ) {
        this.emailSendToId = emailsendtoid ;
    }
    public Integer getEmailsendtoid() {
        return this.emailSendToId;
    }

    public void setEmaildetailid( Integer emaildetailid ) {
        this.emailDetailId = emaildetailid ;
    }
    public Integer getEmaildetailid() {
        return this.emailDetailId;
    }

    public void setEmailto( String emailto ) {
        this.emailTo = emailto ;
    }
    public String getEmailto() {
        return this.emailTo;
    }

    public void setClientid( Integer clientid ) {
        this.clientId = clientid ;
    }
    public Integer getClientid() {
        return this.clientId;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    //--- GETTERS FOR LINKS
    public Client getClient() {
        return this.client;
    } 

    public EmailDetail getEmaildetail() {
        return this.emaildetail;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(emailSendToId);
        sb.append("|");
        sb.append(emailDetailId);
        sb.append("|");
        sb.append(emailTo);
        sb.append("|");
        sb.append(clientId);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
