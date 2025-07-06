package com.principles.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {
	public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	@Override
	public double calculateInsurance() {
		return 5000.0; // Fixed insurance for cars
	}

	@Override
	public String getInsuranceDetails() {
		return "Car Insurance Policy No: " + getInsurancePolicyNumber();
	}
}