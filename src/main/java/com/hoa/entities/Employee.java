package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @JsonBackReference
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
    public void setEmployeeId( Integer employeeId ) {
        this.employeeId = employeeId ;
    }
    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setUserid( Integer userId ) {
        this.userId = userId ;
    }
    public Integer getUserId() {
        return this.userId;
    }

    public void setEmployeeNo( String employeeNo ) {
        this.employeeNo = employeeNo ;
    }
    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setDateofjoining( Date dateOfJoining ) {
        this.dateOfJoining = dateOfJoining ;
    }
    public Date getDateOfJoining() {
        return this.dateOfJoining;
    }

    public void setManagerid( Integer managerId ) {
        this.managerId = managerId ;
    }
    public Integer getManagerId() {
        return this.managerId;
    }

    public void setDesignationid( Integer designationId ) {
        this.designationId = designationId ;
    }
    public Integer getDesignationId() {
        return this.designationId;
    }

    public void setActivestatus( Boolean activeStatus ) {
        this.activeStatus = activeStatus ;
    }
    public Boolean getActiveStatus() {
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
