package Methods;

import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker2 {

    // Method 1: Count the number of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method 2: Store digits in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method 3: Sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method 4: Sum of squares of digits using Math.pow()
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method 5: Check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = sumOfDigits(digits);
        return number % digitSum == 0;
    }

    // Method 6: Frequency of each digit using a 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // digits 0-9
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0)
                count++;
        }

        int[][] freqTable = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                freqTable[index][0] = i; // digit
                freqTable[index][1] = freq[i]; // frequency
                index++;
            }
        }

        return freqTable;
    }

    // Main method to call all utilities
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int digitCount = countDigits(number);
        System.out.println("Total Digits: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int digitSum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + digitSum);

        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        boolean harshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number? " + (harshad ? "Yes" : "No"));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int[] row : freq) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
