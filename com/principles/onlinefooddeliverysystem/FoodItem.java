package com.principles.onlinefooddeliverysystem;

abstract class FoodItem {
	 private String itemName;
	 private double price;
	 private int quantity;

	 public FoodItem(String itemName, double price, int quantity) {
	     this.itemName = itemName;
	     this.price = price;
	     this.quantity = quantity;
	 }

	 // Encapsulation: Getters & Setters
 public String getItemName() {
     return itemName;
 }

 public double getPrice() {
     return price;
 }

 public int getQuantity() {
     return quantity;
 }

 protected void setPrice(double price) {
     this.price = price;
 }

 protected void setQuantity(int quantity) {
     this.quantity = quantity;
 }

 // Concrete Method
 public void getItemDetails() {
     System.out.println("Item Name: " + itemName);
     System.out.println("Price per Unit: ₹" + price);
     System.out.println("Quantity: " + quantity);
 }

 // Abstract Method
 public abstract double calculateTotalPrice();
}