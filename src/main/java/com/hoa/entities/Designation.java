package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Designation"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Designation", schema="public" )
public class Designation implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="designationId", nullable=false)
    private Integer    designationid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="activeStatus", nullable=false)
    private Boolean    activestatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="designation")
    private List<Employee> listOfEmployee ; 


    /**
     * Constructor
     */
    public Designation() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setDesignationid( Integer designationid ) {
        this.designationid = designationid ;
    }
    public Integer getDesignationid() {
        return this.designationid;
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
    public List<Employee> getListOfEmployee() {
        return this.listOfEmployee;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(designationid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
