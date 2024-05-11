package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Employee"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Employee", schema="public" )
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="employeeId", nullable=false)
    private Integer    employeeId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="userId")
    private Integer    userId ;

    @Column(name="employeeNo", nullable=false, length=128)
    private String     employeeNo ;

    @Temporal(TemporalType.DATE)
    @Column(name="dateOfJoining")
    private Date       dateOfJoining ;

    @Column(name="managerId")
    private Integer    managerId ;

    @Column(name="designationId")
    private Integer    designationId ;

    @Column(name="activeStatus")
    private Boolean    activeStatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="userId", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 

    @ManyToOne
    @JoinColumn(name="designationId", referencedColumnName="designationId", insertable=false, updatable=false)
    private Designation designation ; 

//    @OneToMany(mappedBy="employee")
//    private List<Employee> listOfEmployee ; 

    @ManyToOne
    @JoinColumn(name="managerId", referencedColumnName="employeeId", insertable=false, updatable=false)
    private Employee   employee ; 

//    @OneToMany(mappedBy="employee")
//    private List<Contract> listOfContract ; 


    /**
     * Constructor
     */
    public Employee() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setEmployeeid( Integer employeeid ) {
        this.employeeId = employeeid ;
    }
    public Integer getEmployeeid() {
        return this.employeeId;
    }

    public void setUserid( Integer userid ) {
        this.userId = userid ;
    }
    public Integer getUserid() {
        return this.userId;
    }

    public void setEmployeeno( String employeeno ) {
        this.employeeNo = employeeno ;
    }
    public String getEmployeeno() {
        return this.employeeNo;
    }

    public void setDateofjoining( Date dateofjoining ) {
        this.dateOfJoining = dateofjoining ;
    }
    public Date getDateofjoining() {
        return this.dateOfJoining;
    }

    public void setManagerid( Integer managerid ) {
        this.managerId = managerid ;
    }
    public Integer getManagerid() {
        return this.managerId;
    }

    public void setDesignationid( Integer designationid ) {
        this.designationId = designationid ;
    }
    public Integer getDesignationid() {
        return this.designationId;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activeStatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activeStatus;
    }

    //--- GETTERS FOR LINKS
    public User getUser() {
        return this.user;
    } 

    public Designation getDesignation() {
        return this.designation;
    } 

//    public List<Employee> getListOfEmployee() {
//        return this.listOfEmployee;
//    } 

    public Employee getEmployee() {
        return this.employee;
    } 

//    public List<Contract> getListOfContract() {
//        return this.listOfContract;
//    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(employeeId);
        sb.append("|");
        sb.append(userId);
        sb.append("|");
        sb.append(employeeNo);
        sb.append("|");
        sb.append(dateOfJoining);
        sb.append("|");
        sb.append(managerId);
        sb.append("|");
        sb.append(designationId);
        sb.append("|");
        sb.append(activeStatus);
        return sb.toString(); 
    } 

}
