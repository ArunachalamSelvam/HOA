package com.hoa.dto;

import java.util.List;

public class AmenityTypeDTO {

	    private Integer id;
	    private String name;
	    private Boolean activeStatus;
//	    private List<AmenityDTO> listOfAmenity;

	    // Getter and Setter for id
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for activestatus
	    public Boolean getActivestatus() {
	        return activeStatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
	    }

	    // Getter and Setter for listOfAmenity
//	    public List<AmenityDTO> getListOfAmenity() {
//	        return listOfAmenity;
//	    }
//
//	    public void setListOfAmenity(List<AmenityDTO> listOfAmenity) {
//	        this.listOfAmenity = listOfAmenity;
//	    }

		@Override
		public String toString() {
			return "AmenitytypeDto [id=" + id + ", name=" + name + ", activestatus=" + activeStatus + ", listOfAmenity="
					 + "]";
		}

		public AmenityTypeDTO(Integer id, String name, Boolean activestatus) {
			super();
			this.id = id;
			this.name = name;
			this.activeStatus = activestatus;
			
		}

		public AmenityTypeDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
