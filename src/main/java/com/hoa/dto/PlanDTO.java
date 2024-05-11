package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class PlanDTO {

    private Integer planId;
    private Integer planRangeId;
    private Integer planPeriodId;
    private Integer planTypeId;
    private Double price;
    private Boolean activeStatus;
    private Date createdDate;
//    private List<PlanDetailDTO> listOfPlanDetailDTO;
//    private List<CommunityDTO> listOfCommunityDTO;
//    private List<EnquiryDTO> listOfEnquiryDTO;
//    private List<ContractDTO> listOfContractDTO;
//    private PlanRangeDTO planRangeDTO;
//    private PlanPeriodDTO planPeriodDTO;
//    private PlanTypeDTO planTypeDTO;

    // Getters and Setters for all fields

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getPlanRangeId() {
        return planRangeId;
    }

    public void setPlanRangeId(Integer planRangeId) {
        this.planRangeId = planRangeId;
    }

    public Integer getPlanPeriodId() {
        return planPeriodId;
    }

    public void setPlanPeriodId(Integer planPeriodId) {
        this.planPeriodId = planPeriodId;
    }

    public Integer getPlanTypeId() {
        return planTypeId;
    }

    public void setPlanTypeId(Integer planTypeId) {
        this.planTypeId = planTypeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

//    public List<PlanDetailDTO> getListOfPlanDetailDTO() {
//        return listOfPlanDetailDTO;
//    }
//
//    public void setListOfPlanDetailDTO(List<PlanDetailDTO> listOfPlanDetailDTO) {
//        this.listOfPlanDetailDTO = listOfPlanDetailDTO;
//    }
//
//    public List<CommunityDTO> getListOfCommunityDTO() {
//        return listOfCommunityDTO;
//    }
//
//    public void setListOfCommunityDTO(List<CommunityDTO> listOfCommunityDTO) {
//        this.listOfCommunityDTO = listOfCommunityDTO;
//    }
//
//    public List<EnquiryDTO> getListOfEnquiryDTO() {
//        return listOfEnquiryDTO;
//    }
//
//    public void setListOfEnquiryDTO(List<EnquiryDTO> listOfEnquiryDTO) {
//        this.listOfEnquiryDTO = listOfEnquiryDTO;
//    }
//
//    public List<ContractDTO> getListOfContractDTO() {
//        return listOfContractDTO;
//    }
//
//    public void setListOfContractDTO(List<ContractDTO> listOfContractDTO) {
//        this.listOfContractDTO = listOfContractDTO;
//    }

//    public PlanRangeDTO getPlanRangeDTO() {
//        return planRangeDTO;
//    }
//
//    public void setPlanRangeDTO(PlanRangeDTO planRangeDTO) {
//        this.planRangeDTO = planRangeDTO;
//    }
//
//    public PlanPeriodDTO getPlanPeriodDTO() {
//        return planPeriodDTO;
//    }
//
//    public void setPlanPeriodDTO(PlanPeriodDTO planPeriodDTO) {
//        this.planPeriodDTO = planPeriodDTO;
//    }
//
//    public PlanTypeDTO getPlanTypeDTO() {
//        return planTypeDTO;
//    }
//
//    public void setPlanTypeDTO(PlanTypeDTO planTypeDTO) {
//        this.planTypeDTO = planTypeDTO;
//    }

}
