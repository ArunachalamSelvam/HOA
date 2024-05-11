package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * DTO class for "User"
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

//    private Integer userid;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobileNumber;
    private Boolean mobileIsVerified;
    private String emailId;
    private Boolean emailIdIsVerified;
    @ApiModelProperty(value = "Specifies if the user is a client", example = "false")
    private Boolean isClient;
    private Integer otp;
    private Integer roleId;
    private String password;
    private Boolean activeStatus;
    private Date lastLogin;
//    private List<ClientDTO> listOfClient;
//    private List<HoaFeeDTO> listOfHoafee2;
//    private List<AddressDTO> listOfAddress;
//    private List<PaymentDetailDTO> listOfPaymentdetail;
//    private List<ViolationDTO> listOfViolation;
//    private List<BankDetailDTO> listOfBankdetail2;
//    private List<ContractDTO> listOfContract2;
//    private List<ViolationDetailDTO> listOfViolationdetail2;
//    private List<NewsDTO> listOfNews;
//    private List<AmenityDTO> listOfAmenity;
//    private List<PaymentDetailDTO> listOfPaymentdetail2;
//    private List<AmenityDTO> listOfAmenity2;
//    private List<VendorDTO> listOfVendor;
//    private List<CommunityDocumentDTO> listOfCommunitydocument4;
//    private List<CommunityDocumentDTO> listOfCommunitydocument;
//    private List<AddressDTO> listOfAddress2;
//    private List<AmenityBookingDTO> listOfAmenitybooking;
//    private List<NewsDTO> listOfNews2;
//    private List<HoaFeeDTO> listOfHoafee;
//    private List<ContractDTO> listOfContract;
//    private RoleDTO role;
//    private List<ServiceRequestDTO> listOfServicerequest;
//    private List<ClientAddressDTO> listOfClientaddress;
//    private List<EmployeeDTO> listOfEmployee;
//    private List<ServiceRequestDTO> listOfServicerequest2;
//    private List<AmenityBookingDTO> listOfAmenitybooking3;
//    private List<FaqDTO> listOfFaq2;
//    private List<CommunityDocumentDTO> listOfCommunitydocument3;
//    private List<AmenityBookingDTO> listOfAmenitybooking2;
//    private List<ViolationDTO> listOfViolation2;
//    private List<BankDetailDTO> listOfBankdetail;
//    private List<VendorDTO> listOfVendor2;
//    private List<ViolationDetailDTO> listOfViolationdetail;
//    private List<CommunityDocumentDTO> listOfCommunitydocument2;
//    private List<FaqDTO> listOfFaq;
//    private List<AuditLogDTO> listOfAuditlog;
    
