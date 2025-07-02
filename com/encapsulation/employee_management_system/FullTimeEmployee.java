package com.encapsulation.employee_management_system;

//Full-time employee class
public class FullTimeEmployee extends Employee implements Department {
 private String department;
 private double fixedBonus;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
     super(employeeId, name, baseSalary);
     this.fixedBonus = fixedBonus;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + fixedBonus;
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
