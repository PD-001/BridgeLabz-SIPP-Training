package com.principles.ride_hailingapplication;

class Bike extends Vehicle implements GPS {
	public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
		super(vehicleId, driverName, ratePerKm, currentLocation);
	}

	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance; // No fixed charge
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