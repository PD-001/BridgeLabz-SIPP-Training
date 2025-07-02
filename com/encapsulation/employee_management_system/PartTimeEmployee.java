package com.encapsulation.employee_management_system;

//Part-time employee class
public class PartTimeEmployee extends Employee implements Department {
 private String department;
 private int hoursWorked;
 private double hourlyRate;

 public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
     super(employeeId, name, 0); // baseSalary unused
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }

 @Override
 public void assignDepartment(String deptName) {
     this.department = deptName;
 }

 @Override
 public String getDepartmentDetails() {
     return "Department: " + department;
 }
}
