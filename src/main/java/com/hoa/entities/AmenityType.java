package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Amenitytype"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="AmenityType", schema="public" )
public class AmenityType implements Serializable {

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
    private Boolean    activeStatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="amenitytype")
//    private List<Amenity> listOfAmenity ; 


    /**
     * Constructor
     */
    public AmenityType() {
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
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    //--- GETTERS FOR LINKS
//    public List<Amenity> getListOfAmenity() {
//        return this.listOfAmenity;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
