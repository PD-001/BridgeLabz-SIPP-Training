package com.bridgelab_oops_part2;

public class Circle {
    // Attribute to hold the radius of the circle
    private double radius;

    // Default constructor 
    public Circle() {
        this.radius = 0.0; // Default radius value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle info
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area : " + calculateArea());
    }
}