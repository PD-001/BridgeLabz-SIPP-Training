package Strings;

import java.util.Random;

public class StudentScorecard {

    // Step 1: Generate random 2-digit marks for Physics, Chemistry, Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // [physics, chemistry, math]
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + rand.nextInt(61); // Random score between 40 and 100
            }
        }
        return scores;
    }

    // Step 2: Calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3]; // [total, average, percentage]
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 300.0) * 10000) / 100.0; // 2 decimal places
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100) / 100.0;
            stats[i][2] = percentage;
        }
        return stats;
    }

    // Step 3: Get grades based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int numStudents = stats.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percent = stats[i][2];
            if (percent >= 80) {
                grades[i] = "A";
            } else if (percent >= 70) {
                grades[i] = "B";
            } else if (percent >= 60) {
                grades[i] = "C";
            } else if (percent >= 50) {
                grades[i] = "D";
            } else if (percent >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Step 4: Display scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-15s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.0f %-15.2f %-10s\n",
                    "Student" + (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][2], grades[i]);
        }

        System.out.println("------------------------------------------------------------------------------------");
    }

    // Main Method
    public static void main(String[] args) {
        int numStudents = 10;

        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);

        displayScorecard(scores, stats, grades);
    }
}
