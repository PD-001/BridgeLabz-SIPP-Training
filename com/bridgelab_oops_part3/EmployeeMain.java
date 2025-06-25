package com.bridgelab_oops_part3;
//EmployeeMain.java
public class EmployeeMain {
 public static void main(String[] args) {
     // Creating employee objects
     Employee emp1 = new Employee("Alice", 101, "Software Engineer");
     Employee emp2 = new Employee("Bob", 102, "Project Manager");

     // Checking with instanceof and displaying details
     if (emp1 instanceof Employee) {
         emp1.displayEmployeeDetails();
     }

     System.out.println(); // spacing

     if (emp2 instanceof Employee) {
         emp2.displayEmployeeDetails();
     }

     System.out.println(); // spacing

     // Display total number of employees
     Employee.displayTotalEmployees();
 }
}
