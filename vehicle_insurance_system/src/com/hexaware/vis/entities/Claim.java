package com.hexaware.vis.entities;

public class Claim {
    private int claimId;
    private int policyId;
    private int userId;
    private String claimStatus;
    private String description;

    public Claim() {}

    public Claim(int claimId, int policyId, int userId, String claimStatus, String description) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.userId = userId;
        this.claimStatus = claimStatus;
        this.description = description;
    }

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    @Override
    public String toString() {
        return "Claim{" + "claimId=" + claimId + ", policyId=" + policyId + ", userId=" + userId + ", claimStatus='" + claimStatus + '\'' + '}';
    }
}
