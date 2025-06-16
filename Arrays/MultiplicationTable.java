
package Arrays;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 6 and 9 for the multiplication table:");
        int number = sc.nextInt();

        // Validate input
        if (number < 6 || number > 9) {
            System.out.println("Please enter a valid number between 6 and 9.");
            sc.close();
            return;
        }

        // Create an array to store the multiplication results
        int[] multiplicationResult = new int[10];

        // Calculate the multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 1);
        }

        // Display the multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}