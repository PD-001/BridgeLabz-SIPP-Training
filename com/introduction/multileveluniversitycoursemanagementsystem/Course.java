package com.introduction.multileveluniversitycoursemanagementsystem;

class Course<T extends CourseType> {
    private T course;

    public Course(T course) {
        this.course = course;
    }

    public T getCourse() {
        return course;
    }

    public void displayInfo() {
        System.out.println(course.getCourseName() + " - " + course.getEvaluationMethod());
    }
}