package com.encapsulation.employee_management_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Alice", 30000, 5000);
        e1.assignDepartment("HR");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Bob", 200, 80);
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();

            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }

            System.out.println("-------------------------");
        }
    }
}
