package com.bridgelab_oops_part2;

class Student {
    // Attributes with different access modifiers
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter and setter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // setter for CGPA with validation
    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}