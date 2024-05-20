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
    private Integer    planId ;

    //--- ENTITY DATA FIELDS 
//    @Column(name="planRangeFrom")
//    private Integer    planrangefrom ;

    @Column(name="planRangeId")
    private Integer    planRangeId ;

    @Column(name="planPeriodId")
    private Integer     planPeriodId ;

    @Column(name="planTypeId")
    private Integer     planTypeId ;

    @Column(name="price")
    private Double     price ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate")
    private Date       createdDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
//    @OneToMany(mappedBy="plan")
//    private List<PlanDetail> listOfPlandetail ; 
//
//    @OneToMany(mappedBy="plan")
//    private List<Community> listOfCommunity ; 
//
//    @OneToMany(mappedBy="plan")
//    private List<Enquiry> listOfEnquiry ; 
//
//    @OneToMany(mappedBy="plan")
//    private List<Contract> listOfContract ; 

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
    public void setPlanId( Integer planId ) {
        this.planId = planId ;
    }
    public Integer getPlanId() {
        return this.planId;
    }

//    public void setPlanrangefrom( Integer planrangefrom ) {
//        this.planrangefrom = planrangefrom ;
//    }
//    public Integer getPlanrangefrom() {
//        return this.planrangefrom;
//    }

    

    public void setPrice( Double price ) {
        this.price = price ;
    }
    public Double getPrice() {
        return this.price;
    }

    public void setActiveStatus( Boolean activeStatus ) {
        this.activeStatus = activeStatus ;
    }
    public Boolean getActiveStatus() {
        return this.activeStatus;
    }

    public void setCreatedDate( Date createdDate ) {
        this.createdDate = createdDate ;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }

    //--- GETTERS FOR LINKS
//    public List<PlanDetail> getListOfPlandetail() {
//        return this.listOfPlandetail;
//    } 
//
//    public List<Community> getListOfCommunity() {
//        return this.listOfCommunity;
//    } 
//
//    public List<Enquiry> getListOfEnquiry() {
//        return this.listOfEnquiry;
//    } 
//
//    public List<Contract> getListOfContract() {
//        return this.listOfContract;
//    } 

    
    
    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(planId);
        sb.append("|");
        sb.append("|");
        sb.append(planRangeId);
        sb.append("|");
        sb.append(planPeriodId);
        sb.append("|");
        sb.append(planTypeId);
        sb.append("|");
        sb.append(price);
        sb.append("|");
        sb.append(activeStatus);
        sb.append("|");
        sb.append(createdDate);
        return sb.toString(); 
    }

	public Integer getPlanRangeId() {
		return planRangeId;
	}

	public void setPlanRangeId(Integer planRangeId) {
		this.planRangeId = planRangeId;
	}

	public Integer getPlanPeriodId() {
		return planPeriodId;
	}

	public void setPlanPeriodId(Integer planPeriodId) {
		this.planPeriodId = planPeriodId;
	}

	public Integer getPlanTypeId() {
		return planTypeId;
	}

	public void setPlanTypeId(Integer planTypeId) {
		this.planTypeId = planTypeId;
	}

	public PlanRange getPlanRange() {
		return planRange;
	}

	public void setPlanRange(PlanRange planRange) {
		this.planRange = planRange;
	}

	public PlanPeriod getPlanPeriod() {
		return planPeriod;
	}

	public void setPlanPeriod(PlanPeriod planPeriod) {
		this.planPeriod = planPeriod;
	}

	public PlanType getPlanType() {
		return planType;
	}

	public void setPlanType(PlanType planType) {
		this.planType = planType;
	} 

}
