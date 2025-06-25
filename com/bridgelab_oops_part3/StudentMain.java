package com.bridgelab_oops_part3;
//StudentMain.java
public class StudentMain {
 public static void main(String[] args) {
     // Creating student objects
     Student s1 = new Student("Alice", 101, "A");
     Student s2 = new Student("Bob", 102, "B");

     // Using instanceof before performing operations
     if (s1 instanceof Student) {
         s1.displayStudentDetails();
         s1.updateGrade("A+");
     }

     System.out.println(); // spacing

     if (s2 instanceof Student) {
         s2.displayStudentDetails();
     }

     System.out.println(); // spacing

     // Show total number of students
     Student.displayTotalStudents();
 }
}
