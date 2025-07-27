package com.introduction.dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
        // Create products with different categories
        Product<BookCategory> book = new Product<>("Java Programming", 500.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000.0, new GadgetCategory());

        System.out.println("Before Discount:");
        book.display();
        shirt.display();
        phone.display();

        // Apply discounts
        DiscountUtil.applyDiscount(book, 10); // 10% discount on book
        DiscountUtil.applyDiscount(shirt, 20); // 20% discount on clothing
        DiscountUtil.applyDiscount(phone, 5); // 5% discount on gadgets

        System.out.println("\nAfter Discount:");
        book.display();
        shirt.display();
        phone.display();
    }
}
