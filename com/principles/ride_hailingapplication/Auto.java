package com.principles.ride_hailingapplication;

class Auto extends Vehicle implements GPS {
	public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
		super(vehicleId, driverName, ratePerKm, currentLocation);
	}

	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance + 20; // ₹20 minimum charge
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