package com.bridgelab_oop_objectmodelling.facultiesanddepartments;

public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Faculty: " + name);
    }

    public String getName() {
        return name;
    }
}
