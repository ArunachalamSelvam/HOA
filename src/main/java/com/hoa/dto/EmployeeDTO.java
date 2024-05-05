package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class EmployeeDTO {
	
	    private Integer employeeid;
	    private Integer userid;
	    private String employeeno;
	    private Date dateofjoining;
	    private Integer managerid;
	    private Integer designationid;
	    private Boolean activestatus;
//	    private UserDTO user;
//	    private List<EmployeeDTO> listOfEmployee;
//	    private DesignationDTO designation;
//	    private EmployeeDTO manager;
//	    private List<ContractDTO> listOfContract;

	    // Getters and Setters for all fields

	    public Integer getEmployeeid() {
	        return employeeid;
	    }

	    public void setEmployeeid(Integer employeeid) {
	        this.employeeid = employeeid;
	    }

	    public Integer getUserid() {
	        return userid;
	    }

	    public void setUserid(Integer userid) {
	        this.userid = userid;
	    }

	    public String getEmployeeno() {
	        return employeeno;
	    }

	    public void setEmployeeno(String employeeno) {
	        this.employeeno = employeeno;
	    }

	    public Date getDateofjoining() {
	        return dateofjoining;
	    }

	    public void setDateofjoining(Date dateofjoining) {
	        this.dateofjoining = dateofjoining;
	    }

	    public Integer getManagerid() {
	        return managerid;
	    }

	    public void setManagerid(Integer managerid) {
	        this.managerid = managerid;
	    }

	    public Integer getDesignationid() {
	        return designationid;
	    }

	    public void setDesignationid(Integer designationid) {
	        this.designationid = designationid;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

//	    public UserDTO getUser() {
//	        return user;
//	    }
//
//	    public void setUser(UserDTO user) {
//	        this.user = user;
//	    }
//
//	    public List<EmployeeDTO> getListOfEmployee() {
//	        return listOfEmployee;
//	    }
//
//	    public void setListOfEmployee(List<EmployeeDTO> listOfEmployee) {
//	        this.listOfEmployee = listOfEmployee;
//	    }
//
//	    public DesignationDTO getDesignation() {
//	        return designation;
//	    }
//
//	    public void setDesignation(DesignationDTO designation) {
//	        this.designation = designation;
//	    }
//
//	    public EmployeeDTO getManager() {
//	        return manager;
//	    }
//
//	    public void setManager(EmployeeDTO manager) {
//	        this.manager = manager;
//	    }
//
//	    public List<ContractDTO> getListOfContract() {
//	        return listOfContract;
//	    }
//
//	    public void setListOfContract(List<ContractDTO> listOfContract) {
//	        this.listOfContract = listOfContract;
//	    }

		@Override
		public String toString() {
			return "EmployeeDto [employeeid=" + employeeid + ", userid=" + userid + ", employeeno=" + employeeno
					+ ", dateofjoining=" + dateofjoining + ", managerid=" + managerid + ", designationid="
					+ designationid + ", activestatus=" + activestatus + "]";
		}

		public EmployeeDTO(Integer employeeid, Integer userid, String employeeno, Date dateofjoining, Integer managerid,
				Integer designationid, Boolean activestatus) {
			super();
			this.employeeid = employeeid;
			this.userid = userid;
			this.employeeno = employeeno;
			this.dateofjoining = dateofjoining;
			this.managerid = managerid;
			this.designationid = designationid;
			this.activestatus = activestatus;
			
		}

		public EmployeeDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
