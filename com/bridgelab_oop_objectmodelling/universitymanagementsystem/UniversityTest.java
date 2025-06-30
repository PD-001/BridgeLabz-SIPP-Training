package com.bridgelab_oop_objectmodelling.universitymanagementsystem;

public class UniversityTest {
    public static void main(String[] args) {
        // Create Professors
        Professor prof1 = new Professor("Dr. Sen");
        Professor prof2 = new Professor("Dr. Rao");

        // Create Students
        Student s1 = new Student("Anita");
        Student s2 = new Student("Vikram");

        // Create Courses
        Course java = new Course("Java Programming");
        Course math = new Course("Discrete Mathematics");

        // Assign professors
        prof1.assignCourse(java);
        prof2.assignCourse(math);

        // Students enroll
        s1.enrollCourse(java);
        s1.enrollCourse(math);
        s2.enrollCourse(java);

        // Show data
        s1.viewCourses();
        s2.viewCourses();
        prof1.viewCourses();
        prof2.viewCourses();
        java.showDetails();
        math.showDetails();
    }
}
