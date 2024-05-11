package com.hoa.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO class for "State"
 */
public class StateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer stateId;
    private String stateName;
    private Integer countryId;
    private Boolean activeStatus;
    
//    private List<EnquiryDTO> listOfEnquiry;
//    private CountryDTO country;
//    private List<AddressDTO> listOfAddress;

    // Constructor
    public StateDTO() {
    }

    // Constructor with fields
    public StateDTO(Integer stateid, String statename, Integer countryid, Boolean activestatus) {
        this.stateId = stateid;
        this.stateName = statename;
        this.countryId = countryid;
        this.activeStatus = activestatus;
      
    }

    // Getters and Setters
    public Integer getStateid() {
        return stateId;
    }

    public void setStateid(Integer stateid) {
        this.stateId = stateid;
    }

    public String getStatename() {
        return stateName;
    }

    public void setStatename(String statename) {
        this.stateName = statename;
    }

    public Integer getCountryid() {
        return countryId;
    }

    public void setCountryid(Integer countryid) {
        this.countryId = countryid;
    }

    public Boolean getActivestatus() {
        return activeStatus;
    }

    public void setActivestatus(Boolean activestatus) {
        this.activeStatus = activestatus;
    }

//    public List<EnquiryDTO> getListOfEnquiry() {
//        return listOfEnquiry;
//    }
//
//    public void setListOfEnquiry(List<EnquiryDTO> listOfEnquiry) {
//        this.listOfEnquiry = listOfEnquiry;
//    }
//
//    public CountryDTO getCountry() {
//        return country;
//    }
//
//    public void setCountry(CountryDTO country) {
//        this.country = country;
//    }
//
//    public List<AddressDTO> getListOfAddress() {
//        return listOfAddress;
//    }
//
//    public void setListOfAddress(List<AddressDTO> listOfAddress) {
//        this.listOfAddress = listOfAddress;
//    }

    // toString method
    @Override
    public String toString() {
        return "StateDTO{" +
                "stateid=" + stateId +
                ", statename='" + stateName + '\'' +
                ", countryid=" + countryId +
                ", activestatus=" + activeStatus +
                '}';
    }
}
