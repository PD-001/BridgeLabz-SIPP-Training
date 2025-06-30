package com.bridgelab_oop_objectmodelling.facultiesanddepartments;

import java.util.*;

public class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityStructure() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.showInfo();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.showInfo();
        }
    }

    // Simulate deletion of university
    public void deleteUniversity() {
        departments.clear(); // composition: delete departments
        System.out.println("University " + name + " and its departments are deleted.");
    }
}
