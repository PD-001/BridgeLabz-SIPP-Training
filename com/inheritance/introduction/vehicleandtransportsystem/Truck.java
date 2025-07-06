package com.inheritance.introduction.vehicleandtransportsystem;

public class Truck extends Vehicle {
    // truck has load capacity
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super.setMaxSpeed(maxSpeed);
        super.setFuelType(fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Load Capacity: " + loadCapacity + " kg");
    }
}