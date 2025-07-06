package com.principles.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
	 private static final double ADDITIONAL_CHARGE_RATE = 0.15;  // 15% extra for non-veg items

 public NonVegItem(String itemName, double price, int quantity) {
     super(itemName, price, quantity);
 }

 @Override
 public double calculateTotalPrice() {
     double basePrice = getPrice() * getQuantity();
     double additionalCharge = basePrice * ADDITIONAL_CHARGE_RATE;
     return basePrice + additionalCharge;
 }

 @Override
 public double applyDiscount() {
     return calculateTotalPrice() * 0.05;  // 5% discount on non-veg items
 }

 @Override
 public String getDiscountDetails() {
     return "5% discount applied on Non-Veg Item.";
 }
}