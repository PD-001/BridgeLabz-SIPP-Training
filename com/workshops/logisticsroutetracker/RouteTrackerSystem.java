package com.workshops.logisticsroutetracker;

import java.io.*;

public class RouteTrackerSystem {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        driver.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 15, 15));
        driver.addCheckpoint(new RestCheckpoint("C3", "Motel X", 40, 60, 95));
        driver.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 45, 60));

        driver.printSummary();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("com/logisticroutetracker/driverData.ser"))) {
            oos.writeObject(driver);
            System.out.println("\nDriver data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving driver data: " + e.getMessage());
        }
    }
}