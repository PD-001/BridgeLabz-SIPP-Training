package com.bridgelab_oop_objectmodelling.bankandaccountholders;
import java.util.*;

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open account for a customer
    public void openAccount(Customer customer, String accountType, double initialBalance) {
        Account newAccount = new Account(accountType, initialBalance, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " in " + this.name);
    }

    public String getName() {
        return name;
    }

    public void showAllCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}
