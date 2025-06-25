package com.bridgelab_oops_part3;
//Vehicle.java
public class Vehicle {
 // Static variable shared by all vehicles
 static double registrationFee = 5000.0;

 // Static method to update registration fee
 public static void updateRegistrationFee(double newFee) {
     registrationFee = newFee;
     System.out.println("Registration fee updated to ₹" + registrationFee);
 }

 // Instance variables
 private String ownerName;
 private String vehicleType;
 private final String registrationNumber; // Unique & unchangeable

 // Constructor using 'this' keyword
 public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
     this.ownerName = ownerName;
     this.vehicleType = vehicleType;
     this.registrationNumber = registrationNumber;
 }

 // Method to display vehicle registration details
 public void displayRegistrationDetails() {
     System.out.println("Owner Name        : " + ownerName);
     System.out.println("Vehicle Type      : " + vehicleType);
     System.out.println("Registration No.  : " + registrationNumber);
     System.out.println("Registration Fee  : ₹" + registrationFee);
 }
}
