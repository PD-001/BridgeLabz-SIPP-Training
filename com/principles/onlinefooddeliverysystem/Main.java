package com.principles.onlinefooddeliverysystem;

public class Main {
 public static void main(String[] args) {
     FoodItem[] orderItems = {
         new VegItem("Paneer Butter Masala", 250, 2),
         new NonVegItem("Chicken Biryani", 300, 3)
     };

     processOrder(orderItems);
 }

 // Polymorphic Order Processing Method
 public static void processOrder(FoodItem[] items) {
     for (FoodItem item : items) {
         item.getItemDetails();
         double totalPrice = item.calculateTotalPrice();
         System.out.println("Total Price (before discount): ₹" + totalPrice);

         if (item instanceof Discountable) {
             Discountable discountableItem = (Discountable) item;
             double discount = discountableItem.applyDiscount();
             double finalPrice = totalPrice - discount;
             System.out.println(discountableItem.getDiscountDetails());
             System.out.println("Discount: ₹" + discount);
             System.out.println("Final Price (after discount): ₹" + finalPrice);
         }

         System.out.println("--------------------------------------------");
     }
 }
}