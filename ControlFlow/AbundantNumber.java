package ControlFlow;
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}
