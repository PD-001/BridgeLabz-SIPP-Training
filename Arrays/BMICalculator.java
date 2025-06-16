package Arrays;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user how many people they want to process
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[number][3];

        // Create a separate array to store the weight status
        String[] weightStatus = new String[number];

        // Loop to collect height and weight for each person
        for (int i = 0; i < number; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Weight must be positive. Enter again: ");
                weight = sc.nextDouble();
            }

            // Input height;
            System.out.print("Enter height (m): ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Height must be positive. Enter again: ");
                height = sc.nextDouble();
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // Calculate BMI and determine weight status for each person
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status based on BMI value
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("Person Data:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
