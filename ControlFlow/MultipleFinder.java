package ControlFlow;
import java.util.Scanner;
public class MultipleFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100 to find its multiples: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number > 0 && number < 100) {
            System.out.println("The multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    }
}