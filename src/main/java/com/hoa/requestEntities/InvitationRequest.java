package com.hoa.requestEntities;

public class InvitationRequest {

    private String clientEmail;
    private String clientName;
    private String contractCode;

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
}

