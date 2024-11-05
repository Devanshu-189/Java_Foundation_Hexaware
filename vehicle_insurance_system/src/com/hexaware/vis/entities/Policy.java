package com.hexaware.vis.entities;

public class Policy {
    private int policyId;
    private String policyName;
    private String description;
    private String status;
    private double premiumAmount;

    public Policy() {}

    public Policy(int policyId, String policyName, String description, String status, double premiumAmount) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.description = description;
        this.status = status;
        this.premiumAmount = premiumAmount;
    }

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

    @Override
    public String toString() {
        return "Policy{" + "policyId=" + policyId + ", policyName='" + policyName + '\'' + ", status='" + status + '\'' + '}';
    }
}
