package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class EmployeeDTO {
	
	    private Integer employeeId;
	    private Integer userId;
	    private String employeeNo;
	    private Date dateOfJoining;
	    private Integer managerId;
	    private Integer designationId;
	    private Boolean activeStatus;
//	    private UserDTO user;
//	    private List<EmployeeDTO> listOfEmployee;
//	    private DesignationDTO designation;
//	    private EmployeeDTO manager;
//	    private List<ContractDTO> listOfContract;

	    // Getters and Setters for all fields

	    public Integer getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(Integer employeeId) {
	        this.employeeId = employeeId;
	    }

	    public Integer getUserId() {
	        return userId;
	    }

	    public void setUserId(Integer userid) {
	        this.userId = userid;
	    }

	    public String getEmployeeNo() {
	        return employeeNo;
	    }

	    public void setEmployeeNo(String employeeno) {
	        this.employeeNo = employeeno;
	    }

	    public Date getDateOfJoining() {
	        return dateOfJoining;
	    }

	    public void setDateOfJoining(Date dateofjoining) {
	        this.dateOfJoining = dateofjoining;
	    }

	    public Integer getManagerId() {
	        return managerId;
	    }

	    public void setManagerId(Integer managerid) {
	        this.managerId = managerid;
	    }

	    public Integer getDesignationId() {
	        return designationId;
	    }

	    public void setDesignationId(Integer designationid) {
	        this.designationId = designationid;
	    }

	    public Boolean getActiveStatus() {
	        return activeStatus;
	    }

	    public void setActiveStatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
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
			return "EmployeeDto [employeeid=" + employeeId + ", userid=" + userId + ", employeeno=" + employeeNo
					+ ", dateofjoining=" + dateOfJoining + ", managerid=" + managerId + ", designationid="
					+ designationId + ", activestatus=" + activeStatus + "]";
		}

		public EmployeeDTO(Integer employeeid, Integer userid, String employeeno, Date dateofjoining, Integer managerid,
				Integer designationid, Boolean activestatus) {
			super();
			this.employeeId = employeeid;
			this.userId = userid;
			this.employeeNo = employeeno;
			this.dateOfJoining = dateofjoining;
			this.managerId = managerid;
			this.designationId = designationid;
			this.activeStatus = activestatus;
			
		}

		public EmployeeDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
