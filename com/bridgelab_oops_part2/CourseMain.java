package com.bridgelab_oops_part2;

public class CourseMain {
	public static void main(String[] args) {
		// Update the shared institute name
		Course.updateInstituteName("BridgeLabz Academy");

		// Create courses
		Course c1 = new Course("Java Programming", 12, 299.99);
		Course c2 = new Course("Web Development", 10, 249.99);

		// Display course details
		System.out.println("\nCourse 1 Details:");
		c1.displayCourseDetails();

		System.out.println("\nCourse 2 Details:");
		c2.displayCourseDetails();
	}
}
