package com.hexaware.vis.entities;

public class Quote {
    private int quoteId;
    private int proposalId;
    private double premiumAmount;
    private String additionalDetails;
    private String status;

    public Quote() {}

    public Quote(int quoteId, int proposalId, double premiumAmount, String additionalDetails, String status) {
        this.quoteId = quoteId;
        this.proposalId = proposalId;
        this.premiumAmount = premiumAmount;
        this.additionalDetails = additionalDetails;
        this.status = status;
    }

	public int getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}

	public int getProposalId() {
		return proposalId;
	}

	public void setProposalId(int proposalId) {
		this.proposalId = proposalId;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    @Override
    public String toString() {
        return "Quote{" + "quoteId=" + quoteId + ", proposalId=" + proposalId + ", premiumAmount=" + premiumAmount + ", status='" + status + '\'' + '}';
    }
}
