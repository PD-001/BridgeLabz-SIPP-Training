package com.bridgelab_oops_part3;
// LibraryApp.java
public class BookMain {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");

        // Using instanceof to check before displaying
        if (book1 instanceof Book) {
            Book.displayLibraryName();
            book1.displayBookDetails();
        }

        System.out.println(); // just for spacing

        if (book2 instanceof Book) {
            Book.displayLibraryName();
            book2.displayBookDetails();
        }
    }
}
