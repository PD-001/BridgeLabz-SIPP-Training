package com.bridgelab_oop_objectmodelling.schoolandstudents;

import java.util.*;

public class School {
    private String schoolName;
    private List<Student> students;

    public School(String name) {
        this.schoolName = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getSchoolName() {
        return schoolName;
    }
}
