package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO class for "Servicerequest"
 */
public class ServiceRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer serviceRequestId;
    private Integer serviceTypeId;
    private Integer requestedClientId;
    private String description;
    private Integer communityId;
    private Integer vendorId;
    private Integer createdById;
    private Integer modifiedById;
    private Date createdDate;
    private Date modifiedDate;
    private Double serviceCharge;
    private String serviceStatus;
    private String paymentStatus;
    private Integer paymentDetailId;

    // Constructor
    public ServiceRequestDTO() {
    }

    // Constructor with fields
    public ServiceRequestDTO(Integer servicerequestid, Integer servicetypeid, Integer requestedclientid,
                             String description, Integer communityid, Integer vendorid, Integer createdbyid,
                             Integer modifiedbyid, Date createddate, Date modifieddate, Double servicecharge,
                             String servicestatus, String paymentstatus, Integer paymentdetailid) {
        this.serviceRequestId = servicerequestid;
        this.serviceTypeId = servicetypeid;
        this.requestedClientId = requestedclientid;
        this.description = description;
        this.communityId = communityid;
        this.vendorId = vendorid;
        this.createdById = createdbyid;
        this.modifiedById = modifiedbyid;
        this.createdDate = createddate;
        this.modifiedDate = modifieddate;
        this.serviceCharge = servicecharge;
        this.serviceStatus = servicestatus;
        this.paymentStatus = paymentstatus;
        this.paymentDetailId = paymentdetailid;
    }

    // Getters and Setters
    public Integer getServicerequestid() {
        return serviceRequestId;
    }

    public void setServicerequestid(Integer servicerequestid) {
        this.serviceRequestId = servicerequestid;
    }

    public Integer getServicetypeid() {
        return serviceTypeId;
    }

    public void setServicetypeid(Integer servicetypeid) {
        this.serviceTypeId = servicetypeid;
    }

    public Integer getRequestedclientid() {
        return requestedClientId;
    }

    public void setRequestedclientid(Integer requestedclientid) {
        this.requestedClientId = requestedclientid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCommunityid() {
        return communityId;
    }

    public void setCommunityid(Integer communityid) {
        this.communityId = communityid;
    }

    public Integer getVendorid() {
        return vendorId;
    }

    public void setVendorid(Integer vendorid) {
        this.vendorId = vendorid;
    }

    public Integer getCreatedbyid() {
        return createdById;
    }

    public void setCreatedbyid(Integer createdbyid) {
        this.createdById = createdbyid;
    }

    public Integer getModifiedbyid() {
        return modifiedById;
    }

    public void setModifiedbyid(Integer modifiedbyid) {
        this.modifiedById = modifiedbyid;
    }

    public Date getCreateddate() {
        return createdDate;
    }

    public void setCreateddate(Date createddate) {
        this.createdDate = createddate;
    }

    public Date getModifieddate() {
        return modifiedDate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifiedDate = modifieddate;
    }

    public Double getServicecharge() {
        return serviceCharge;
    }

    public void setServicecharge(Double servicecharge) {
        this.serviceCharge = servicecharge;
    }

    public String getServicestatus() {
        return serviceStatus;
    }

    public void setServicestatus(String servicestatus) {
        this.serviceStatus = servicestatus;
    }

    public String getPaymentstatus() {
        return paymentStatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentStatus = paymentstatus;
    }

    public Integer getPaymentdetailid() {
        return paymentDetailId;
    }

    public void setPaymentdetailid(Integer paymentdetailid) {
        this.paymentDetailId = paymentdetailid;
    }

    // toString method
    @Override
    public String toString() {
        return "ServicerequestDTO{" +
                "servicerequestid=" + serviceRequestId +
                ", servicetypeid=" + serviceTypeId +
                ", requestedclientid=" + requestedClientId +
                ", description='" + description + '\'' +
                ", communityid=" + communityId +
                ", vendorid=" + vendorId +
                ", createdbyid=" + createdById +
                ", modifiedbyid=" + modifiedById +
                ", createddate=" + createdDate +
                ", modifieddate=" + modifiedDate +
                ", servicecharge=" + serviceCharge +
                ", servicestatus='" + serviceStatus + '\'' +
                ", paymentstatus='" + paymentStatus + '\'' +
                ", paymentdetailid=" + paymentDetailId +
                '}';
    }
}
