package Methods;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }

    public static boolean isLeapYear(int year) {
        // Check for valid year
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");
            return false;
        }

        // Check leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}