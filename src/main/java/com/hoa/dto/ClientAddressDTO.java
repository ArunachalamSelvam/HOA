package com.hoa.dto;

public class ClientAddressDTO {

	    private Integer clientAddressId;
	    private Integer addressId;
	    private Boolean isRented;
	    private Integer tenantId;
	    private Boolean activeStatus;
	    private Integer clientId;
//	    private AddressDTO address;
//	    private ClientDTO client;
//	    private UserDTO user;

	    // Getter and Setter for clientaddressid
	    public Integer getClientaddressid() {
	        return clientAddressId;
	    }

	    public void setClientaddressid(Integer clientaddressid) {
	        this.clientAddressId = clientaddressid;
	    }

	    // Getter and Setter for addressid
	    public Integer getAddressid() {
	        return addressId;
	    }

	    public void setAddressid(Integer addressid) {
	        this.addressId = addressid;
	    }

	    // Getter and Setter for isrented
	    public Boolean getIsrented() {
	        return isRented;
	    }

	    public void setIsrented(Boolean isrented) {
	        this.isRented = isrented;
	    }

	    // Getter and Setter for tenantid
	    public Integer getTenantid() {
	        return tenantId;
	    }

	    public void setTenantid(Integer tenantid) {
	        this.tenantId = tenantid;
	    }

	    // Getter and Setter for activestatus
	    public Boolean getActivestatus() {
	        return activeStatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
	    }

	    // Getter and Setter for clientid
	    public Integer getClientid() {
	        return clientId;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientId = clientid;
	    }

	    // Getter and Setter for address
//	    public AddressDTO getAddress() {
//	        return address;
//	    }
//
//	    public void setAddress(AddressDTO address) {
//	        this.address = address;
//	    }
//
//	    // Getter and Setter for client
//	    public ClientDTO getClient() {
//	        return client;
//	    }
//
//	    public void setClient(ClientDTO client) {
//	        this.client = client;
//	    }
//
//	    // Getter and Setter for user
//	    public UserDTO getUser() {
//	        return user;
//	    }
//
//	    public void setUser(UserDTO user) {
//	        this.user = user;
//	    }

		@Override
		public String toString() {
			return "ClientaddressDto [clientaddressid=" + clientAddressId + ", addressid=" + addressId + ", isrented="
					+ isRented + ", tenantid=" + tenantId + ", activestatus=" + activeStatus + ", clientid=" + clientId
					+  "]";
		}

		public ClientAddressDTO(Integer clientaddressid, Integer addressid, Boolean isrented, Integer tenantid,
				Boolean activestatus, Integer clientid, AddressDTO address, ClientDTO client, UserDTO user) {
			super();
			this.clientAddressId = clientaddressid;
			this.addressId = addressid;
			this.isRented = isrented;
			this.tenantId = tenantid;
			this.activeStatus = activestatus;
			this.clientId = clientid;
//			this.address = address;
//			this.client = client;
//			this.user = user;
		}

		public ClientAddressDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
