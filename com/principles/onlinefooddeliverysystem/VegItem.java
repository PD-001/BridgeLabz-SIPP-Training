package com.principles.onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
	 public VegItem(String itemName, double price, int quantity) {
	     super(itemName, price, quantity);
	 }

	 @Override
	 public double calculateTotalPrice() {
	     return getPrice() * getQuantity();  // No additional charges
 }

 @Override
 public double applyDiscount() {
     return calculateTotalPrice() * 0.1;  // 10% discount on veg items
 }

 @Override
 public String getDiscountDetails() {
     return "10% discount applied on Veg Item.";
 }
}