
package ControlFlow;

import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Create variables
        double first, second;
        String op;

        // Step 2: Get input values
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();
        System.out.print("Enter second number: ");
        second = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();

        // Step 4: Perform operations based on the operator
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}