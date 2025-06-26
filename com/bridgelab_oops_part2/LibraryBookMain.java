package com.bridgelab_oops_part2;

public interface LibraryBookMain {
	public static void main(String[] args) {
		// Create a book object
		LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 1299, true);

		// Display book info
		System.out.println("Book Details:");
		book1.displayInfo();

		System.out.println();

		// Attempt to borrow the book
		book1.borrowBook();

		System.out.println();

		// Check availability after borrowing
		book1.displayInfo();

		System.out.println();

		// Try borrowing again
		book1.borrowBook();
	}
}
