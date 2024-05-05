package com.hoa.dto;

import java.util.List;

public class DesignationDTO {

	    private Integer designationid;
	    private String name;
	    private Boolean activestatus;
//	    private List<EmployeeDTO> listOfEmployee;

	    // Getters and Setters for all fields

	    public Integer getDesignationid() {
	        return designationid;
	    }

	    public void setDesignationid(Integer designationid) {
	        this.designationid = designationid;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
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
			return "DesignationDto [designationid=" + designationid + ", name=" + name + ", activestatus="
					+ activestatus  + "]";
		}

		public DesignationDTO(Integer designationid, String name, Boolean activestatus) {
			super();
			this.designationid = designationid;
			this.name = name;
			this.activestatus = activestatus;
//			this.listOfEmployee = listOfEmployee;
		}

		public DesignationDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
