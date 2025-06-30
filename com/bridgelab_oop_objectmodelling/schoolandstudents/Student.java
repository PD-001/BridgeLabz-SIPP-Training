package com.bridgelab_oop_objectmodelling.schoolandstudents;

import java.util.*;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);  // maintain bidirectional link
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
