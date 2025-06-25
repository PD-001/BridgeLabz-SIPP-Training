package com.bridgelab_oops_part3;
//ProductMain.java
public class ProductMain {
 public static void main(String[] args) {
     // Creating product objects
     Product p1 = new Product("P101", "Laptop", 50000, 1);
     Product p2 = new Product("P102", "Smartphone", 20000, 2);

     // Updating discount for all products
     Product.updateDiscount(15.0);

     // Validate with instanceof and display details
     if (p1 instanceof Product) {
         p1.displayProductDetails();
     }

     System.out.println(); // spacing

     if (p2 instanceof Product) {
         p2.displayProductDetails();
     }
 }
}
