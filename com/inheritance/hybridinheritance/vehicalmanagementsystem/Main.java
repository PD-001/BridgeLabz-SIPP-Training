package com.inheritance.hybridinheritance.vehicalmanagementsystem;

public class Main {
    // Driver class for Vehicle System
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        // Display information and perform actions
        ev.displayInfo();
        ev.charge();

        pv.displayInfo();
        pv.refuel();
    }
}