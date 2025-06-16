package ControlFlow;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input for month, day, and year
        System.out.print("Enter month from 1 to 12: ");
        int m = input.nextInt();
        System.out.print("Enter day: ");
        int d = input.nextInt();
        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Apply formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + 31 * m0 / 12) % 7;

        // Print the result
        System.out.println("Day of the week: " + dayOfWeek);

        // Close the scanner
        input.close();
    }
}