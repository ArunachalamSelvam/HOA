package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO class for "Vendor"
 */
public class VendorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer vendorId;
    private String name;
    private String emailId;
    private String phone;
    private String zipCode;
    private Integer serviceTypeId;
    private Integer communityId;
    private Date licenseExpiryDate;
    private Integer createdById;
    private Integer modifiedById;
    private Date createdDate;
    private Date modifiedDate;
//    private UserDTO user;
//    private UserDTO user2;
//    private ServiceTypeDTO servicetype;
//    private CommunityDTO community;
//    private List<ServiceRequestDTO> listOfServicerequest;
   
    public Integer getVendorid() {
		return vendorId;
	}

	public void setVendorid(Integer vendorid) {
		this.vendorId = vendorid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailId;
	}

	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZipcode() {
		return zipCode;
	}

	public void setZipcode(String zipcode) {
		this.zipCode = zipcode;
	}

	public Integer getServicetypeid() {
		return serviceTypeId;
	}

	public void setServicetypeid(Integer servicetypeid) {
		this.serviceTypeId = servicetypeid;
	}

	public Integer getCommunityid() {
		return communityId;
	}

	public void setCommunityid(Integer communityid) {
		this.communityId = communityid;
	}

	public Date getLicenseexpirydate() {
		return licenseExpiryDate;
	}

	public void setLicenseexpirydate(Date licenseexpirydate) {
		this.licenseExpiryDate = licenseexpirydate;
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

//	public UserDTO getUser() {
//		return user;
//	}
//
//	public void setUser(UserDTO user) {
//		this.user = user;
//	}
//
//	public UserDTO getUser2() {
//		return user2;
//	}
//
//	public void setUser2(UserDTO user2) {
//		this.user2 = user2;
//	}
//
//	public ServiceTypeDTO getServicetype() {
//		return servicetype;
//	}
//
//	public void setServicetype(ServiceTypeDTO servicetype) {
//		this.servicetype = servicetype;
//	}
//
//	public CommunityDTO getCommunity() {
//		return community;
//	}
//
//	public void setCommunity(CommunityDTO community) {
//		this.community = community;
//	}
//
//	public List<ServiceRequestDTO> getListOfServicerequest() {
//		return listOfServicerequest;
//	}
//
//	public void setListOfServicerequest(List<ServiceRequestDTO> listOfServicerequest) {
//		this.listOfServicerequest = listOfServicerequest;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "VendorDTO{" +
                "vendorid=" + vendorId +
                ", name='" + name + '\'' +
                ", emailid='" + emailId + '\'' +
                ", phone='" + phone + '\'' +
                ", zipcode='" + zipCode + '\'' +
                ", servicetypeid=" + serviceTypeId +
                ", communityid=" + communityId +
                ", licenseexpirydate=" + licenseExpiryDate +
                ", createdbyid=" + createdById +
                ", modifiedbyid=" + modifiedById +
                ", createddate=" + createdDate +
                ", modifieddate=" + modifiedDate +
                '}';
    }

	public VendorDTO(Integer vendorid, String name, String emailid, String phone, String zipcode, Integer servicetypeid,
			Integer communityid, Date licenseexpirydate, Integer createdbyid, Integer modifiedbyid, Date createddate,
			Date modifieddate) {
		super();
		this.vendorId = vendorid;
		this.name = name;
		this.emailId = emailid;
		this.phone = phone;
		this.zipCode = zipcode;
		this.serviceTypeId = servicetypeid;
		this.communityId = communityid;
		this.licenseExpiryDate = licenseexpirydate;
		this.createdById = createdbyid;
		this.modifiedById = modifiedbyid;
		this.createdDate = createddate;
		this.modifiedDate = modifieddate;
//		this.user = user;
//		this.user2 = user2;
//		this.servicetype = servicetype;
//		this.community = community;
//		this.listOfServicerequest = listOfServicerequest;
	}

	public VendorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
