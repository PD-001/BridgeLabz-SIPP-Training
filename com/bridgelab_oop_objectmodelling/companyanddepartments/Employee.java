package com.bridgelab_oop_objectmodelling.companyanddepartments;
public class Employee {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void displayInfo() {
        System.out.println("  - Employee ID: " + empId + ", Name: " + name);
    }
}
