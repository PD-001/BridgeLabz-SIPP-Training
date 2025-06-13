package ControlFlow;

import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}