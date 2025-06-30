package com.bridgelab_oop_objectmodelling.companyanddepartments;

import java.util.*;

public class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String name) {
        this.companyName = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showStructure() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    // Simulate deletion of company (composition effect)
    public void deleteCompany() {
        for (Department dept : departments) {
            dept.clearEmployees();  // delete employees
        }
        departments.clear();        // delete departments
        System.out.println("Company " + companyName + " and all its departments and employees are deleted.");
    }
}
