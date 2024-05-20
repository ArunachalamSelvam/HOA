package com.hoa.dto;

import java.util.Date;

public class AddressDTO {

	    private Integer addressId;
	    private String address;
	    private String city;
	    private Integer stateId;
	    private Integer countryId;
	    private Integer zipCode ;
	    private Boolean activeStatus;
//	    private Integer createdbyid;
//	    private Integer modifiedbyid;
//	    private Date createddate;
//	    private Date modifieddate;

	    // Getter and Setter for addressid
	    public Integer getAddressId() {
	        return addressId;
	    }

	    public void setAddressId(Integer addressId) {
	        this.addressId = addressId;
	    }

	    // Getter and Setter for address
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    // Getter and Setter for city
	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    // Getter and Setter for stateid
	    public Integer getStateId() {
	        return stateId;
	    }

	    public void setStateId(Integer stateId) {
	        this.stateId = stateId;
	    }

	    // Getter and Setter for countryid
	    public Integer getCountryId() {
	        return countryId;
	    }

	    public void setCountryId(Integer countryId) {
	        this.countryId = countryId;
	    }

	    // Getter and Setter for activestatus
	    public Boolean getActiveStatus() {
	        return activeStatus;
	    }

	    public void setActiveStatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
	    }

	    // Getter and Setter for createdbyid
//	    public Integer getCreatedbyid() {
//	        return createdbyid;
//	    }
//
//	    public void setCreatedbyid(Integer createdbyid) {
//	        this.createdbyid = createdbyid;
//	    }
//
//	    // Getter and Setter for modifiedbyid
//	    public Integer getModifiedbyid() {
//	        return modifiedbyid;
//	    }
//
//	    public void setModifiedbyid(Integer modifiedbyid) {
//	        this.modifiedbyid = modifiedbyid;
//	    }
//
//	    // Getter and Setter for createddate
//	    public Date getCreateddate() {
//	        return createddate;
//	    }
//
//	    public void setCreateddate(Date createddate) {
//	        this.createddate = createddate;
//	    }
//
//	    // Getter and Setter for modifieddate
//	    public Date getModifieddate() {
//	        return modifieddate;
//	    }
//
//	    public void setModifieddate(Date modifieddate) {
//	        this.modifieddate = modifieddate;
//	    }

		@Override
		public String toString() {
			return "AddressDto [addressid=" + addressId + ", address=" + address + ", city=" + city + ", stateid="
					+ stateId + ", countryid=" + countryId + ", activestatus=" + activeStatus + ", createdbyid="
					+"]";
		}

		public AddressDTO(Integer addressId, String address, String city, Integer stateId, Integer countryId, Integer zipCode,
				Boolean activeStatus) {
			super();
			this.addressId = addressId;
			this.address = address;
			this.city = city;
			this.stateId = stateId;
			this.countryId = countryId;
			this.zipCode = zipCode;
			this.activeStatus = activeStatus;
//			this.createdbyid = createdbyid;
//			this.modifiedbyid = modifiedbyid;
//			this.createddate = createddate;
//			this.modifieddate = modifieddate;
		}

		public AddressDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Integer getZipCode() {
			return zipCode;
		}

		public void setZipCode(Integer zipCode) {
			this.zipCode = zipCode;
		}

}
