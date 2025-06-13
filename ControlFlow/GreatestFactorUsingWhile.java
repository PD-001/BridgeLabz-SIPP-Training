package ControlFlow;

import java.util.Scanner;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its greatest factor: ");
        int number = sc.nextInt();
        sc.close();
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);
    }
}