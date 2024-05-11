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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plan_detail_sequence")
    @SequenceGenerator(name = "plan_detail_sequence", sequenceName = "plan_detail_sequence", allocationSize = 1, initialValue = 1)
    @Column(name="planDetailId", nullable=false)
    private Integer    planDetailId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="planId", nullable=false)
    private Integer    planId ;

    @Column(name="name", length=128)
    private String     name ;

    @Column(name="displayOrder")
    private Integer    displayOrder ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;


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
        this.planDetailId = plandetailid ;
    }
    public Integer getPlandetailid() {
        return this.planDetailId;
    }

    public void setPlanid( Integer planid ) {
        this.planId = planid ;
    }
    public Integer getPlanid() {
        return this.planId;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setDisplayorder( Integer displayorder ) {
        this.displayOrder = displayorder ;
    }
    public Integer getDisplayorder() {
        return this.displayOrder;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    //--- GETTERS FOR LINKS
    public Plan getPlan() {
        return this.plan;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(planDetailId);
        sb.append("|");
        sb.append(planId);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(displayOrder);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
