package com.bridgelab_oop_objectmodelling.bankandaccountholders;
public class Account {
    private String accountType;
    private double balance;
    private Bank bank;

    public Account(String accountType, double balance, Bank bank) {
        this.accountType = accountType;
        this.balance = balance;
        this.bank = bank;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}
