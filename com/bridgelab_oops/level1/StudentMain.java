package com.bridgelab_oops.level1;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Create Student object
        Student student = new Student(name, rollNumber, marks);

        // Display student details
        student.displayDetails();

        sc.close();
    }
}
