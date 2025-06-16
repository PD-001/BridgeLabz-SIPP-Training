
package ControlFlow;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Get user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Step 3: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 4: Use while loop to calculate the sum of cubes of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Add the cube of the digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Step 5: Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }

        // Close the scanner
        scanner.close();
    }
}