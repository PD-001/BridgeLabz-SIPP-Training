package com.principles.bankingsystem;

interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}