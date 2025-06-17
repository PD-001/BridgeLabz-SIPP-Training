package Methods;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Calculate the sum of natural numbers
        int sum = calculateSum(n);

        // Output the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}