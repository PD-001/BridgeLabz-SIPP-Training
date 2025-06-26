package com.bridgelab_oops_part2;

class EBook extends BookLibrary {
    private double fileSizeMB;

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display E-Book information
    public void printEBookDetails() {
        System.out.println("E-Book ISBN: " + ISBN); // public member
        System.out.println("E-Book Title: " + title); // protected member
        System.out.println("E-Book Size: " + fileSizeMB + "MB");
    }
}