package com.hoa.dto;

import java.util.List;

public class CountryDTO {

	    private Integer countryId;
	    private String countryName;
	    private Boolean activeStatus;
	   

	    // Getters and Setters for all fields

	    public Integer getCountryId() {
	        return countryId;
	    }

	    public void setCountryId(Integer countryId) {
	        this.countryId = countryId;
	    }

	    public String getCountryName() {
	        return countryName;
	    }

	    public void setCountryName(String countryName) {
	        this.countryName = countryName;
	    }

	    public Boolean getActiveStatus() {
	        return activeStatus;
	    }

	    public void setActiveStatus(Boolean activeStatus) {
	        this.activeStatus = activeStatus;
	    }

	   
		@Override
		public String toString() {
			return "CountryDto [countryid=" + countryId + ", countryname=" + countryName + ", activestatus="
					+ activeStatus + "]";
		}

		public CountryDTO(Integer countryid, String countryname, Boolean activestatus
				) {
			super();
			this.countryId = countryid;
			this.countryName = countryname;
			this.activeStatus = activestatus;
			
		}

		public CountryDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
