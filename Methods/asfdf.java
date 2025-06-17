Cpackage Methods;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            sc.close();
            return;
        }

        // Calculate the sum of natural numbers using recursion
        int recursiveSum = calculateSumRecursive(n);

        // Calculate the sum of natural numbers using the formula
        int formulaSum = calculateSumFormula(n);

        // Output the results
        System.out.println("Sum of first " + n + " natural numbers (recursive): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (formula): " + formulaSum);

        // Compare the two results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods yield the same result.");
        } else {
            System.out.println("The results do not match.");
        }

        sc.close();
    }

    public static int calculateSumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + calculateSumRecursive(n - 1); // Recursive case
    }

    public static int calculateSumFormula(int n) {
        return (n * (n + 1)) / 2; // Using the formula n(n+1)/2
    }
}