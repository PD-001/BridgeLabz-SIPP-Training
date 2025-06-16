
package ControlFlow;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 1) {
            System.out.println("Please enter a positive integer greater than 1.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false; // Found a divisor, not a prime number
                break; // No need to check further
            }
        }
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is Not a Prime Number.");
        }
        // Close the scanner
        scanner.close();
    }
}