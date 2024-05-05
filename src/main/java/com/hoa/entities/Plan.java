package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Plan"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Plan", schema="public" )
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="planId", nullable=false)
    private Integer    planid ;

    //--- ENTITY DATA FIELDS 
//    @Column(name="planRangeFrom")
//    private Integer    planrangefrom ;

    @Column(name="planRangeId")
    private Integer    planrangeId ;

    @Column(name="planPeriodId")
    private Integer     planperiodId ;

    @Column(name="planTypeId")
    private Integer     plantypeId ;

    @Column(name="price")
    private Double     price ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate")
    private Date       createddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="plan")
    private List<PlanDetail> listOfPlandetail ; 

    @OneToMany(mappedBy="plan")
    private List<Community> listOfCommunity ; 

    @OneToMany(mappedBy="plan")
    private List<Enquiry> listOfEnquiry ; 

    @OneToMany(mappedBy="plan")
    private List<Contract> listOfContract ; 

    @ManyToOne
    @JoinColumn(name="planRangeId", referencedColumnName="id", insertable=false, updatable=false)
    private PlanRange       planRange ; 
    
    @ManyToOne
    @JoinColumn(name="planPeriodId", referencedColumnName="id", insertable=false, updatable=false)
    private PlanPeriod       planPeriod ; 
    
    @ManyToOne
    @JoinColumn(name="planTypeId", referencedColumnName="id", insertable=false, updatable=false)
    private PlanType       planType ; 

    /**
     * Constructor
     */
    public Plan() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setPlanid( Integer planid ) {
        this.planid = planid ;
    }
    public Integer getPlanid() {
        return this.planid;
    }

//    public void setPlanrangefrom( Integer planrangefrom ) {
//        this.planrangefrom = planrangefrom ;
//    }
//    public Integer getPlanrangefrom() {
//        return this.planrangefrom;
//    }

    

    public void setPlantype( Integer plantypeId ) {
        this.plantypeId = plantypeId ;
    }
    public Integer getPlantype() {
        return this.plantypeId;
    }

    public void setPrice( Double price ) {
        this.price = price ;
    }
    public Double getPrice() {
        return this.price;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    //--- GETTERS FOR LINKS
    public List<PlanDetail> getListOfPlandetail() {
        return this.listOfPlandetail;
    } 

    public List<Community> getListOfCommunity() {
        return this.listOfCommunity;
    } 

    public List<Enquiry> getListOfEnquiry() {
        return this.listOfEnquiry;
    } 

    public List<Contract> getListOfContract() {
        return this.listOfContract;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(planid);
        sb.append("|");
        sb.append("|");
        sb.append(planrangeId);
        sb.append("|");
        sb.append(planperiodId);
        sb.append("|");
        sb.append(plantypeId);
        sb.append("|");
        sb.append(price);
        sb.append("|");
        sb.append(activestatus);
        sb.append("|");
        sb.append(createddate);
        return sb.toString(); 
    } 

}
