package com.bridgelab_oop_objectmodelling.ecommerceplatform;

public class EcommerceTest {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 799);
        Product p3 = new Product("Keyboard", 1499);
        Product p4 = new Product("Monitor", 7999);

        // Create Customer
        Customer c1 = new Customer("Aman");

        // Customer places order 1
        Order o1 = c1.placeOrder();
        o1.addProduct(p1);
        o1.addProduct(p2);

        // Customer places order 2
        Order o2 = c1.placeOrder();
        o2.addProduct(p3);
        o2.addProduct(p4);

        // Display
        c1.showAllOrders();
    }
}
