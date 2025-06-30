package com.bridgelab_oop_objectmodelling.universitymanagementsystem;

import java.util.*;

public class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // bidirectional link
        }
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void viewCourses() {
        System.out.println("Courses for student " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
