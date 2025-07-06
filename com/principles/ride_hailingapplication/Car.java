package com.principles.ride_hailingapplication;

class Car extends Vehicle implements GPS {
	public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
		super(vehicleId, driverName, ratePerKm, currentLocation);
	}

	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance + 50; // ₹50 fixed charge for cars
	}

	@Override
	public String getCurrentLocation() {
		return super.getCurrentLocation();
	}

	@Override
	public void updateLocation(String newLocation) {
		setCurrentLocation(newLocation);
	}

}