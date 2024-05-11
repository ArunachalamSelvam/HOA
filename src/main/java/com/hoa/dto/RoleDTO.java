package com.hoa.dto;

import java.io.Serializable;

/**
 * DTO class for "Role"
 */
public class RoleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

//    private Integer roleid;
    private String name;
    private Boolean activeStatus;

    // Constructor
    public RoleDTO() {
    }

    // Constructor with fields
    public RoleDTO(String name, Boolean activestatus) {
//        this.roleid = roleid;
        this.name = name;
        this.activeStatus = activestatus;
    }

    // Getters and Setters
//    public Integer getRoleid() {
//        return roleid;
//    }
//
//    public void setRoleid(Integer roleid) {
//        this.roleid = roleid;
//    }

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

    // toString method
    @Override
    public String toString() {
        return "RoleDTO{" +
                ", name='" + name + '\'' +
                ", activestatus=" + activeStatus +
                '}';
    }
    
}
