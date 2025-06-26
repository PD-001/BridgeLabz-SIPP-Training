package com.bridgelab_oops_part2;

public class VehicleMain {

	public static void main(String[] args) {
		// Update registration fee for all vehicles
		Vehicle.updateRegistrationFee(750.00);

		// Create vehicle objects
		Vehicle v1 = new Vehicle("Alice", "Car");
		Vehicle v2 = new Vehicle("Bob", "Motorcycle");

		// Display vehicle details
		System.out.println("\nVehicle 1 Details:");
		v1.displayVehicleDetails();

		System.out.println("\nVehicle 2 Details:");
		v2.displayVehicleDetails();
	}

}