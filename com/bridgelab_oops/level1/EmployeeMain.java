package com.bridgelab_oops.level1;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Create and display employee
        Employee emp = new Employee(name, id, salary);
        emp.displayDetails();

        sc.close();
    }

}
