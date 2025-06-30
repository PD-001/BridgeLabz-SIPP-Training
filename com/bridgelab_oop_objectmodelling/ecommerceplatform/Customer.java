package com.bridgelab_oop_objectmodelling.ecommerceplatform;

import java.util.*;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Order placeOrder() {
        Order order = new Order(this);
        orders.add(order);
        return order;
    }

    public void showAllOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
