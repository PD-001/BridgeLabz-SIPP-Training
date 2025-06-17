package Methods;

import java.util.Scanner;
import java.lang.Math;

public class FactorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Calculate sum, product, and sum of squares of factors
        int sum = calculateSum(factors);
        int product = calculateProduct(factors);
        double sumOfSquares = calculateSumOfSquares(factors);

        // Output the results
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        sc.close();
    }

    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double calculateSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}