package com.bridgelab_oop_objectmodelling.schoolandstudents;

public class SchoolTest {
    public static void main(String[] args) {
        School mySchool = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course math = new Course("Mathematics");
        Course sci = new Course("Science");

        // School aggregation
        mySchool.addStudent(s1);
        mySchool.addStudent(s2);

        // Association: Students enroll in courses
        s1.enrollInCourse(math);
        s1.enrollInCourse(sci);
        s2.enrollInCourse(math);

        // Display
        mySchool.showAllStudents();
        s1.viewCourses();
        s2.viewCourses();

        math.showEnrolledStudents();
        sci.showEnrolledStudents();
    }
}
