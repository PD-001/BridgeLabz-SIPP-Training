package com.introduction.multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(new ExamCourse("Mathematics"));
        courseList.add(new AssignmentCourse("Software Engineering"));
        courseList.add(new ResearchCourse("Artificial Intelligence"));

        System.out.println("All Courses:");
        CourseUtility.displayAllCourses(courseList);

        System.out.println("\nSingle Course Display:");
        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Mathematics"));
        mathCourse.displayInfo();
    }
}
