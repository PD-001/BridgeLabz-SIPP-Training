package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Main {
    public static void main(String[] args) {
        // Creating instances of different roles in the school system
        Teacher teacher = new Teacher("Mr. Sharma", 45, "Mathematics");
        Student student = new Student("Anjali", 16, "10th Grade");
        Staff staff = new Staff("Rajesh", 38, "Administration");

        // Displaying the roles
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}