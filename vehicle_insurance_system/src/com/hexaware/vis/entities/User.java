package com.hexaware.vis.entities;

public class User {
    private int userId;
    private String name;
    private String email;
    private String passwordHash;
    private String address;
    private java.util.Date dateOfBirth;
    private String aadhaarNumber;
    private String panNumber;
    private String role;

    public User() {}

    public User(int userId, String name, String email, String passwordHash, String address, java.util.Date dateOfBirth, String aadhaarNumber, String panNumber, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.aadhaarNumber = aadhaarNumber;
        this.panNumber = panNumber;
        this.role = role;
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", name='" + name + '\'' + ", email='" + email + '\'' + ", role='" + role + '\'' + '}';
    }
}
