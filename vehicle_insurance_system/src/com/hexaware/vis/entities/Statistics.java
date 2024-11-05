package com.hexaware.vis.entities;

public class Statistics {
    private int statisticId;
    private int totalPolicies;
    private int totalClaims;
    private double totalPremiumsCollected;

    public Statistics() {}

    public Statistics(int statisticId, int totalPolicies, int totalClaims, double totalPremiumsCollected) {
        this.statisticId = statisticId;
        this.totalPolicies = totalPolicies;
        this.totalClaims = totalClaims;
        this.totalPremiumsCollected = totalPremiumsCollected;
    }

	public int getStatisticId() {
		return statisticId;
	}

	public void setStatisticId(int statisticId) {
		this.statisticId = statisticId;
	}

	public int getTotalPolicies() {
		return totalPolicies;
	}

	public void setTotalPolicies(int totalPolicies) {
		this.totalPolicies = totalPolicies;
	}

	public int getTotalClaims() {
		return totalClaims;
	}

	public void setTotalClaims(int totalClaims) {
		this.totalClaims = totalClaims;
	}

	public double getTotalPremiumsCollected() {
		return totalPremiumsCollected;
	}

	public void setTotalPremiumsCollected(double totalPremiumsCollected) {
		this.totalPremiumsCollected = totalPremiumsCollected;
	}

    @Override
    public String toString() {
        return "Statistics{" + "statisticId=" + statisticId + ", totalPolicies=" + totalPolicies + ", totalClaims=" + totalClaims + '}';
    }
}
