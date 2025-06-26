package com.bridgelab_oops_part2;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accNo, String accHolder, double balance, double interestRate) {
        super(accNo, accHolder, balance);
        this.interestRate = interestRate;
    }

    // Public method to calculate interest
    public void showSavingsDetails() {
        System.out.println("Savings Account Number: " + accountNumber); // public
        System.out.println("Savings Account Holder: " + accountHolder); // protected
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}