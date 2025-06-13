package ControlFlow;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100 to find its multiples: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number > 0 && number < 100) {
            int counter = number - 1;
            System.out.println("The multiples of " + number + " below 100 are:");
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    }
}