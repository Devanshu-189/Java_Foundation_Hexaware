package com.hexaware.vis.entities;

import java.util.Date;

public class Payment {
    private Long paymentId;
    private Proposal proposal;
    private double amount;
    private Date date;
    private String status;

    public Payment() {}

    public Payment(Long paymentId, Proposal proposal, double amount, Date date, String status) {
        this.paymentId = paymentId;
        this.proposal = proposal;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
