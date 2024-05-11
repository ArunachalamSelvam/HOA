package com.hoa.dto;

public class PlanDetailDTO {

	    private Integer planDetailId;
	    private Integer planId;
	    private String name;
	    private Integer displayOrder;
	    private Boolean activeStatus;
//	    private PlanDTO plan;

	    // Getters and Setters for all fields

	    public Integer getPlandetailid() {
	        return planDetailId;
	    }

	    public void setPlandetailid(Integer plandetailid) {
	        this.planDetailId = plandetailid;
	    }

	    public Integer getPlanid() {
	        return planId;
	    }

	    public void setPlanid(Integer planid) {
	        this.planId = planid;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Integer getDisplayorder() {
	        return displayOrder;
	    }

	    public void setDisplayorder(Integer displayorder) {
	        this.displayOrder = displayorder;
	    }

	    public Boolean getActivestatus() {
	        return activeStatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
	    }

//	    public PlanDTO getPlan() {
//	        return plan;
//	    }
//
//	    public void setPlan(PlanDTO plan) {
//	        this.plan = plan;
//	    }

		@Override
		public String toString() {
			return "PlandetailDto [plandetailid=" + planDetailId + ", planid=" + planId + ", name=" + name
					+ ", displayorder=" + displayOrder + ", activestatus=" + activeStatus + "]";
		}

		public PlanDetailDTO(Integer plandetailid, Integer planid, String name, Integer displayorder,
				Boolean activestatus) {
			super();
			this.planDetailId = plandetailid;
			this.planId = planid;
			this.name = name;
			this.displayOrder = displayorder;
			this.activeStatus = activestatus;
//			this.plan = plan;
		}

		public PlanDetailDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
