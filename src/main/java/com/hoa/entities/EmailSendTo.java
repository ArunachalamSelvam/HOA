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
    private Integer    emailsendtoid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="emailDetailId")
    private Integer    emaildetailid ;

    @Column(name="emailTo", length=256)
    private String     emailto ;

    @Column(name="clientId")
    private Integer    clientid ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


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
        this.emailsendtoid = emailsendtoid ;
    }
    public Integer getEmailsendtoid() {
        return this.emailsendtoid;
    }

    public void setEmaildetailid( Integer emaildetailid ) {
        this.emaildetailid = emaildetailid ;
    }
    public Integer getEmaildetailid() {
        return this.emaildetailid;
    }

    public void setEmailto( String emailto ) {
        this.emailto = emailto ;
    }
    public String getEmailto() {
        return this.emailto;
    }

    public void setClientid( Integer clientid ) {
        this.clientid = clientid ;
    }
    public Integer getClientid() {
        return this.clientid;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
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
        sb.append(emailsendtoid);
        sb.append("|");
        sb.append(emaildetailid);
        sb.append("|");
        sb.append(emailto);
        sb.append("|");
        sb.append(clientid);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
