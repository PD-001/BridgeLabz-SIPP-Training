package Strings;

import java.util.Scanner;

public class CompareStringsUsingCharAt {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are of different lengths
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Characters at position i are different
            }
        }
        return true; // All characters match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for two strings
        System.out.print("Enter first string: ");
        String firstString = sc.next();
        System.out.print("Enter second string: ");
        String secondString = sc.next();

        // Step 2: Compare using custom method
        boolean areEqualUsingCharAt = compareStrings(firstString, secondString);

        // Step 3: Check using built-in equals() method
        boolean areEqualUsingBuiltIn = firstString.equals(secondString);

        // Step 4: Display results
        System.out.println("\nComparison using charAt(): " + areEqualUsingCharAt);
        System.out.println("Comparison using built-in equals(): " + areEqualUsingBuiltIn);

        sc.close();
    }
}