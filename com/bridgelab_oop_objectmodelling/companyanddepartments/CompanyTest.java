package com.bridgelab_oop_objectmodelling.companyanddepartments;

public class CompanyTest {
    public static void main(String[] args) {
        Company google = new Company("Google");

        Department engineering = new Department("Engineering");
        engineering.addEmployee("Alice", 101);
        engineering.addEmployee("Bob", 102);

        Department hr = new Department("HR");
        hr.addEmployee("Charlie", 201);

        google.addDepartment(engineering);
        google.addDepartment(hr);

        google.showStructure();

        // Simulate deletion (composition)
        google.deleteCompany();

        // Try to display after deletion
        google.showStructure(); // should show nothing
    }
}
