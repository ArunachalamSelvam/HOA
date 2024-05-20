package com.hoa.dto;

import java.util.Date;

public class UserDTO {

    private Integer userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobileNumber;
    private Boolean mobileIsVerified;
    private String emailId;
    private Boolean emailIdIsVerified;
    private Boolean isClient;
    private Integer otp;
    private Integer roleId;
    private String password;
    private Boolean activeStatus;
    private Date lastLogin;

    // Getters and setters for the fields

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Boolean getMobileIsVerified() {
        return mobileIsVerified;
    }

    public void setMobileIsVerified(Boolean mobileIsVerified) {
        this.mobileIsVerified = mobileIsVerified;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Boolean getEmailIdIsVerified() {
        return emailIdIsVerified;
    }

    public void setEmailIdIsVerified(Boolean emailIdIsVerified) {
        this.emailIdIsVerified = emailIdIsVerified;
    }

    public Boolean getIsClient() {
        return isClient;
    }

    public void setIsClient(Boolean isClient) {
        this.isClient = isClient;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
