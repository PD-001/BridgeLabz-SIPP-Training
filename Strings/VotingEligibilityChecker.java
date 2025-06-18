package Strings;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {

    // Step 1: Generate random 2-digit ages
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // generates number between 10 and 99
        }
        return ages;
    }

    // Step 2: Check voting eligibility
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // negative ages are invalid
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Step 3: Display results in table
    public static void displayResults(String[][] table) {
        System.out.println("\n--- Voting Eligibility ---");
        System.out.printf("%-10s %-15s\n", "Age", "Can Vote?");
        for (String[] row : table) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    // Step 4: Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students (e.g. 10): ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] results = checkEligibility(ages);
        displayResults(results);
        sc.close();
    }
}
