package com.bridgelab_oops_part3;
//Student.java
public class Student {
 // Static variable shared across all students
 static String universityName = "National University";
 private static int totalStudents = 0;

 // Instance variables
 private String name;
 private final int rollNumber; // final so it can't be changed
 private String grade;

 // Constructor using 'this' keyword
 public Student(String name, int rollNumber, String grade) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.grade = grade;
     totalStudents++;
 }

 // Static method to display total number of students
 public static void displayTotalStudents() {
     System.out.println("Total Enrolled Students: " + totalStudents);
 }

 // Method to update grade
 public void updateGrade(String newGrade) {
     this.grade = newGrade;
     System.out.println("Grade updated for Roll Number " + rollNumber);
 }

 // Method to display student details
 public void displayStudentDetails() {
     System.out.println("University  : " + universityName);
     System.out.println("Name        : " + name);
     System.out.println("Roll Number : " + rollNumber);
     System.out.println("Grade       : " + grade);
 }
}
