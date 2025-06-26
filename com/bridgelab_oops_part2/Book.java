package com.bridgelab_oops_part2;

public class Book {
	// Attributes of the Book class
	// title, author, and price
	private String title;
	private String author;
	private double price;

	// Default constructor
	public Book() {
		this.title = "";
		this.author = "";
		this.price = 0.0;
	}

	// Parameterized constructor
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// Method to display book details
	public void displayInfo() {
		System.out.println("Title  : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price  : $" + price);
	}
}