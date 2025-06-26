package com.bridgelab_oops_part2;

public class LibraryBook {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: \"" + title + "\"");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : $" + price);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
    }
}