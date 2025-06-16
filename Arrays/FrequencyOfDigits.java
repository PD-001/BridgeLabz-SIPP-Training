
package Arrays;

import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize frequency array
        int[] frequency = new int[10];

        // Count the frequency of each digit
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}