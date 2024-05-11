package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class EmailDetailDTO {

	    private Integer emailDetailId;
	    private Integer communityId;
	    private String emailType;
	    private String emailFrom;
	    private String emailTo;
	    private String subject;
	    private String content;
	    private String emailStatus;
	    private Date createdDate;
	    private Date sendDate;
//	    private List<EmailSendToDTO> listOfEmailsendto;
//	    private CommunityDTO community;

	    // Getters and Setters for all fields

	    public Integer getEmaildetailid() {
	        return emailDetailId;
	    }

	    public void setEmaildetailid(Integer emaildetailid) {
	        this.emailDetailId = emaildetailid;
	    }

	    public Integer getCommunityid() {
	        return communityId;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityId = communityid;
	    }

	    public String getEmailtype() {
	        return emailType;
	    }

	    public void setEmailtype(String emailtype) {
	        this.emailType = emailtype;
	    }

	    public String getEmailfrom() {
	        return emailFrom;
	    }

	    public void setEmailfrom(String emailfrom) {
	        this.emailFrom = emailfrom;
	    }

	    public String getEmailto() {
	        return emailTo;
	    }

	    public void setEmailto(String emailto) {
	        this.emailTo = emailto;
	    }

	    public String getSubject() {
	        return subject;
	    }

	    public void setSubject(String subject) {
	        this.subject = subject;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public String getEmailstatus() {
	        return emailStatus;
	    }

	    public void setEmailstatus(String emailstatus) {
	        this.emailStatus = emailstatus;
	    }

	    public Date getCreateddate() {
	        return createdDate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createdDate = createddate;
	    }

	    public Date getSenddate() {
	        return sendDate;
	    }

	    public void setSenddate(Date senddate) {
	        this.sendDate = senddate;
	    }

//	    public List<EmailSendToDTO> getListOfEmailsendto() {
//	        return listOfEmailsendto;
//	    }
//
//	    public void setListOfEmailsendto(List<EmailSendToDTO> listOfEmailsendto) {
//	        this.listOfEmailsendto = listOfEmailsendto;
//	    }
//
//	    public CommunityDTO getCommunity() {
//	        return community;
//	    }
//
//	    public void setCommunity(CommunityDTO community) {
//	        this.community = community;
//	    }

		@Override
		public String toString() {
			return "EmaildetailDto [emaildetailid=" + emailDetailId + ", communityid=" + communityId + ", emailtype="
					+ emailType + ", emailfrom=" + emailFrom + ", emailto=" + emailTo + ", subject=" + subject
					+ ", content=" + content + ", emailstatus=" + emailStatus + ", createddate=" + createdDate
					+ ", senddate=" + sendDate +  "]";
		}

		public EmailDetailDTO(Integer emaildetailid, Integer communityid, String emailtype, String emailfrom,
				String emailto, String subject, String content, String emailstatus, Date createddate, Date senddate) {
			super();
			this.emailDetailId = emaildetailid;
			this.communityId = communityid;
			this.emailType = emailtype;
			this.emailFrom = emailfrom;
			this.emailTo = emailto;
			this.subject = subject;
			this.content = content;
			this.emailStatus = emailstatus;
			this.createdDate = createddate;
			this.sendDate = senddate;
//			this.listOfEmailsendto = listOfEmailsendto;
//			this.community = community;
		}

		public EmailDetailDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	   
}
