package com.hexaware.vis.entities;

public class Proposal {
    private Long proposalId;
    private User user;
    private String vehicleType;
    private Policy policy;
    private String status;

    public Proposal() {}

    public Proposal(Long proposalId, User user, String vehicleType, Policy policy, String status) {
        this.proposalId = proposalId;
        this.user = user;
        this.vehicleType = vehicleType;
        this.policy = policy;
        this.status = status;
    }

    public Long getProposalId() {
        return proposalId;
    }

    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

