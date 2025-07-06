package com.principles.vehiclerentalsystem;

class Truck extends Vehicle {
	public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		// Rental cost + extra charge per day
		return getRentalRate() * days + 2000.0; // Extra fixed maintenance charge
	}
}