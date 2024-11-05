package com.hexaware.vis.entities;

public class Payment {
    private int paymentId;
    private int userId;
    private int policyId;
    private double amount;
    private String status;

    public Payment() {}

    public Payment(int paymentId, int userId, int policyId, double amount, String status) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.policyId = policyId;
        this.amount = amount;
        this.status = status;
    }

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    @Override
    public String toString() {
        return "Payment{" + "paymentId=" + paymentId + ", userId=" + userId + ", policyId=" + policyId + ", amount=" + amount + ", status='" + status + '\'' + '}';
    }
}
