package com.bridgelab_oops_part3;
//Employee.java
public class Employee {
 // Static variable shared across all employees
 static String companyName = "Tech Innovators Ltd.";
 private static int totalEmployees = 0;

 // Instance variables
 private String name;
 private final int id; // final so it cannot be changed
 private String designation;

 // Constructor using 'this' keyword
 public Employee(String name, int id, String designation) {
     this.name = name;
     this.id = id;
     this.designation = designation;
     totalEmployees++;
 }

 // Static method to display total number of employees
 public static void displayTotalEmployees() {
     System.out.println("Total Employees: " + totalEmployees);
 }

 // Method to display employee details
 public void displayEmployeeDetails() {
     System.out.println("Company   : " + companyName);
     System.out.println("Name      : " + name);
     System.out.println("ID        : " + id);
     System.out.println("Designation: " + designation);
 }
}
