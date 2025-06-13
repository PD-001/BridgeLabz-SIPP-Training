package ControlFlow;
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its greatest factor: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 1) {
            System.out.println("The number must be greater than 1 to have a greatest factor.");
            return;
        }

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);
    }
}