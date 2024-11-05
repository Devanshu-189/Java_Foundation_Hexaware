package com.hexaware.vis.entities;

public class Proposal {
    private int proposalId;
    private int userId;
    private int policyId;
    private String vehicleType;
    private String status;

    public Proposal() {}

    public Proposal(int proposalId, int userId, int policyId, String vehicleType, String status) {
        this.proposalId = proposalId;
        this.userId = userId;
        this.policyId = policyId;
        this.vehicleType = vehicleType;
        this.status = status;
    }

	public int getProposalId() {
		return proposalId;
	}

	public void setProposalId(int proposalId) {
		this.proposalId = proposalId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    @Override
    public String toString() {
        return "Proposal{" + "proposalId=" + proposalId + ", userId=" + userId + ", policyId=" + policyId + ", status='" + status + '\'' + '}';
    }
}
