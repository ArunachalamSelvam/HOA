package com.hoa.dto;

import java.util.Date;

public class AuditLogDTO {

	    private Integer auditLogId;
	    private Integer userId;
	    private String actionPerformed;
	    private String pageName;
	    private Integer communityId;
	    private Date createdDate;
	    

	    // Getter and Setter for auditlogid
	    public Integer getAuditlogid() {
	        return auditLogId;
	    }

	    public void setAuditlogid(Integer auditlogid) {
	        this.auditLogId = auditlogid;
	    }

	    // Getter and Setter for userid
	    public Integer getUserid() {
	        return userId;
	    }

	    public void setUserid(Integer userid) {
	        this.userId = userid;
	    }

	    // Getter and Setter for actionperformed
	    public String getActionperformed() {
	        return actionPerformed;
	    }

	    public void setActionperformed(String actionperformed) {
	        this.actionPerformed = actionperformed;
	    }

	    // Getter and Setter for pagename
	    public String getPagename() {
	        return pageName;
	    }

	    public void setPagename(String pagename) {
	        this.pageName = pagename;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityId;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityId = communityid;
	    }

	    // Getter and Setter for createddate
	    public Date getCreateddate() {
	        return createdDate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createdDate = createddate;
	    }

	    // Getter and Setter for user
//	    public UserDTO getUser() {
//	        return user;
//	    }
//
//	    public void setUser(UserDTO user) {
//	        this.user = user;
//	    }
//
//	    // Getter and Setter for community
//	    public CommunityDTO getCommunity() {
//	        return community;
//	    }
//
//	    public void setCommunity(CommunityDTO community) {
//	        this.community = community;
//	    }

		@Override
		public String toString() {
			return "AuditlogDto [auditlogid=" + auditLogId + ", userid=" + userId + ", actionperformed="
					+ actionPerformed + ", pagename=" + pageName + ", communityid=" + communityId + ", createddate="
					+ createdDate + "]";
		}

		public AuditLogDTO(Integer auditlogid, Integer userid, String actionperformed, String pagename,
				Integer communityid, Date createddate) {
			super();
			this.auditLogId = auditlogid;
			this.userId = userid;
			this.actionPerformed = actionperformed;
			this.pageName = pagename;
			this.communityId = communityid;
			this.createdDate = createddate;
			
		}

		public AuditLogDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
