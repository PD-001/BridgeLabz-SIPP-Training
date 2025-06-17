package Methods;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        // Input weight and height for each member
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for member " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.println("Enter height (in cm) for member " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each member
        calculateBMI(teamData);

        // Determine BMI status for each member
        String[] statuses = determineStatus(teamData);

        // Output the results
        System.out.println("Team BMI Data:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) + ":");
            System.out.println("Weight: " + teamData[i][0] + " kg");
            System.out.println("Height: " + teamData[i][1] + " cm");
            System.out.println("BMI: " + teamData[i][2]);
            System.out.println("Status: " + statuses[i]);
        }

        sc.close();
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    public static String[] determineStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }
}
