
package ControlFlow;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sum = 0;
        int temp = number;

        // Calculate the sum of the digits
        while (temp > 0) {
            sum += temp % 10; // Add the last digit to sum
            temp /= 10; // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
    }
}