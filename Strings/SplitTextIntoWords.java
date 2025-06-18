package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class SplitTextIntoWords {

    // Method to find the length of the String without using built-in length()
    // method
    public static int customLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to split the text into words using charAt() without using built-in
    // split() method
    public static String[] customSplit(String text) {
        int length = customLength(text);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int startIndex = 0;

        // Extract words based on spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                if (startIndex < i) {
                    words[wordIndex++] = text.substring(startIndex, i);
                }
                startIndex = i + 1;
            }
        }

        // Add the last word if exists
        if (startIndex < length) {
            words[wordIndex] = text.substring(startIndex, length);
        }

        return Arrays.copyOf(words, wordIndex + 1);
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
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

        // Step 2: Split using user-defined method
        String[] customWords = customSplit(inputText);

        // Step 3: Split using built-in method
        String[] builtinWords = inputText.split(" ");

        // Step 4: Compare both String arrays
        boolean areEqual = compareStringArrays(customWords, builtinWords);

        // Step 5: Display results
        System.out.println("\nCustom split words: " + Arrays.toString(customWords));
        System.out.println("Built-in split words: " + Arrays.toString(builtinWords));
        System.out.println("Are both word arrays same? " + areEqual);

        sc.close();
    }
}