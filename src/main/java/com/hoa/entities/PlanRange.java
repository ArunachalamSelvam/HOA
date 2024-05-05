package com.hoa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plan_range", schema="public")
public class PlanRange implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	private String planRange;
	private boolean activeStatus;
	
	public PlanRange() {
		// TODO Auto-generated constructor stub
	}
	
	public PlanRange(Integer id, String planRange, boolean activeStatus) {
		super();
		this.id = id;
		this.planRange = planRange;
		this.activeStatus = activeStatus;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlanRange() {
		return planRange;
	}
	public void setPlanRange(String planRange) {
		this.planRange = planRange;
	}
	public boolean isActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	
	

}
