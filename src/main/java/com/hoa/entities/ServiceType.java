package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Servicetype"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="ServiceType", schema="public" )
public class ServiceType implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="activeStatus", nullable=false)
    private Boolean    activestatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="servicetype")
//    private List<Vendor> listOfVendor ; 
//
//    @OneToMany(mappedBy="servicetype")
//    private List<ServiceRequest> listOfServicerequest ; 


    /**
     * Constructor
     */
    public ServiceType() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    //--- GETTERS FOR LINKS
//    public List<Vendor> getListOfVendor() {
//        return this.listOfVendor;
//    } 
//
//    public List<ServiceRequest> getListOfServicerequest() {
//        return this.listOfServicerequest;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
