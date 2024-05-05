package com.hoa.dto;

public class ClientAddressDTO {

	    private Integer clientaddressid;
	    private Integer addressid;
	    private Boolean isrented;
	    private Integer tenantid;
	    private Boolean activestatus;
	    private Integer clientid;
//	    private AddressDTO address;
//	    private ClientDTO client;
//	    private UserDTO user;

	    // Getter and Setter for clientaddressid
	    public Integer getClientaddressid() {
	        return clientaddressid;
	    }

	    public void setClientaddressid(Integer clientaddressid) {
	        this.clientaddressid = clientaddressid;
	    }

	    // Getter and Setter for addressid
	    public Integer getAddressid() {
	        return addressid;
	    }

	    public void setAddressid(Integer addressid) {
	        this.addressid = addressid;
	    }

	    // Getter and Setter for isrented
	    public Boolean getIsrented() {
	        return isrented;
	    }

	    public void setIsrented(Boolean isrented) {
	        this.isrented = isrented;
	    }

	    // Getter and Setter for tenantid
	    public Integer getTenantid() {
	        return tenantid;
	    }

	    public void setTenantid(Integer tenantid) {
	        this.tenantid = tenantid;
	    }

	    // Getter and Setter for activestatus
	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

	    // Getter and Setter for clientid
	    public Integer getClientid() {
	        return clientid;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientid = clientid;
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
			return "ClientaddressDto [clientaddressid=" + clientaddressid + ", addressid=" + addressid + ", isrented="
					+ isrented + ", tenantid=" + tenantid + ", activestatus=" + activestatus + ", clientid=" + clientid
					+  "]";
		}

		public ClientAddressDTO(Integer clientaddressid, Integer addressid, Boolean isrented, Integer tenantid,
				Boolean activestatus, Integer clientid, AddressDTO address, ClientDTO client, UserDTO user) {
			super();
			this.clientaddressid = clientaddressid;
			this.addressid = addressid;
			this.isrented = isrented;
			this.tenantid = tenantid;
			this.activestatus = activestatus;
			this.clientid = clientid;
//			this.address = address;
//			this.client = client;
//			this.user = user;
		}

		public ClientAddressDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
