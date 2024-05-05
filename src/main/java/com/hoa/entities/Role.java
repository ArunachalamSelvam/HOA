package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Role"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Role", schema="public" )
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
    @SequenceGenerator(name = "role_seq", sequenceName = "role_seq", allocationSize = 1, initialValue = 1000) // Set initialValue to the desired starting number
    @Column(name="roleId",nullable = false)
    private Integer    roleid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


//    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="role", fetch = FetchType.LAZY)
//    private List<Faq>  listOfFaq ; 
//
//    @OneToMany(mappedBy="role", fetch = FetchType.LAZY)
//    private List<User> listOfUser ; 
//
//    @OneToMany(mappedBy="role", fetch = FetchType.LAZY)
//    private List<Rolepage> listOfRolepage ; 


    /**
     * Constructor
     */
    public Role() {
		super();
    }
    
    
    
    public Role(String name) {
	
		this.name = name;
		this.activestatus = true;
	}
    
    



	public Role(Integer roleid, String name, Boolean activestatus) {
	
		this.roleid = roleid;
		this.name = name;
		this.activestatus = activestatus;
	}



	//--- GETTERS & SETTERS FOR FIELDS
    public void setRoleid( Integer roleid ) {
        this.roleid = roleid ;
    }
    public Integer getRoleid() {
        return this.roleid;
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
//    public List<Faq> getListOfFaq() {
//        return this.listOfFaq;
//    } 
//
//    public List<User> getListOfUser() {
//        return this.listOfUser;
//    } 
//
//    public List<Rolepage> getListOfRolepage() {
//        return this.listOfRolepage;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(roleid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
