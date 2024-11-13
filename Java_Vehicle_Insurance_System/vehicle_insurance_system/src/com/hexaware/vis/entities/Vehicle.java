package com.hexaware.vis.entities;

public class Vehicle {
    private int vehicleId;
    private String vehicleType;
    private String model;
    private int yearOfManufacture;
    private String registrationNumber;
    private int userId;

    public Vehicle() {}

    public Vehicle(int vehicleId, String vehicleType, String model, int yearOfManufacture, String registrationNumber, int userId) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.registrationNumber = registrationNumber;
        this.userId = userId;
    }

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleId=" + vehicleId + ", vehicleType='" + vehicleType + '\'' + ", model='" + model + '\'' + '}';
    }
}
