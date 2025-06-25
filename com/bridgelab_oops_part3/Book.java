package com.bridgelab_oops_part3;
// Book.java
public class Book {
    // Static variable shared across all books
    static String libraryName = "ABC Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // final so it cannot be changed

    // Constructor using 'this' keyword
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN  : " + isbn);
    }
}
