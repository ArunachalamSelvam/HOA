package com.hoa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Page"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Page", schema="public" )
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="pageId", nullable=false)
    private Integer    pageid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="pageIcon", length=255)
    private String     pageicon ;

    @Column(name="componentUrl", length=255)
    private String     componenturl ;

    @Column(name="displayOrder")
    private Integer    displayorder ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="page")
//    private List<RolePage> listOfRolepage ; 


    /**
     * Constructor
     */
    public Page() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setPageid( Integer pageid ) {
        this.pageid = pageid ;
    }
    public Integer getPageid() {
        return this.pageid;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setPageicon( String pageicon ) {
        this.pageicon = pageicon ;
    }
    public String getPageicon() {
        return this.pageicon;
    }

    public void setComponenturl( String componenturl ) {
        this.componenturl = componenturl ;
    }
    public String getComponenturl() {
        return this.componenturl;
    }

    public void setDisplayorder( Integer displayorder ) {
        this.displayorder = displayorder ;
    }
    public Integer getDisplayorder() {
        return this.displayorder;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }
    
    

    public Page(Integer pageid, String name, String pageicon, String componenturl, Integer displayorder,
			Boolean activestatus) {
		super();
		this.pageid = pageid;
		this.name = name;
		this.pageicon = pageicon;
		this.componenturl = componenturl;
		this.displayorder = displayorder;
		this.activestatus = activestatus;
	}

	//--- GETTERS FOR LINKS
//    public List<RolePage> getListOfRolepage() {
//        return this.listOfRolepage;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(pageid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(pageicon);
        sb.append("|");
        sb.append(componenturl);
        sb.append("|");
        sb.append(displayorder);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
