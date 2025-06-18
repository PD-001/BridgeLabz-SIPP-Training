package Strings;

import java.util.Scanner;

public class ConvertAndCompareLowerCase {

    // Method to convert uppercase characters to lowercase using ASCII logic
    public static String customToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter the complete text: ");
        String inputText = sc.nextLine();

        // Step 2: Convert using built-in method
        String builtinLower = inputText.toLowerCase();

        // Step 3: Convert using custom method
        String customLower = customToLowerCase(inputText);

        // Step 4: Compare using custom method
        boolean areEqual = compareStrings(builtinLower, customLower);

        // Step 5: Display results
        System.out.println("\nBuilt-in lowercase: " + builtinLower);
        System.out.println("Custom lowercase:   " + customLower);
        System.out.println("Are both results same? " + areEqual);

        sc.close();
    }
}