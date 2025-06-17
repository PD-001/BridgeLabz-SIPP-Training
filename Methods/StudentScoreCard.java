package Methods;
import java.util.Scanner;
import java.util.Random;

public class StudentScoreCard {

    // Method to generate random marks (2-digit) for PCM subjects
    public static int[][] generateScores(int studentCount) {
        Random rand = new Random();
        int[][] scores = new int[studentCount][3]; // 3 columns for Physics, Chemistry, Math

        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // Generating marks between 60 to 100
            }
        }

        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateStats(int[][] scores) {
        int studentCount = scores.length;
        double[][] stats = new double[studentCount][3]; // total, average, percentage

        for (int i = 0; i < studentCount; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Rounding off values to 2 digits
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method to get grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }

    // Method to display the final scorecard
    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("S.No\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print((int) stats[i][0] + "\t"); // total
            System.out.print(stats[i][1] + "\t"); // average
            System.out.print(stats[i][2] + "%\t\t"); // percentage
            System.out.println(getGrade(stats[i][2])); // grade
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take input for number of students
        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();

        // 2. Generate scores
        int[][] scores = generateScores(studentCount);

        // 3. Calculate total, average, percentage
        double[][] stats = calculateStats(scores);

        // 4. Display the scorecard
        System.out.println("\n--- Student Scorecard ---");
        displayScorecard(scores, stats);

        sc.close();
    }
}
