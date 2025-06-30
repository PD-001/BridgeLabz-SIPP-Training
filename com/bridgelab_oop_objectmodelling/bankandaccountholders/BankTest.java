package com.bridgelab_oop_objectmodelling.bankandaccountholders;
public class BankTest {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer jack = new Customer("Jack");
        Customer alice = new Customer("Alice");

        sbi.openAccount(jack, "Savings", 5000);
        sbi.openAccount(jack, "Current", 15000);
        hdfc.openAccount(alice, "Savings", 2000);

        jack.viewBalance();
        alice.viewBalance();

        sbi.showAllCustomers();
        hdfc.showAllCustomers();
    }
}
