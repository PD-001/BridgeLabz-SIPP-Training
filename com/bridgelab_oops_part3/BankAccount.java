package com.bridgelab_oops_part3;
// BankAccount.java
public class BankAccount {
    // Static variable
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final int accountNumber;

    // Constructor using 'this' keyword
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}