//	public Integer getUserid() {
//		return userid;
//	}
//
//	public void setUserid(Integer userid) {
//		this.userid = userid;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Boolean getMobileIsVerified() {
		return mobileIsVerified;
	}

	public void setMobileIsVerified(Boolean mobileisverified) {
		this.mobileIsVerified = mobileisverified;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Boolean getEmailidisverified() {
		return emailIdIsVerified;
	}

	public void setEmailidisverified(Boolean emailIdIsVerified) {
		this.emailIdIsVerified = emailIdIsVerified;
	}

	public Boolean getIsclient() {
		return isClient;
	}

	public void setIsclient(Boolean isClient) {
		this.isClient = isClient;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public Integer getRoleid() {
		return roleId;
	}

	public void setRoleid(Integer roleId) {
		this.roleId = roleId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActivestatus() {
		return activeStatus;
	}

	public void setActivestatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Date getLastlogin() {
		return lastLogin;
	}

	public void setLastlogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

//	public List<ClientDTO> getListOfClient() {
//		return listOfClient;
//	}
//
//	public void setListOfClient(List<ClientDTO> listOfClient) {
//		this.listOfClient = listOfClient;
//	}
//
//	public List<HoaFeeDTO> getListOfHoafee2() {
//		return listOfHoafee2;
//	}
//
//	public void setListOfHoafee2(List<HoaFeeDTO> listOfHoafee2) {
//		this.listOfHoafee2 = listOfHoafee2;
//	}
//
//	public List<AddressDTO> getListOfAddress() {
//		return listOfAddress;
//	}
//
//	public void setListOfAddress(List<AddressDTO> listOfAddress) {
//		this.listOfAddress = listOfAddress;
//	}
//
//	public List<PaymentDetailDTO> getListOfPaymentdetail() {
//		return listOfPaymentdetail;
//	}
//
//	public void setListOfPaymentdetail(List<PaymentDetailDTO> listOfPaymentdetail) {
//		this.listOfPaymentdetail = listOfPaymentdetail;
//	}
//
//	public List<ViolationDTO> getListOfViolation() {
//		return listOfViolation;
//	}
//
//	public void setListOfViolation(List<ViolationDTO> listOfViolation) {
//		this.listOfViolation = listOfViolation;
//	}
//
//	public List<BankDetailDTO> getListOfBankdetail2() {
//		return listOfBankdetail2;
//	}
//
//	public void setListOfBankdetail2(List<BankDetailDTO> listOfBankdetail2) {
//		this.listOfBankdetail2 = listOfBankdetail2;
//	}
//
//	public List<ContractDTO> getListOfContract2() {
//		return listOfContract2;
//	}
//
//	public void setListOfContract2(List<ContractDTO> listOfContract2) {
//		this.listOfContract2 = listOfContract2;
//	}
//
//	public List<ViolationDetailDTO> getListOfViolationdetail2() {
//		return listOfViolationdetail2;
//	}
//
//	public void setListOfViolationdetail2(List<ViolationDetailDTO> listOfViolationdetail2) {
//		this.listOfViolationdetail2 = listOfViolationdetail2;
//	}
//
//	public List<NewsDTO> getListOfNews() {
//		return listOfNews;
//	}
//
//	public void setListOfNews(List<NewsDTO> listOfNews) {
//		this.listOfNews = listOfNews;
//	}
//
//	public List<AmenityDTO> getListOfAmenity() {
//		return listOfAmenity;
//	}
//
//	public void setListOfAmenity(List<AmenityDTO> listOfAmenity) {
//		this.listOfAmenity = listOfAmenity;
//	}
//
//	public List<PaymentDetailDTO> getListOfPaymentdetail2() {
//		return listOfPaymentdetail2;
//	}
//
//	public void setListOfPaymentdetail2(List<PaymentDetailDTO> listOfPaymentdetail2) {
//		this.listOfPaymentdetail2 = listOfPaymentdetail2;
//	}
//
//	public List<AmenityDTO> getListOfAmenity2() {
//		return listOfAmenity2;
//	}
//
//	public void setListOfAmenity2(List<AmenityDTO> listOfAmenity2) {
//		this.listOfAmenity2 = listOfAmenity2;
//	}
//
//	public List<VendorDTO> getListOfVendor() {
//		return listOfVendor;
//	}
//
//	public void setListOfVendor(List<VendorDTO> listOfVendor) {
//		this.listOfVendor = listOfVendor;
//	}
//
//	public List<CommunityDocumentDTO> getListOfCommunitydocument4() {
//		return listOfCommunitydocument4;
//	}
//
//	public void setListOfCommunitydocument4(List<CommunityDocumentDTO> listOfCommunitydocument4) {
//		this.listOfCommunitydocument4 = listOfCommunitydocument4;
//	}
//
//	public List<CommunityDocumentDTO> getListOfCommunitydocument() {
//		return listOfCommunitydocument;
//	}
//
//	public void setListOfCommunitydocument(List<CommunityDocumentDTO> listOfCommunitydocument) {
//		this.listOfCommunitydocument = listOfCommunitydocument;
//	}
//
//	public List<AddressDTO> getListOfAddress2() {
//		return listOfAddress2;
//	}
//
//	public void setListOfAddress2(List<AddressDTO> listOfAddress2) {
//		this.listOfAddress2 = listOfAddress2;
//	}
//
//	public List<AmenityBookingDTO> getListOfAmenitybooking() {
//		return listOfAmenitybooking;
//	}
//
//	public void setListOfAmenitybooking(List<AmenityBookingDTO> listOfAmenitybooking) {
//		this.listOfAmenitybooking = listOfAmenitybooking;
//	}
//
//	public List<NewsDTO> getListOfNews2() {
//		return listOfNews2;
//	}
//
//	public void setListOfNews2(List<NewsDTO> listOfNews2) {
//		this.listOfNews2 = listOfNews2;
//	}
//
//	public List<HoaFeeDTO> getListOfHoafee() {
//		return listOfHoafee;
//	}
//
//	public void setListOfHoafee(List<HoaFeeDTO> listOfHoafee) {
//		this.listOfHoafee = listOfHoafee;
//	}
//
//	public List<ContractDTO> getListOfContract() {
//		return listOfContract;
//	}
//
//	public void setListOfContract(List<ContractDTO> listOfContract) {
//		this.listOfContract = listOfContract;
//	}
//
//	public RoleDTO getRole() {
//		return role;
//	}
//
//	public void setRole(RoleDTO role) {
//		this.role = role;
//	}
//
//	public List<ServiceRequestDTO> getListOfServicerequest() {
//		return listOfServicerequest;
//	}
//
//	public void setListOfServicerequest(List<ServiceRequestDTO> listOfServicerequest) {
//		this.listOfServicerequest = listOfServicerequest;
//	}
//
//	public List<ClientAddressDTO> getListOfClientaddress() {
//		return listOfClientaddress;
//	}
//
//	public void setListOfClientaddress(List<ClientAddressDTO> listOfClientaddress) {
//		this.listOfClientaddress = listOfClientaddress;
//	}
//
//	public List<EmployeeDTO> getListOfEmployee() {
//		return listOfEmployee;
//	}
//
//	public void setListOfEmployee(List<EmployeeDTO> listOfEmployee) {
//		this.listOfEmployee = listOfEmployee;
//	}
//
//	public List<ServiceRequestDTO> getListOfServicerequest2() {
//		return listOfServicerequest2;
//	}
//
//	public void setListOfServicerequest2(List<ServiceRequestDTO> listOfServicerequest2) {
//		this.listOfServicerequest2 = listOfServicerequest2;
//	}
//
//	public List<AmenityBookingDTO> getListOfAmenitybooking3() {
//		return listOfAmenitybooking3;
//	}
//
//	public void setListOfAmenitybooking3(List<AmenityBookingDTO> listOfAmenitybooking3) {
//		this.listOfAmenitybooking3 = listOfAmenitybooking3;
//	}
//
//	public List<FaqDTO> getListOfFaq2() {
//		return listOfFaq2;
//	}
//
//	public void setListOfFaq2(List<FaqDTO> listOfFaq2) {
//		this.listOfFaq2 = listOfFaq2;
//	}
//
//	public List<CommunityDocumentDTO> getListOfCommunitydocument3() {
//		return listOfCommunitydocument3;
//	}
//
//	public void setListOfCommunitydocument3(List<CommunityDocumentDTO> listOfCommunitydocument3) {
//		this.listOfCommunitydocument3 = listOfCommunitydocument3;
//	}
//
//	public List<AmenityBookingDTO> getListOfAmenitybooking2() {
//		return listOfAmenitybooking2;
//	}
//
//	public void setListOfAmenitybooking2(List<AmenityBookingDTO> listOfAmenitybooking2) {
//		this.listOfAmenitybooking2 = listOfAmenitybooking2;
//	}
//
//	public List<ViolationDTO> getListOfViolation2() {
//		return listOfViolation2;
//	}
//
//	public void setListOfViolation2(List<ViolationDTO> listOfViolation2) {
//		this.listOfViolation2 = listOfViolation2;
//	}
//
//	public List<BankDetailDTO> getListOfBankdetail() {
//		return listOfBankdetail;
//	}
//
//	public void setListOfBankdetail(List<BankDetailDTO> listOfBankdetail) {
//		this.listOfBankdetail = listOfBankdetail;
//	}
//
//	public List<VendorDTO> getListOfVendor2() {
//		return listOfVendor2;
//	}
//
//	public void setListOfVendor2(List<VendorDTO> listOfVendor2) {
//		this.listOfVendor2 = listOfVendor2;
//	}
//
//	public List<ViolationDetailDTO> getListOfViolationdetail() {
//		return listOfViolationdetail;
//	}
//
//	public void setListOfViolationdetail(List<ViolationDetailDTO> listOfViolationdetail) {
//		this.listOfViolationdetail = listOfViolationdetail;
//	}
//
//	public List<CommunityDocumentDTO> getListOfCommunitydocument2() {
//		return listOfCommunitydocument2;
//	}
//
//	public void setListOfCommunitydocument2(List<CommunityDocumentDTO> listOfCommunitydocument2) {
//		this.listOfCommunitydocument2 = listOfCommunitydocument2;
//	}
//
//	public List<FaqDTO> getListOfFaq() {
//		return listOfFaq;
//	}
//
//	public void setListOfFaq(List<FaqDTO> listOfFaq) {
//		this.listOfFaq = listOfFaq;
//	}
//
//	public List<AuditLogDTO> getListOfAuditlog() {
//		return listOfAuditlog;
//	}
//
//	public void setListOfAuditlog(List<AuditLogDTO> listOfAuditlog) {
//		this.listOfAuditlog = listOfAuditlog;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "UserDTO{" +
                ", firstname='" + firstName + '\'' +
                ", middlename='" + middleName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", mobilenumber='" + mobileNumber + '\'' +
                ", mobileisverified=" + mobileIsVerified +
                ", emailid='" + emailId + '\'' +
                ", emailidisverified=" + emailIdIsVerified +
                ", isclient=" + isClient +
                ", otp=" + otp +
                ", roleid=" + roleId +
                ", password='" + password + '\'' +
                ", activestatus=" + activeStatus +
                ", lastlogin=" + lastLogin +
                '}';
    }

	
	
	public UserDTO( String firstname, String middlename, String lastname, String mobilenumber,
			Boolean mobileisverified, String emailid, Boolean emailidisverified, Boolean isclient, Integer otp,
			Integer roleid, String password, Boolean activestatus, Date lastlogin ) {
		super();
//		this.userid = userid;
		this.firstName = firstname;
		this.middleName = middlename;
		this.lastName = lastname;
		this.mobileNumber = mobilenumber;
		this.mobileIsVerified = mobileisverified;
		this.emailId = emailid;
		this.emailIdIsVerified = emailidisverified;
		this.isClient = false;
		this.otp = otp;
		this.roleId = roleid;
		this.password = password;
		this.activeStatus = activestatus;
		this.lastLogin = lastlogin;
//		this.listOfClient = listOfClient;
//		this.listOfHoafee2 = listOfHoafee2;
//		this.listOfAddress = listOfAddress;
//		this.listOfPaymentdetail = listOfPaymentdetail;
//		this.listOfViolation = listOfViolation;
//		this.listOfBankdetail2 = listOfBankdetail2;
//		this.listOfContract2 = listOfContract2;
//		this.listOfViolationdetail2 = listOfViolationdetail2;
//		this.listOfNews = listOfNews;
//		this.listOfAmenity = listOfAmenity;
//		this.listOfPaymentdetail2 = listOfPaymentdetail2;
//		this.listOfAmenity2 = listOfAmenity2;
//		this.listOfVendor = listOfVendor;
//		this.listOfCommunitydocument4 = listOfCommunitydocument4;
//		this.listOfCommunitydocument = listOfCommunitydocument;
//		this.listOfAddress2 = listOfAddress2;
//		this.listOfAmenitybooking = listOfAmenitybooking;
//		this.listOfNews2 = listOfNews2;
//		this.listOfHoafee = listOfHoafee;
//		this.listOfContract = listOfContract;
//		this.role = role;
//		this.listOfServicerequest = listOfServicerequest;
//		this.listOfClientaddress = listOfClientaddress;
//		this.listOfEmployee = listOfEmployee;
//		this.listOfServicerequest2 = listOfServicerequest2;
//		this.listOfAmenitybooking3 = listOfAmenitybooking3;
//		this.listOfFaq2 = listOfFaq2;
//		this.listOfCommunitydocument3 = listOfCommunitydocument3;
//		this.listOfAmenitybooking2 = listOfAmenitybooking2;
//		this.listOfViolation2 = listOfViolation2;
//		this.listOfBankdetail = listOfBankdetail;
//		this.listOfVendor2 = listOfVendor2;
//		this.listOfViolationdetail = listOfViolationdetail;
//		this.listOfCommunitydocument2 = listOfCommunitydocument2;
//		this.listOfFaq = listOfFaq;
//		this.listOfAuditlog = listOfAuditlog;
	}

	public UserDTO() {
		super();
		this.isClient = false; // Set isClient to false by default	
	}

}
