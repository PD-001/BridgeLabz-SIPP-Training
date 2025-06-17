package Methods;
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check the number and get the result
        int result = checkNumber(number);

        // Output the result
        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }

    public static int checkNumber(int num) {
        if (num < 0) {
            return -1; // Negative number
        } else if (num > 0) {
            return 1; // Positive number
        } else {
            return 0; // Zero
        }
    }
}