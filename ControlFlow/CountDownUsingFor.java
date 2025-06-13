package ControlFlow;

import java.util.Scanner;

public class CountDownUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();
        sc.close();

        for (int i = counter; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
    }
}
