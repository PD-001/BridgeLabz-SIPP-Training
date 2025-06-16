
package ControlFlow;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Get user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 3: Initialize count variable
        int count = 0;

        // Step 4: Use a loop to count the digits
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increase the count by 1
        }

        // Step 5: Display the count
        System.out.println("Number of digits: " + count);

        // Close the scanner
        scanner.close();
    }
}