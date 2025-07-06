package com.inheritance.introduction.vehicleandtransportsystem;

public class Car extends Vehicle{
	// car has seat capacity
	private int seatCapacity;
	
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super.setMaxSpeed(maxSpeed);
        super.setFuelType(fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Seat Capacity: " + seatCapacity);
    }
}
