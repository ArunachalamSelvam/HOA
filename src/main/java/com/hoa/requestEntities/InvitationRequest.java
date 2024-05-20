package com.hoa.requestEntities;

public class InvitationRequest {

    private String clientEmail;
    private String clientName;
    private String contractCode;
    private String boardMemberRole;
    private int roleId;

    // Getters and setters

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String communityCode) {
		this.contractCode = communityCode;
	}

	public String getBoardMemberRole() {
		return boardMemberRole;
	}

	public void setBoardMemberRole(String boardMemberRole) {
		this.boardMemberRole = boardMemberRole;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}

