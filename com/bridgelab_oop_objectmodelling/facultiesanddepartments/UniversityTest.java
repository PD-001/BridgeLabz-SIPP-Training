package com.bridgelab_oop_objectmodelling.facultiesanddepartments;

public class UniversityTest {
    public static void main(String[] args) {
        University uni = new University("Oxford");

        // Faculty can exist independently (aggregation)
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Departments are part of university (composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");

        uni.showUniversityStructure();

        // Simulate university deletion
        uni.deleteUniversity();

        // Faculty still exist
        System.out.println("Independent Faculty still exist:");
        f1.showInfo();
        f2.showInfo();
    }
}
