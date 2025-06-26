package com.bridgelab_oops_part2;

public class EmployeeMain {
    public static void main(String[] args) {
        // Create a Manager object
        Manager mgr = new Manager(501, "IT", 85000.0, 10);

        // Display manager information
        mgr.showManagerInfo();

        // Accessing and modifying salary via public methods
        mgr.setSalary(92000.0);
        System.out.println("Updated Salary: ₹" + mgr.getSalary());

        // View full employee info
        mgr.displayInfo();
    }
}
