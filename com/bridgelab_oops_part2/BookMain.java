package com.bridgelab_oops_part2;

public class BookMain {
	public static void main(String[] args) {
		// Using default constructor
		Book defaultBook = new Book();
		defaultBook.displayInfo();

		System.out.println();

		// Using parameterized constructor
		Book customBook = new Book("XYZ", "ABC", 1499);
		customBook.displayInfo();
	}
}
