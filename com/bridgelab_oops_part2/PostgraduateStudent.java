package com.bridgelab_oops_part2;


class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Demonstrating use of protected member "name"
    public void welcomeMessage() {
        System.out.println("Welcome postgraduate student, " + name + "!");
    }

    // Method to display postgraduate student details
    public void showDetails() {
        displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}