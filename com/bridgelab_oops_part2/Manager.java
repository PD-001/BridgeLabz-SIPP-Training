package com.bridgelab_oops_part2;

class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Public method to update team size
    public void showManagerInfo() {
        System.out.println("Manager ID: " + employeeID); // public access
        System.out.println("Department: " + department); // protected access
        System.out.println("Team Size: " + teamSize);
    }
}