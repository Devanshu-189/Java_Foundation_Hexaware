package com.hexaware.vis.entities;

import java.util.Date;

public class Policy {
    private Long policyId;
    private String policyName;
    private String status;
    private double quote;
    private Date expirationDate;

    public Policy() {}

    public Policy(Long policyId, String policyName, String status, double quote, Date expirationDate) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.status = status;
        this.quote = quote;
        this.expirationDate = expirationDate;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getQuote() {
        return quote;
    }

    public void setQuote(double quote) {
        this.quote = quote;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
