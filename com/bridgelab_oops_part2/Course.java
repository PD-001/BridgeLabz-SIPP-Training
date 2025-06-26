package com.bridgelab_oops_part2;

public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks or months
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute : " + instituteName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration : " + duration + " weeks");
        System.out.println("Fee : $" + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}