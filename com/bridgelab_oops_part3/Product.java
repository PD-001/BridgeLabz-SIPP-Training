package com.bridgelab_oops_part3;
//Product.java
public class Product {
 // Static variable shared by all products
 static double discount = 10.0; // in percentage

 // Static method to update the discount
 public static void updateDiscount(double newDiscount) {
     discount = newDiscount;
     System.out.println("Discount updated to " + discount + "% for all products.");
 }

 // Instance variables
 private String productName;
 private double price;
 private int quantity;
 private final String productID; // final ensures unique and unchangeable

 // Constructor using 'this' keyword
 public Product(String productID, String productName, double price, int quantity) {
     this.productID = productID;
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }

 // Method to calculate total price after discount
 public double getTotalPrice() {
     double total = price * quantity;
     return total - (total * discount / 100);
 }

 // Method to display product details
 public void displayProductDetails() {
     System.out.println("Product ID   : " + productID);
     System.out.println("Product Name : " + productName);
     System.out.println("Price        : " + price);
     System.out.println("Quantity     : " + quantity);
     System.out.println("Discount     : " + discount + "%");
     System.out.println("Total Price  : " + getTotalPrice());
 }
}
