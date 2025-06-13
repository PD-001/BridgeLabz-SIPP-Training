package ControlFlow;

import java.util.Scanner;

public class SumNaturalNumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to sum natural numbers up to it: ");
        int number = sc.nextInt();
        sc.close();
        int sum = 0;

        if (number >= 0) {
            int sum1 = number * (number + 1) / 2;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            if (sum1 == sum)
                System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }

}
