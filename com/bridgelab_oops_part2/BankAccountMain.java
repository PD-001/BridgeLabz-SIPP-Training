package com.bridgelab_oops_part2;

public class BankAccountMain {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount sa = new SavingsAccount("ACC123456", "Divanshu", 10000.0, 4.5);

        // Display account information
        sa.deposit(2500);
        sa.withdraw(3000);
        System.out.println("Current Balance: ₹" + sa.getBalance());

        // Display savings account details
        sa.showSavingsDetails();
    }
}