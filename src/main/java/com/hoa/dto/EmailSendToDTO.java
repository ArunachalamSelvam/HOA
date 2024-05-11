package com.hoa.dto;

public class EmailSendToDTO {

	    private Integer emailSendToId;
	    private Integer emailDetailId;
	    private String emailTo;
	    private Integer clientId;
	    private Boolean activeStatus;
//	    private ClientDTO client;
//	    private EmailDetailDTO emaildetail;

	    // Getters and Setters for all fields

	    public Integer getEmailsendtoid() {
	        return emailSendToId;
	    }

	    public void setEmailsendtoid(Integer emailsendtoid) {
	        this.emailSendToId = emailsendtoid;
	    }

	    public Integer getEmaildetailid() {
	        return emailDetailId;
	    }

	    public void setEmaildetailid(Integer emaildetailid) {
	        this.emailDetailId = emaildetailid;
	    }

	    public String getEmailto() {
	        return emailTo;
	    }

	    public void setEmailto(String emailto) {
	        this.emailTo = emailto;
	    }

	    public Integer getClientid() {
	        return clientId;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientId = clientid;
	    }

	    public Boolean getActivestatus() {
	        return activeStatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
	    }

//	    public ClientDTO getClient() {
//	        return client;
//	    }
//
//	    public void setClient(ClientDTO client) {
//	        this.client = client;
//	    }
//
//	    public EmailDetailDTO getEmaildetail() {
//	        return emaildetail;
//	    }
//
//	    public void setEmaildetail(EmailDetailDTO emaildetail) {
//	        this.emaildetail = emaildetail;
//	    }

		@Override
		public String toString() {
			return "EmailsendtoDto [emailsendtoid=" + emailSendToId + ", emaildetailid=" + emailDetailId + ", emailto="
					+ emailTo + ", clientid=" + clientId + ", activestatus=" + activeStatus + "]";
		}

		public EmailSendToDTO(Integer emailsendtoid, Integer emaildetailid, String emailto, Integer clientid,
				Boolean activestatus) {
			super();
			this.emailSendToId = emailsendtoid;
			this.emailDetailId = emaildetailid;
			this.emailTo = emailto;
			this.clientId = clientid;
			this.activeStatus = activestatus;
//			this.client = client;
//			this.emaildetail = emaildetail;
		}

		public EmailSendToDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
