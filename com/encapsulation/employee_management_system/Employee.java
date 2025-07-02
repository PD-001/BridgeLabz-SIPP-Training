package com.encapsulation.employee_management_system;

//Abstract class representing an Employee
public abstract class Employee {
 private int employeeId;
 private String name;
 private double baseSalary;

 // Constructor
 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 // Getters and Setters (Encapsulation)
 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }

 // Abstract method
 public abstract double calculateSalary();

 // Concrete method
 public void displayDetails() {
     System.out.println("ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Base Salary: " + baseSalary);
     System.out.println("Calculated Salary: " + calculateSalary());
 }
}
