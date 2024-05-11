package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class CommunityDTO {

	    private Integer communityId;
	    private String name;
	    private String communityCode;
	    private Integer addressId;
	    private String presidentEmailId;
	    private String presidentInviteStatus;
	    private Integer presidentUserId;
	    private String secretaryEmailId;
	    private String secretaryInviteStatus;
	    private Integer secretaryUserId;
	    private String treasurerEmailId;
	    private String treasurerInviteStatus;
	    private Integer treasurerUserId;
	    private Integer planId;
	    private String licenseStatus;
	    private Integer communitySize;
	    private Date planExpiredDate;
	    private String contactPerson;
	    private Integer totalOwners;
	    private Boolean activeStatus;
	    private Integer createdById;
	    private Date createdDate;
	    private Integer modifiedById;
	    private Date modifiedDate;
	    private String timeZone;
	    private Integer contractId;
//	    private List<HoaFeeDTO> listOfHoafee;
//	    private List<FaqDTO> listOfFaq;
//	    private List<ServiceRequestDTO> listOfServicerequest;
//	    private List<ViolationDTO> listOfViolation;
//	    private List<CommunityDocumentDTO> listOfCommunitydocument;
//	    private List<NewsDTO> listOfNews;
//	    private List<AuditLogDTO> listOfAuditlog;
//	    private List<EmailDetailDTO> listOfEmaildetail;
//	    private List<AmenityBookingDTO> listOfAmenitybooking;
//	    private List<VendorDTO> listOfVendor;
//	    private PlanDTO plan;
//	    private List<ClientDTO> listOfClient;
//	    private ContractDTO contract;
//	    private List<PaymentDetailDTO> listOfPaymentdetail;
//	    private List<BankDetailDTO> listOfBankdetail;
//	    private List<AmenityDTO> listOfAmenity;
//	    private List<ViolationDetailDTO> listOfViolationdetail;
//	    private AddressDTO address;
	    
		public Integer getCommunityid() {
			return communityId;
		}
		public void setCommunityid(Integer communityid) {
			this.communityId = communityid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCommunitycode() {
			return communityCode;
		}
		public void setCommunitycode(String communitycode) {
			this.communityCode = communitycode;
		}
		public Integer getAddressid() {
			return addressId;
		}
		public void setAddressid(Integer addressid) {
			this.addressId = addressid;
		}
		public String getPresidentemailid() {
			return presidentEmailId;
		}
		public void setPresidentemailid(String presidentemailid) {
			this.presidentEmailId = presidentemailid;
		}
		public String getPresidentinvitestatus() {
			return presidentInviteStatus;
		}
		public void setPresidentinvitestatus(String presidentinvitestatus) {
			this.presidentInviteStatus = presidentinvitestatus;
		}
		public Integer getPresidentuserid() {
			return presidentUserId;
		}
		public void setPresidentuserid(Integer presidentuserid) {
			this.presidentUserId = presidentuserid;
		}
		public String getSecretaryemailid() {
			return secretaryEmailId;
		}
		public void setSecretaryemailid(String secretaryemailid) {
			this.secretaryEmailId = secretaryemailid;
		}
		public String getSecretaryinvitestatus() {
			return secretaryInviteStatus;
		}
		public void setSecretaryinvitestatus(String secretaryinvitestatus) {
			this.secretaryInviteStatus = secretaryinvitestatus;
		}
		public Integer getSecretaryuserid() {
			return secretaryUserId;
		}
		public void setSecretaryuserid(Integer secretaryuserid) {
			this.secretaryUserId = secretaryuserid;
		}
		public String getTreasureremailid() {
			return treasurerEmailId;
		}
		public void setTreasureremailid(String treasureremailid) {
			this.treasurerEmailId = treasureremailid;
		}
		public String getTreasurerinvitestatus() {
			return treasurerInviteStatus;
		}
		public void setTreasurerinvitestatus(String treasurerinvitestatus) {
			this.treasurerInviteStatus = treasurerinvitestatus;
		}
		public Integer getTreasureruserid() {
			return treasurerUserId;
		}
		public void setTreasureruserid(Integer treasureruserid) {
			this.treasurerUserId = treasureruserid;
		}
		public Integer getPlanid() {
			return planId;
		}
		public void setPlanid(Integer planid) {
			this.planId = planid;
		}
		public String getLicensestatus() {
			return licenseStatus;
		}
		public void setLicensestatus(String licensestatus) {
			this.licenseStatus = licensestatus;
		}
		public Integer getCommunitysize() {
			return communitySize;
		}
		public void setCommunitysize(Integer communitysize) {
			this.communitySize = communitysize;
		}
		public Date getPlanexpiredate() {
			return planExpiredDate;
		}
		public void setPlanexpiredate(Date planexpiredate) {
			this.planExpiredDate = planexpiredate;
		}
		public String getContactperson() {
			return contactPerson;
		}
		public void setContactperson(String contactperson) {
			this.contactPerson = contactperson;
		}
		public Integer getTotalowners() {
			return totalOwners;
		}
		public void setTotalowners(Integer totalowners) {
			this.totalOwners = totalowners;
		}
		public Boolean getActivestatus() {
			return activeStatus;
		}
		public void setActivestatus(Boolean activestatus) {
			this.activeStatus = activestatus;
		}
		public Integer getCreatedbyid() {
			return createdById;
		}
		public void setCreatedbyid(Integer createdbyid) {
			this.createdById = createdbyid;
		}
		public Date getCreateddate() {
			return createdDate;
		}
		public void setCreateddate(Date createddate) {
			this.createdDate = createddate;
		}
		public Integer getModifiedbyid() {
			return modifiedById;
		}
		public void setModifiedbyid(Integer modifiedbyid) {
			this.modifiedById = modifiedbyid;
		}
		public Date getModifieddate() {
			return modifiedDate;
		}
		public void setModifieddate(Date modifieddate) {
			this.modifiedDate = modifieddate;
		}
		public String getTimezone() {
			return timeZone;
		}
		public void setTimezone(String timezone) {
			this.timeZone = timezone;
		}
		public Integer getContractid() {
			return contractId;
		}
		public void setContractid(Integer contractid) {
			this.contractId = contractid;
		}
//		public List<HoaFeeDTO> getListOfHoafee() {
//			return listOfHoafee;
//		}
//		public void setListOfHoafee(List<HoaFeeDTO> listOfHoafee) {
//			this.listOfHoafee = listOfHoafee;
//		}
//		public List<FaqDTO> getListOfFaq() {
//			return listOfFaq;
//		}
//		public void setListOfFaq(List<FaqDTO> listOfFaq) {
//			this.listOfFaq = listOfFaq;
//		}
//		public List<ServiceRequestDTO> getListOfServicerequest() {
//			return listOfServicerequest;
//		}
//		public void setListOfServicerequest(List<ServiceRequestDTO> listOfServicerequest) {
//			this.listOfServicerequest = listOfServicerequest;
//		}
//		public List<ViolationDTO> getListOfViolation() {
//			return listOfViolation;
//		}
//		public void setListOfViolation(List<ViolationDTO> listOfViolation) {
//			this.listOfViolation = listOfViolation;
//		}
//		public List<CommunityDocumentDTO> getListOfCommunitydocument() {
//			return listOfCommunitydocument;
//		}
//		public void setListOfCommunitydocument(List<CommunityDocumentDTO> listOfCommunitydocument) {
//			this.listOfCommunitydocument = listOfCommunitydocument;
//		}
//		public List<NewsDTO> getListOfNews() {
//			return listOfNews;
//		}
//		public void setListOfNews(List<NewsDTO> listOfNews) {
//			this.listOfNews = listOfNews;
//		}
//		public List<AuditLogDTO> getListOfAuditlog() {
//			return listOfAuditlog;
//		}
//		public void setListOfAuditlog(List<AuditLogDTO> listOfAuditlog) {
//			this.listOfAuditlog = listOfAuditlog;
//		}
//		public List<EmailDetailDTO> getListOfEmaildetail() {
//			return listOfEmaildetail;
//		}
//		public void setListOfEmaildetail(List<EmailDetailDTO> listOfEmaildetail) {
//			this.listOfEmaildetail = listOfEmaildetail;
//		}
//		public List<AmenityBookingDTO> getListOfAmenitybooking() {
//			return listOfAmenitybooking;
//		}
//		public void setListOfAmenitybooking(List<AmenityBookingDTO> listOfAmenitybooking) {
//			this.listOfAmenitybooking = listOfAmenitybooking;
//		}
//		public List<VendorDTO> getListOfVendor() {
//			return listOfVendor;
//		}
//		public void setListOfVendor(List<VendorDTO> listOfVendor) {
//			this.listOfVendor = listOfVendor;
//		}
//		public PlanDTO getPlan() {
//			return plan;
//		}
//		public void setPlan(PlanDTO plan) {
//			this.plan = plan;
//		}
//		public List<ClientDTO> getListOfClient() {
//			return listOfClient;
//		}
//		public void setListOfClient(List<ClientDTO> listOfClient) {
//			this.listOfClient = listOfClient;
//		}
//		public ContractDTO getContract() {
//			return contract;
//		}
//		public void setContract(ContractDTO contract) {
//			this.contract = contract;
//		}
//		public List<PaymentDetailDTO> getListOfPaymentdetail() {
//			return listOfPaymentdetail;
//		}
//		public void setListOfPaymentdetail(List<PaymentDetailDTO> listOfPaymentdetail) {
//			this.listOfPaymentdetail = listOfPaymentdetail;
//		}
//		public List<BankDetailDTO> getListOfBankdetail() {
//			return listOfBankdetail;
//		}
//		public void setListOfBankdetail(List<BankDetailDTO> listOfBankdetail) {
//			this.listOfBankdetail = listOfBankdetail;
//		}
//		public List<AmenityDTO> getListOfAmenity() {
//			return listOfAmenity;
//		}
//		public void setListOfAmenity(List<AmenityDTO> listOfAmenity) {
//			this.listOfAmenity = listOfAmenity;
//		}
//		public List<ViolationDetailDTO> getListOfViolationdetail() {
//			return listOfViolationdetail;
//		}
//		public void setListOfViolationdetail(List<ViolationDetailDTO> listOfViolationdetail) {
//			this.listOfViolationdetail = listOfViolationdetail;
//		}
//		public AddressDTO getAddress() {
//			return address;
//		}
//		public void setAddress(AddressDTO address) {
//			this.address = address;
//		}
		
		@Override
		public String toString() {
			return "CommunityDto [communityid=" + communityId + ", name=" + name + ", communitycode=" + communityCode
					+ ", addressid=" + addressId + ", presidentemailid=" + presidentEmailId + ", presidentinvitestatus="
					+ presidentInviteStatus + ", presidentuserid=" + presidentUserId + ", secretaryemailid="
					+ secretaryEmailId + ", secretaryinvitestatus=" + secretaryInviteStatus + ", secretaryuserid="
					+ secretaryUserId + ", treasureremailid=" + treasurerEmailId + ", treasurerinvitestatus="
					+ treasurerInviteStatus + ", treasureruserid=" + treasurerUserId + ", planid=" + planId
					+ ", licensestatus=" + licenseStatus + ", communitysize=" + communitySize + ", planexpiredate="
					+ planExpiredDate + ", contactperson=" + contactPerson + ", totalowners=" + totalOwners
					+ ", activestatus=" + activeStatus + ", createdbyid=" + createdById + ", createddate=" + createdDate
					+ ", modifiedbyid=" + modifiedById + ", modifieddate=" + modifiedDate + ", timezone=" + timeZone
					+ ", contractid=" + contractId +  "]";
		}
		
		public CommunityDTO(Integer communityid, String name, String communitycode, Integer addressid,
				String presidentemailid, String presidentinvitestatus, Integer presidentuserid, String secretaryemailid,
				String secretaryinvitestatus, Integer secretaryuserid, String treasureremailid,
				String treasurerinvitestatus, Integer treasureruserid, Integer planid, String licensestatus,
				Integer communitysize, Date planexpiredate, String contactperson, Integer totalowners,
				Boolean activestatus, Integer createdbyid, Date createddate, Integer modifiedbyid, Date modifieddate,
				String timezone, Integer contractid) {
			super();
			this.communityId = communityid;
			this.name = name;
			this.communityCode = communitycode;
			this.addressId = addressid;
			this.presidentEmailId = presidentemailid;
			this.presidentInviteStatus = presidentinvitestatus;
			this.presidentUserId = presidentuserid;
			this.secretaryEmailId = secretaryemailid;
			this.secretaryInviteStatus = secretaryinvitestatus;
			this.secretaryUserId = secretaryuserid;
			this.treasurerEmailId = treasureremailid;
			this.treasurerInviteStatus = treasurerinvitestatus;
			this.treasurerUserId = treasureruserid;
			this.planId = planid;
			this.licenseStatus = licensestatus;
			this.communitySize = communitysize;
			this.planExpiredDate = planexpiredate;
			this.contactPerson = contactperson;
			this.totalOwners = totalowners;
			this.activeStatus = activestatus;
			this.createdById = createdbyid;
			this.createdDate = createddate;
			this.modifiedById = modifiedbyid;
			this.modifiedDate = modifieddate;
			this.timeZone = timezone;
			this.contractId = contractid;
//			this.listOfHoafee = listOfHoafee;
//			this.listOfFaq = listOfFaq;
//			this.listOfServicerequest = listOfServicerequest;
//			this.listOfViolation = listOfViolation;
//			this.listOfCommunitydocument = listOfCommunitydocument;
//			this.listOfNews = listOfNews;
//			this.listOfAuditlog = listOfAuditlog;
//			this.listOfEmaildetail = listOfEmaildetail;
//			this.listOfAmenitybooking = listOfAmenitybooking;
//			this.listOfVendor = listOfVendor;
//			this.plan = plan;
//			this.listOfClient = listOfClient;
//			this.contract = contract;
//			this.listOfPaymentdetail = listOfPaymentdetail;
//			this.listOfBankdetail = listOfBankdetail;
//			this.listOfAmenity = listOfAmenity;
//			this.listOfViolationdetail = listOfViolationdetail;
//			this.address = address;
		}
		
		public CommunityDTO() {
			
		}

}
