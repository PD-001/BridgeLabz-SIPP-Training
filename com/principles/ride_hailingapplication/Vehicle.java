package com.principles.ride_hailingapplication;

abstract class Vehicle {
	private String vehicleId;
	private String driverName;
	private double ratePerKm;
	private String currentLocation;

	public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
		this.currentLocation = currentLocation;
	}

	// Encapsulation: Getters (No direct setters for ID and driver)
	public String getVehicleId() {
		return vehicleId;
	}

	public String getDriverName() {
		return driverName;
	}

	public double getRatePerKm() {
		return ratePerKm;
	}

	protected String getCurrentLocation() {
		return currentLocation;
	}

	protected void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	// Concrete Method
	public void getVehicleDetails() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Driver Name: " + driverName);
		System.out.println("Rate per Km: ₹" + ratePerKm);
		System.out.println("Current Location: " + currentLocation);
	}

	// Abstract Method
	public abstract double calculateFare(double distance);
}
