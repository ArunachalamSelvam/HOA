package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Violationtype"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="ViolationType", schema="public" )
public class ViolationType implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="violationTypeId", nullable=false)
    private Integer    violationtypeid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="activeStatus", nullable=false)
    private Boolean    activestatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="violationtype")
//    private List<Violation> listOfViolation ; 


    /**
     * Constructor
     */
    public ViolationType() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setViolationtypeid( Integer violationtypeid ) {
        this.violationtypeid = violationtypeid ;
    }
    public Integer getViolationtypeid() {
        return this.violationtypeid;
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
//    public List<Violation> getListOfViolation() {
//        return this.listOfViolation;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(violationtypeid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
