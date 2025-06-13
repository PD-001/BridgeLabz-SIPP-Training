package ControlFlow;

import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        int number = sc.nextInt();
        sc.close();

        if (number > 0) {
            int counter = 1;
            System.out.println("The factors of " + number + " are:");
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
