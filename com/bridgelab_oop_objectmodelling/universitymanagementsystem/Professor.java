package com.bridgelab_oop_objectmodelling.universitymanagementsystem;

import java.util.*;

public class Professor {
    private String name;
    private List<Course> teachingCourses;

    public Professor(String name) {
        this.name = name;
        this.teachingCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            course.setProfessor(this); // link professor to course
        }
        System.out.println("Professor " + name + " assigned to course " + course.getCourseName());
    }

    public void viewCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        for (Course c : teachingCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
