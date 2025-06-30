package com.bridgelab_oop_objectmodelling.bankandaccountholders;
import java.util.*;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Account balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("- " + acc.getAccountType() + " in " + acc.getBank().getName() + ": ₹" + acc.getBalance());
        }
    }
}
