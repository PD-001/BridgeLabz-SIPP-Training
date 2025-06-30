package com.bridgelab_oop_objectmodelling.universitymanagementsystem;

import java.util.*;

public class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    private Professor professor;

    public Course(String name) {
        this.courseName = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s) {
        if (!enrolledStudents.contains(s)) {
            enrolledStudents.add(s);
        }
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not assigned"));
        System.out.println("Students enrolled:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}
