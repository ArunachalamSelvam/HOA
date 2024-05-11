package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO class for "Violation"
 */
public class ViolationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer violationId;
    private Integer violationTypeId;
    private String name;
    private Double amount;
    private Double lateCharge;
    private Integer communityId;
    private Integer createdById;
    private Integer modifiedById;
    private Date createdDate;
    private Date modifiedDate;
//    private ViolationTypeDTO violationtype;
//    private List<ViolationDetailDTO> listOfViolationdetail;
//    private UserDTO user;
//    private UserDTO user2;
//    private CommunityDTO community;
    
    public Integer getViolationid() {
		return violationId;
	}

	public void setViolationid(Integer violationid) {
		this.violationId = violationid;
	}

	public Integer getViolationtypeid() {
		return violationTypeId;
	}

	public void setViolationtypeid(Integer violationtypeid) {
		this.violationTypeId = violationtypeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getLatecharge() {
		return lateCharge;
	}

	public void setLatecharge(Double latecharge) {
		this.lateCharge = latecharge;
	}

	public Integer getCommunityid() {
		return communityId;
	}

	public void setCommunityid(Integer communityid) {
		this.communityId = communityid;
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

//	public ViolationTypeDTO getViolationtype() {
//		return violationtype;
//	}
//
//	public void setViolationtype(ViolationTypeDTO violationtype) {
//		this.violationtype = violationtype;
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
//	public CommunityDTO getCommunity() {
//		return community;
//	}
//
//	public void setCommunity(CommunityDTO community) {
//		this.community = community;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "ViolationDTO{" +
                "violationid=" + violationId +
                ", violationtypeid=" + violationTypeId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", latecharge=" + lateCharge +
                ", communityid=" + communityId +
                ", createdbyid=" + createdById +
                ", modifiedbyid=" + modifiedById +
                ", createddate=" + createdDate +
                ", modifieddate=" + modifiedDate +
                '}';
    }

	public ViolationDTO(Integer violationid, Integer violationtypeid, String name, Double amount, Double latecharge,
			Integer communityid, Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate) {
		super();
		this.violationId = violationid;
		this.violationTypeId = violationtypeid;
		this.name = name;
		this.amount = amount;
		this.lateCharge = latecharge;
		this.communityId = communityid;
		this.createdById = createdbyid;
		this.modifiedById = modifiedbyid;
		this.createdDate = createddate;
		this.modifiedDate = modifieddate;
//		this.violationtype = violationtype;
//		this.listOfViolationdetail = listOfViolationdetail;
//		this.user = user;
//		this.user2 = user2;
//		this.community = community;
	}

	public ViolationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
