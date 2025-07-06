package com.inheritance.introduction.vehicleandtransportsystem;


class Vehicle {
	private int maxSpeed;
    private String fuelType;
    
    public void setMaxSpeed(int maxSpeed) {
    	  this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
    	return maxSpeed;
    }
    public void setFuelType(String fuelType)
    {
    	  this.fuelType = fuelType;
    }
    public String setFuelType()
    {
    	return fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}
