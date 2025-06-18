package Strings;

import java.util.Scanner;

public class CharactersOfString {

    // Method to convert a string to a character array without using toCharArray()
    public static char[] stringToCharArray(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Arrays are of different lengths
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // Characters at position i are different
            }
        }
        return true; // All characters match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter the text: ");
        String inputText = sc.next();

        // Step 2: Convert using user-defined method
        char[] customCharArray = stringToCharArray(inputText);

        // Step 3: Convert using built-in method
        char[] builtinCharArray = inputText.toCharArray();

        // Step 4: Compare both character arrays
        boolean areEqual = compareCharArrays(customCharArray, builtinCharArray);

        // Step 5: Display results
        System.out.println("\nCustom character array: " + java.util.Arrays.toString(customCharArray));
        System.out.println("Built-in character array: " + java.util.Arrays.toString(builtinCharArray));
        System.out.println("Are both character arrays same? " + areEqual);

        sc.close();
    }
}