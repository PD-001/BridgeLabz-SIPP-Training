package com.bridgelab_oops_part3;
// BankApp.java
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001);
        BankAccount acc2 = new BankAccount("Bob", 1002);

        // Using instanceof to check object type
        if (acc1 instanceof BankAccount) {
        	System.out.println("First account is an instance of class BankAccount.");
            acc1.displayAccountDetails();
        }

        if (acc2 instanceof BankAccount) {
        	System.out.println("Second account is an instance of class BankAccount.");
        	acc2.displayAccountDetails();
        }

        // Using static method to get total accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
