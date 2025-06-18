package Strings;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        char ch = str.charAt(str.length());
        System.out.println("Character at index: " + ch);
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String str) {
        try {
            char ch = str.charAt(str.length());
            System.out.println("Character at index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Step 2: Call method to generate the exception
        generateException(inputString);

        // Step 3: Call method to handle the exception using try-catch
        handleException(inputString);

        sc.close();
    }
}