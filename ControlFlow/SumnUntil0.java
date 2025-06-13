package ControlFlow;

import java.util.Scanner;

public class SumnUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to sum (0 to stop): ");

        int sum = 0;
        int number;

        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        sc.close();
        System.out.println("The total sum is: " + sum);
    }

}
