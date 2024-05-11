package com.hoa.dto;

import java.util.List;

public class DesignationDTO {

	    private Integer designationId;
	    private String name;
	    private Boolean activeStatus;
//	    private List<EmployeeDTO> listOfEmployee;

	    // Getters and Setters for all fields

	    public Integer getDesignationid() {
	        return designationId;
	    }

	    public void setDesignationid(Integer designationid) {
	        this.designationId = designationid;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Boolean getActivestatus() {
	        return activeStatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
	    }

//	    public List<EmployeeDTO> getListOfEmployee() {
//	        return listOfEmployee;
//	    }
//
//	    public void setListOfEmployee(List<EmployeeDTO> listOfEmployee) {
//	        this.listOfEmployee = listOfEmployee;
//	    }

		@Override
		public String toString() {
			return "DesignationDto [designationid=" + designationId + ", name=" + name + ", activestatus="
					+ activeStatus  + "]";
		}

		public DesignationDTO(Integer designationid, String name, Boolean activestatus) {
			super();
			this.designationId = designationid;
			this.name = name;
			this.activeStatus = activestatus;
//			this.listOfEmployee = listOfEmployee;
		}

		public DesignationDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
