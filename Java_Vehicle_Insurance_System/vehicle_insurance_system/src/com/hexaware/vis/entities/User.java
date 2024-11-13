package com.hexaware.vis.entities;

import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private String aadhaar;
    private String pan;
    private List<Proposal> proposals;
    public User() {}

    public User(Long userId, String name, String email, String password, String address, String aadhaar, String pan) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.aadhaar = aadhaar;
        this.pan = pan;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public List<Proposal> getProposals() {
        return proposals;
    }

    public void setProposals(List<Proposal> proposals) {
        this.proposals = proposals;
    }

}

