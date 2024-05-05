package com.hoa.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "Plandetail"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="PlanDetail", schema="public" )
public class PlanDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="planDetailId", nullable=false)
    private Integer    plandetailid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="planId", nullable=false)
    private Integer    planid ;

    @Column(name="name", length=128)
    private String     name ;

    @Column(name="displayOrder")
    private Integer    displayorder ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="planId", referencedColumnName="planId", insertable=false, updatable=false)
    private Plan       plan ; 


    /**
     * Constructor
     */
    public PlanDetail() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setPlandetailid( Integer plandetailid ) {
        this.plandetailid = plandetailid ;
    }
    public Integer getPlandetailid() {
        return this.plandetailid;
    }

    public void setPlanid( Integer planid ) {
        this.planid = planid ;
    }
    public Integer getPlanid() {
        return this.planid;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
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

    //--- GETTERS FOR LINKS
    public Plan getPlan() {
        return this.plan;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(plandetailid);
        sb.append("|");
        sb.append(planid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(displayorder);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
