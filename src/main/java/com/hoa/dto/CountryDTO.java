package com.hoa.dto;

import java.util.List;

public class CountryDTO {

	    private Integer countryId;
	    private String countryName;
	    private Boolean activeStatus;
	   

	    // Getters and Setters for all fields

	    public Integer getCountryid() {
	        return countryId;
	    }

	    public void setCountryid(Integer countryid) {
	        this.countryId = countryid;
	    }

	    public String getCountryname() {
	        return countryName;
	    }

	    public void setCountryname(String countryname) {
	        this.countryName = countryname;
	    }

	    public Boolean getActivestatus() {
	        return activeStatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
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
