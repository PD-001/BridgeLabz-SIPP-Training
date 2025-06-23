package com.bridgelab_oops.level1;

import java.util.Scanner;

public class MobilePhoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Mobile Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Mobile Price: ");
        double price = sc.nextDouble();

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display the details
        phone.displayDetails();

        sc.close();
    }
}
