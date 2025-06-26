package com.bridgelab_oop_objectmodelling.libraryandbooks;

public class LibraryTest {
    public static void main(String[] args) {
        // Create independent Book objects
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library lib1 = new Library("Central");
        Library lib2 = new Library("Community");

        // Aggregation: Books can be added to libraries, but exist independently
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // Same book can be in multiple libraries
        lib2.addBook(b3);

        // Display books in each library
        lib1.displayBooks();
        System.out.println();
        lib2.displayBooks();
    }
}
