package com.workshops.university_course_enrollment_system;
//Interface for grading abstraction
interface Graded {
 void assignGrade(Enrollment enrollment, String grade);
}

//Base Student class
abstract class Student {
 private String name;
 private int id;
 private double totalGradePoints = 0;
 private int totalCredits = 0;

 public Student(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public void addGrade(double gradePoints, int credits) {
     totalGradePoints += gradePoints * credits;
     totalCredits += credits;
 }

 public double getGPA() {
     return totalCredits == 0 ? 0.0 : totalGradePoints / totalCredits;
 }

 public String getTranscript() {
     return name + " (ID: " + id + ") - GPA: " + String.format("%.2f", getGPA());
 }
}

//Undergraduate and Postgraduate inherit Student
class Undergraduate extends Student {
 public Undergraduate(String name, int id) {
     super(name, id);
 }
}

class Postgraduate extends Student {
 public Postgraduate(String name, int id) {
     super(name, id);
 }
}

//Course class
class Course {
 String courseName;
 int credits;

 public Course(String name, int credits) {
     this.courseName = name;
     this.credits = credits;
 }
}

//Faculty class implements grading
class Faculty implements Graded {
 String name;

 public Faculty(String name) {
     this.name = name;
 }

 // Grading: could be overridden for other grading styles
 public void assignGrade(Enrollment enrollment, String grade) {
     double gradePoints = switch (grade) {
         case "A" -> 4.0;
         case "B" -> 3.0;
         case "C" -> 2.0;
         case "D" -> 1.0;
         default -> 0.0;
     };
     enrollment.setGrade(grade);
     enrollment.getStudent().addGrade(gradePoints, enrollment.getCourse().credits);
 }
}

//Enrollment class
class Enrollment {
 private Student student;
 private Course course;
 private String grade;

 public Enrollment(Student student, Course course) {
     this.student = student;
     this.course = course;
 }

 public Student getStudent() {
     return student;
 }

 public Course getCourse() {
     return course;
 }

 public void setGrade(String grade) {
     this.grade = grade;
 }

 public String toString() {
     return student.getTranscript() + ", Course: " + course.courseName + ", Grade: " + grade;
 }
}

//Demo
public class Main {
 public static void main(String[] args) {
     // Students
     Student u1 = new Undergraduate("Alice", 101);
     Student p1 = new Postgraduate("Bob", 201);

     // Course
     Course course1 = new Course("Data Structures", 4);

     // Faculty
     Faculty prof = new Faculty("Dr. Smith");

     // Enrollment
     Enrollment e1 = new Enrollment(u1, course1);
     Enrollment e2 = new Enrollment(p1, course1);

     // Grading
     prof.assignGrade(e1, "A");
     prof.assignGrade(e2, "B");

     // Display transcripts
     System.out.println(e1);
     System.out.println(e2);
 }
}
