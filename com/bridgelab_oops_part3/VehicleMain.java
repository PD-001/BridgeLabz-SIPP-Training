package com.bridgelab_oops_part3;
//VehicleMain.java
public class VehicleMain {
 public static void main(String[] args) {
     // Creating vehicle objects
     Vehicle v1 = new Vehicle("Alice", "Car", "MH12AB1234");
     Vehicle v2 = new Vehicle("Bob", "Bike", "MH14CD5678");

     // Update registration fee
     Vehicle.updateRegistrationFee(6000.0);

     // Check with instanceof and display details
     if (v1 instanceof Vehicle) {
         v1.displayRegistrationDetails();
     }

     System.out.println(); // spacing

     if (v2 instanceof Vehicle) {
         v2.displayRegistrationDetails();
     }
 }
}
