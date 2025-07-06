package com.inheritance.introduction.vehicleandtransportsystem;

public class Motorcycle extends Vehicle{
	// Motorcycle has carrier or not.
	private boolean hasCarrier;
	
    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
    	super.setMaxSpeed(maxSpeed);
	    super.setFuelType(fuelType);
	    this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
