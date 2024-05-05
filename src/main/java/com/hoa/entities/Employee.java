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
    private Integer    employeeid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="userId")
    private Integer    userid ;

    @Column(name="employeeNo", nullable=false, length=128)
    private String     employeeno ;

    @Temporal(TemporalType.DATE)
    @Column(name="dateOfJoining")
    private Date       dateofjoining ;

    @Column(name="managerId")
    private Integer    managerid ;

    @Column(name="designationId")
    private Integer    designationid ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;


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
        this.employeeid = employeeid ;
    }
    public Integer getEmployeeid() {
        return this.employeeid;
    }

    public void setUserid( Integer userid ) {
        this.userid = userid ;
    }
    public Integer getUserid() {
        return this.userid;
    }

    public void setEmployeeno( String employeeno ) {
        this.employeeno = employeeno ;
    }
    public String getEmployeeno() {
        return this.employeeno;
    }

    public void setDateofjoining( Date dateofjoining ) {
        this.dateofjoining = dateofjoining ;
    }
    public Date getDateofjoining() {
        return this.dateofjoining;
    }

    public void setManagerid( Integer managerid ) {
        this.managerid = managerid ;
    }
    public Integer getManagerid() {
        return this.managerid;
    }

    public void setDesignationid( Integer designationid ) {
        this.designationid = designationid ;
    }
    public Integer getDesignationid() {
        return this.designationid;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
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
        sb.append(employeeid);
        sb.append("|");
        sb.append(userid);
        sb.append("|");
        sb.append(employeeno);
        sb.append("|");
        sb.append(dateofjoining);
        sb.append("|");
        sb.append(managerid);
        sb.append("|");
        sb.append(designationid);
        sb.append("|");
        sb.append(activestatus);
        return sb.toString(); 
    } 

}
