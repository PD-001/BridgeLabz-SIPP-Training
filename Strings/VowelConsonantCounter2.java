package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class VowelConsonantCounter2 {

    // Method to check if a character is a vowel or consonant
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string using charAt() and return a
    // 2D array
    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-15s %-15s%n", "Character", "Type");
        System.out.println("-----------------------------");
        for (String[] row : data) {
            System.out.printf("%-15s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Step 2: Find vowels and consonants
        String[][] results = findVowelsAndConsonants(inputString);

        // Step 3: Display the results
        displayResults(results);

        sc.close();
    }
}