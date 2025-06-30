package com.bridgelab_oop_objectmodelling.ecommerceplatform;

import java.util.*;

public class Order {
    private static int idCounter = 1000;
    private int orderId;
    private Customer customer;
    private List<Product> productList;

    public Order(Customer customer) {
        this.customer = customer;
        this.productList = new ArrayList<>();
        this.orderId = idCounter++;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : productList) {
            p.showInfo();
            total += p.getPrice();
        }
        System.out.println("Total: ₹" + total + "\n");
    }

    public int getOrderId() {
        return orderId;
    }
}
