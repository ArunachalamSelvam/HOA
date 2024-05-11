package com.hoa.dto;

import java.util.Date;

public class CommunityDocumentDTO {

	    private Integer communityDocumentId;
	    private Integer communityId;
	    private Integer ownerId;
	    private String name;
	    private Date uploadedDate;
	    private Integer uploadedById;
	    private String documentUrl;
	    private Integer createdById;
	    private Integer modifiedById;
	    private Date createdDate;
	    private Date modifiedDate;
	    private String documentType;

	    // Getters and Setters for all fields
	    public Integer getCommunitydocumentid() {
	        return communityDocumentId;
	    }

	    public void setCommunitydocumentid(Integer communitydocumentid) {
	        this.communityDocumentId = communitydocumentid;
	    }

	    public Integer getCommunityid() {
	        return communityId;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityId = communityid;
	    }

	    public Integer getOwnerid() {
	        return ownerId;
	    }

	    public void setOwnerid(Integer ownerid) {
	        this.ownerId = ownerid;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Date getUploadeddate() {
	        return uploadedDate;
	    }

	    public void setUploadeddate(Date uploadeddate) {
	        this.uploadedDate = uploadeddate;
	    }

	    public Integer getUploadedbyid() {
	        return uploadedById;
	    }

	    public void setUploadedbyid(Integer uploadedbyid) {
	        this.uploadedById = uploadedbyid;
	    }

	    public String getDocumenturl() {
	        return documentUrl;
	    }

	    public void setDocumenturl(String documenturl) {
	        this.documentUrl = documenturl;
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

	    public String getDocumenttype() {
	        return documentType;
	    }

	    public void setDocumenttype(String documenttype) {
	        this.documentType = documenttype;
	    }

		@Override
		public String toString() {
			return "CommunitydocumentDto [communitydocumentid=" + communityDocumentId + ", communityid=" + communityId
					+ ", ownerid=" + ownerId + ", name=" + name + ", uploadeddate=" + uploadedDate + ", uploadedbyid="
					+ uploadedById + ", documenturl=" + documentUrl + ", createdbyid=" + createdById + ", modifiedbyid="
					+ modifiedById + ", createddate=" + createdDate + ", modifieddate=" + modifiedDate
					+ ", documenttype=" + documentType + "]";
		}

		public CommunityDocumentDTO(Integer communitydocumentid, Integer communityid, Integer ownerid, String name,
				Date uploadeddate, Integer uploadedbyid, String documenturl, Integer createdbyid, Integer modifiedbyid,
				Date createddate, Date modifieddate, String documenttype) {
			super();
			this.communityDocumentId = communitydocumentid;
			this.communityId = communityid;
			this.ownerId = ownerid;
			this.name = name;
			this.uploadedDate = uploadeddate;
			this.uploadedById = uploadedbyid;
			this.documentUrl = documenturl;
			this.createdById = createdbyid;
			this.modifiedById = modifiedbyid;
			this.createdDate = createddate;
			this.modifiedDate = modifieddate;
			this.documentType = documenttype;
		}

		public CommunityDocumentDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
