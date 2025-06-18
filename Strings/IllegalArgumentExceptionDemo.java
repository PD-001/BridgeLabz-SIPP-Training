package Strings;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {
        String substring = text.substring(start, end);
        System.out.println("Substring: " + substring);
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text, int start, int end) {
        try {
            String substring = text.substring(start, end);
            System.out.println("Substring: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Step 2: Define start and end indices
        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();

        // Step 3: Call method to generate the exception
        generateException(inputString, startIndex, endIndex);

        // Step 4: Call method to handle the exception using try-catch
        handleException(inputString, startIndex, endIndex);

        sc.close();
    }
}