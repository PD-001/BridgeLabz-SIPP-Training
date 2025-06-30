package com.bridgelab_oop_objectmodelling.companyanddepartments;

import java.util.*;

public class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, int empId) {
        employees.add(new Employee(name, empId));
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }

    public void clearEmployees() {
        employees.clear();
    }
}
