package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits and store in array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));

        // Reverse the digits array
        reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(digits));

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is the number a palindrome? " + isPalindrome);

        // Check if the number is a duck number
        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is the number a duck number? " + isDuckNumber);

        sc.close();
    }

    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean isPalindrome(int[] digits) {
        int left = 0, right = digits.length - 1;
        while (left < right) {
            if (digits[left] != digits[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // A duck number has a non-zero digit
            }
        }
        return false; // If all digits are zero, it's not a duck number
    }
}