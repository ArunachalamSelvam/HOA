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
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "designation_seq")
//    @SequenceGenerator(name = "designation_seq", sequenceName = "designation_seq", allocationSize = 1, initialValue = 1) // Set initialValue to the desired starting number
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="designationId", nullable=false)
    private Integer    designationId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="activeStatus", nullable=false)
    private Boolean    activeStatus ;

    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="designation")
//    private List<Employee> listOfEmployee ; 



    /**
     * Constructor
     */
    public Designation() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setDesignationid( Integer designationid ) {
        this.designationId = designationid ;
    }
    public Integer getDesignationid() {
        return this.designationId;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    //--- GETTERS FOR LINKS
//    public List<Employee> getListOfEmployee() {
//        return this.listOfEmployee;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(designationId);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
