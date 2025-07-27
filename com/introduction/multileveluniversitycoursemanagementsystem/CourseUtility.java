package com.introduction.multileveluniversitycoursemanagementsystem;

import java.util.List;

class CourseUtility {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getCourseName() + " | " + course.getEvaluationMethod());
        }
    }
}