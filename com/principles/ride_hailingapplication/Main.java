package com.principles.ride_hailingapplication;

public class Main {
	public static void main(String[] args) {
		Vehicle[] rides = {
				new Car("CAR001", "Alice", 15, "Downtown"),
				new Bike("BIKE101", "Bob", 7, "City Center"),
				new Auto("AUTO202", "Charlie", 10, "Suburb")
		};

		double distance = 10; // Sample distance (in km)

		processRides(rides, distance);
	}

	// Polymorphic Ride Processing Method
	public static void processRides(Vehicle[] rides, double distance) {
		for (Vehicle ride : rides) {
			ride.getVehicleDetails();
			double fare = ride.calculateFare(distance);
			System.out.println("Distance: " + distance + " km");
			System.out.println("Calculated Fare: ₹" + fare);

			if (ride instanceof GPS) {
				GPS gpsVehicle = (GPS) ride;
				gpsVehicle.updateLocation("New Location after ride");
				System.out.println("Updated Location: " + gpsVehicle.getCurrentLocation());
			}

			System.out.println("-----------------------------------------------");
		}
	}
}
