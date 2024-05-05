package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Servicerequestnote"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="ServiceRequestNote", schema="public" )
public class ServiceRequestNote implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="serviceRequestNoteId", nullable=false)
    private Integer    servicerequestnoteid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="serviceRequestId")
    private Integer    servicerequestid ;

    @Column(name="note", length=2147483647)
    private String     note ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate")
    private Date       createddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="serviceRequestId", referencedColumnName="serviceRequestId", insertable=false, updatable=false)
    private ServiceRequest servicerequest ; 


    /**
     * Constructor
     */
    public ServiceRequestNote() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setServicerequestnoteid( Integer servicerequestnoteid ) {
        this.servicerequestnoteid = servicerequestnoteid ;
    }
    public Integer getServicerequestnoteid() {
        return this.servicerequestnoteid;
    }

    public void setServicerequestid( Integer servicerequestid ) {
        this.servicerequestid = servicerequestid ;
    }
    public Integer getServicerequestid() {
        return this.servicerequestid;
    }

    public void setNote( String note ) {
        this.note = note ;
    }
    public String getNote() {
        return this.note;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    //--- GETTERS FOR LINKS
    public ServiceRequest getServicerequest() {
        return this.servicerequest;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(servicerequestnoteid);
        sb.append("|");
        sb.append(servicerequestid);
        sb.append("|");
        sb.append(note);
        sb.append("|");
        sb.append(createddate);
        return sb.toString(); 
    } 

}
