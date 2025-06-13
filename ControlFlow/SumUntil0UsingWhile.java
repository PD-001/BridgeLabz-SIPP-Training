package ControlFlow;

import java.util.Scanner;

public class SumUntil0UsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum them up. Enter 0 or a negative number to stop:");

        while (true) {
            int number = sc.nextInt();
            if (number <= 0) {
                break;
            }
            sum += number;
        }

        sc.close();
        System.out.println("The total sum is: " + sum);
    }
}
