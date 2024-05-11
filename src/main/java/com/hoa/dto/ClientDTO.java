package com.hoa.dto;

public class ClientDTO {

	    private Integer clientId;
	    private Integer userId;
	    private Integer communityId;
	    private String displayName;
	    private Integer numberOfHouses;
	    private Boolean activeStatus;
//	    private UserDTO user;
//	    private CommunityDTO community;
	    // Add DTOs for other related entities if needed

	    // Getter and Setter for clientid
	    public Integer getClientid() {
	        return clientId;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientId = clientid;
	    }

	    // Getter and Setter for userid
	    public Integer getUserid() {
	        return userId;
	    }

	    public void setUserid(Integer userid) {
	        this.userId = userid;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityId;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityId = communityid;
	    }

	    // Getter and Setter for displayname
	    public String getDisplayname() {
	        return displayName;
	    }

	    public void setDisplayname(String displayname) {
	        this.displayName = displayname;
	    }

	    // Getter and Setter for numberofhouses
	    public Integer getNumberofhouses() {
	        return numberOfHouses;
	    }

	    public void setNumberofhouses(Integer numberofhouses) {
	        this.numberOfHouses = numberofhouses;
	    }

	    // Getter and Setter for activestatus
	    public Boolean getActivestatus() {
	        return activeStatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activeStatus = activestatus;
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
			return "ClientDto [clientid=" + clientId + ", userid=" + userId + ", communityid=" + communityId
					+ ", displayname=" + displayName + ", numberofhouses=" + numberOfHouses + ", activestatus="
					+ activeStatus+ "]";
		}

		public ClientDTO(Integer userid, Integer communityid, String displayname,
				Integer numberofhouses) {
			this.userId = userid;
			this.communityId = communityid;
			this.displayName = displayname;
			this.numberOfHouses = numberofhouses;
			this.activeStatus = true;
			
		}
		
	

		public ClientDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
