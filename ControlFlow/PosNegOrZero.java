package ControlFlow;

import java.util.Scanner;

public class PosNegOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is positive, negative, or zero: ");
        int number = sc.nextInt();
        sc.close();

        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

}
