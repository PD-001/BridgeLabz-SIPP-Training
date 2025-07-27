package com.introduction.dynamiconlinemarketplace;

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100.0);
        product.setPrice(product.getPrice() - discountAmount);
    }
}