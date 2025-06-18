package Strings;

import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            System.out.println("Reached end of string, total characters counted: " + count);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Call custom method
        int customLength = findLength(input);

        // Built-in method
        int builtinLength = input.length();

        // Display results
        System.out.println("Custom calculated length: " + customLength);
        System.out.println("Built-in length() result: " + builtinLength);
        sc.close();
    }
}
