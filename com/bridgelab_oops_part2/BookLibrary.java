package com.bridgelab_oops_part2;

public class BookLibrary {
	public String ISBN; // Public: accessible anywhere
    protected String title; // Protected: accessible in subclass
    private String author; // Private: accessible only within Book

    // Constructor
    public BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
