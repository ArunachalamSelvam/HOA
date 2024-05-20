package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;

public class CommunityDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer communityId;
    private String name;
    private String communityCode;
    private Integer addressId;
    private String presidentEmailID;
    private String presidentInviteStatus;
    private Integer presidentUserId;
    private String secretaryEmailID;
    private String secretaryInviteStatus;
    private Integer secretaryUserID;
    private String treasurerEmailID;
    private String treasurerInviteStatus;
    private Integer adminUserID;
    private String adminEmailID;
    private String adminInviteStatus;
    private Integer treasurerUserID;
    private Integer planId;
    private String licenseStatus;
    private Integer communitySize;
    private Date planExpireDate;
    private String contactPerson;
    private Integer totalOwners;
    private Boolean activeStatus;
    private Integer createdById;
    private Date createdDate;
    private Integer modifiedById;
    private Date modifiedDate;
    private String timeZone;
    private Integer contractId;

    // Getters and Setters

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getPresidentEmailID() {
        return presidentEmailID;
    }

    public void setPresidentEmailID(String presidentEmailID) {
        this.presidentEmailID = presidentEmailID;
    }

    public String getPresidentInviteStatus() {
        return presidentInviteStatus;
    }

    public void setPresidentInviteStatus(String presidentInviteStatus) {
        this.presidentInviteStatus = presidentInviteStatus;
    }

    public Integer getPresidentUserId() {
        return presidentUserId;
    }

    public void setPresidentUserId(Integer presidentUserId) {
        this.presidentUserId = presidentUserId;
    }

    public String getSecretaryEmailID() {
        return secretaryEmailID;
    }

    public void setSecretaryEmailID(String secretaryEmailID) {
        this.secretaryEmailID = secretaryEmailID;
    }

    public String getSecretaryInviteStatus() {
        return secretaryInviteStatus;
    }

    public void setSecretaryInviteStatus(String secretaryInviteStatus) {
        this.secretaryInviteStatus = secretaryInviteStatus;
    }

    public Integer getSecretaryUserID() {
        return secretaryUserID;
    }

    public void setSecretaryUserID(Integer secretaryUserID) {
        this.secretaryUserID = secretaryUserID;
    }

    public String getTreasurerEmailID() {
        return treasurerEmailID;
    }

    public void setTreasurerEmailID(String treasurerEmailID) {
        this.treasurerEmailID = treasurerEmailID;
    }

    public String getTreasurerInviteStatus() {
        return treasurerInviteStatus;
    }

    public void setTreasurerInviteStatus(String treasurerInviteStatus) {
        this.treasurerInviteStatus = treasurerInviteStatus;
    }

    public Integer getAdminUserID() {
        return adminUserID;
    }

    public void setAdminUserID(Integer adminUserID) {
        this.adminUserID = adminUserID;
    }

    public String getAdminEmailID() {
        return adminEmailID;
    }

    public void setAdminEmailID(String adminEmailID) {
        this.adminEmailID = adminEmailID;
    }

    public String getAdminInviteStatus() {
        return adminInviteStatus;
    }

    public void setAdminInviteStatus(String adminInviteStatus) {
        this.adminInviteStatus = adminInviteStatus;
    }

    public Integer getTreasurerUserID() {
        return treasurerUserID;
    }

    public void setTreasurerUserID(Integer treasurerUserID) {
        this.treasurerUserID = treasurerUserID;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public Integer getCommunitySize() {
        return communitySize;
    }

    public void setCommunitySize(Integer communitySize) {
        this.communitySize = communitySize;
    }

    public Date getPlanExpireDate() {
        return planExpireDate;
    }

    public void setPlanExpireDate(Date planExpireDate) {
        this.planExpireDate = planExpireDate;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Integer getTotalOwners() {
        return totalOwners;
    }

    public void setTotalOwners(Integer totalOwners) {
        this.totalOwners = totalOwners;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(Integer modifiedById) {
        this.modifiedById = modifiedById;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}
