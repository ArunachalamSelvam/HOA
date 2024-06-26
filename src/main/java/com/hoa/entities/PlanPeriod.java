package com.hoa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plan_period", schema = "public")
public class PlanPeriod implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String planPeriod;
	private boolean activeStatus;
	
	public PlanPeriod() {
		// TODO Auto-generated constructor stub
	}
	
	public PlanPeriod(Integer id, String planPeriod, boolean activeStatus) {
		super();
		this.id = id;
		this.planPeriod = planPeriod;
		this.activeStatus = activeStatus;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlanPeriod() {
		return planPeriod;
	}
	public void setPlanPeriod(String planPeriod) {
		this.planPeriod = planPeriod;
	}
	public boolean isActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	

}
