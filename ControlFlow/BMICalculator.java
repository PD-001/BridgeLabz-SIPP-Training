
package ControlFlow;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Take user input for weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightM = heightCm / 100.0;
        
        // Step 2: Calculate BMI
        double bmi = weight / (heightM * heightM);
        
        // Step 3: Determine weight status based on BMI
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal weight";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }
        
        // Step 4: Output the result
        System.out.printf("Your BMI is %.2f, which is classified as: %s%n", bmi, status);
        
        // Close the scanner
        scanner.close();
    }
}