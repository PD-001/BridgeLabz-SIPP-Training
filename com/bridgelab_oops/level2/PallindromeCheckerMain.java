package com.bridgelab_oops.level2;

import java.util.Scanner;

public class PallindromeCheckerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();

        PallindromeChecker checker = new PallindromeChecker(input);
        checker.displayResult();

        sc.close();
    }
}
