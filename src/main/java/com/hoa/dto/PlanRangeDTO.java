package com.hoa.dto;

public class PlanRangeDTO {

    private Integer id;
    private String planRange;
    private boolean activeStatus;

    // Getters and Setters for all fields

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlanRange() {
        return planRange;
    }

    public void setPlanRange(String planRange) {
        this.planRange = planRange;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

}
