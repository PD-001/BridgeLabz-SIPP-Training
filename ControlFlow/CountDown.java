package ControlFlow;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();
        sc.close();

        while (counter > 0) {
            System.out.println("Countdown: " + counter);
            counter--;
        }
    }
}
