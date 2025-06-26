package com.bridgelab_oops_part2;

public class BookLibraryMain {
	public static void main(String[] args) {
		// Create an instance of EBook
		EBook eBook = new EBook("978-1234567890", "Mastering Java", "Divanshu", 5.2);

		// Display E-Book details
		eBook.printEBookDetails();

		// Access and modify author using public methods
		eBook.setAuthor("D. Sharma");
		System.out.println("Updated Author: " + eBook.getAuthor());
	}
}
