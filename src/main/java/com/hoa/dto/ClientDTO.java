package com.hoa.dto;

public class ClientDTO {

	    private Integer clientid;
	    private Integer userid;
	    private Integer communityid;
	    private String displayname;
	    private Integer numberofhouses;
	    private Boolean activestatus;
//	    private UserDTO user;
//	    private CommunityDTO community;
	    // Add DTOs for other related entities if needed

	    // Getter and Setter for clientid
	    public Integer getClientid() {
	        return clientid;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientid = clientid;
	    }

	    // Getter and Setter for userid
	    public Integer getUserid() {
	        return userid;
	    }

	    public void setUserid(Integer userid) {
	        this.userid = userid;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    // Getter and Setter for displayname
	    public String getDisplayname() {
	        return displayname;
	    }

	    public void setDisplayname(String displayname) {
	        this.displayname = displayname;
	    }

	    // Getter and Setter for numberofhouses
	    public Integer getNumberofhouses() {
	        return numberofhouses;
	    }

	    public void setNumberofhouses(Integer numberofhouses) {
	        this.numberofhouses = numberofhouses;
	    }

	    // Getter and Setter for activestatus
	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
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
			return "ClientDto [clientid=" + clientid + ", userid=" + userid + ", communityid=" + communityid
					+ ", displayname=" + displayname + ", numberofhouses=" + numberofhouses + ", activestatus="
					+ activestatus+ "]";
		}

		public ClientDTO(Integer userid, Integer communityid, String displayname,
				Integer numberofhouses) {
			this.userid = userid;
			this.communityid = communityid;
			this.displayname = displayname;
			this.numberofhouses = numberofhouses;
			this.activestatus = true;
			
		}
		
	

		public ClientDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
