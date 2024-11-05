package com.hexaware.vis.entities;

public class PolicyAddOn {
    private int addOnId;
    private int policyId;
    private String addOnName;
    private String description;
    private double additionalPremium;

    public PolicyAddOn() {}

    public PolicyAddOn(int addOnId, int policyId, String addOnName, String description, double additionalPremium) {
        this.addOnId = addOnId;
        this.policyId = policyId;
        this.addOnName = addOnName;
        this.description = description;
        this.additionalPremium = additionalPremium;
    }

	public int getAddOnId() {
		return addOnId;
	}

	public void setAddOnId(int addOnId) {
		this.addOnId = addOnId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getAddOnName() {
		return addOnName;
	}

	public void setAddOnName(String addOnName) {
		this.addOnName = addOnName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAdditionalPremium() {
		return additionalPremium;
	}

	public void setAdditionalPremium(double additionalPremium) {
		this.additionalPremium = additionalPremium;
	}

    @Override
    public String toString() {
        return "PolicyAddOn{" + "addOnId=" + addOnId + ", policyId=" + policyId + ", addOnName='" + addOnName + '\'' + '}';
    }
}
