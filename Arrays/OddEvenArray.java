
package Arrays;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input and validate it
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a valid natural number greater than 0.");
            sc.close();
            return;
        }

        // Step 2: Create arrays for odd and even numbers
        int size = number / 2 + 1; // Size for even numbers, odd numbers will be of same or smaller size
        int[] evenNumbers = new int[size];
        int[] oddNumbers = new int[size];

        // Step 3: Initialize index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // Step 4: Populate the arrays with odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Save even number
            } else {
                oddNumbers[oddIndex++] = i; // Save odd number
            }
        }

        // Step 5: Print the odd and even numbers arrays
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        sc.close();
    }
}