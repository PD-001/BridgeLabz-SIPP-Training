package com.bridgelab_oop_objectmodelling.facultiesanddepartments;

public class Department {
    private String deptName;

    public Department(String name) {
        this.deptName = name;
    }

    public void showInfo() {
        System.out.println("Department: " + deptName);
    }

    public String getDeptName() {
        return deptName;
    }
}
