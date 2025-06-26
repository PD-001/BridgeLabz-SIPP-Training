package com.bridgelab_oops_part2;

public class StudentMain {
	public static void main(String[] args) {
		PostgraduateStudent pg = new PostgraduateStudent(101, "Divanshu", 9.2, "Computer Science");

		pg.welcomeMessage(); // Accessing protected member
		pg.setCGPA(9.5); // Modifying private field using setter
		System.out.println("CGPA: " + pg.getCGPA()); // Accessing via getter

		// Displaying student details
		pg.showDetails();
	}
}
