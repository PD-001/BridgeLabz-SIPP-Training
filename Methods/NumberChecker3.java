package Methods;
import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {

    // 1. Count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // 2. Store digits in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // 3. Duck Number: Contains at least one zero but not starting with zero
    public static boolean isDuckNumber(int number, int[] digits) {
        if (digits[0] == 0) return false; // can't start with 0
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // 4. Armstrong Number: Sum of digits^number of digits = number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // 5. Largest and Second Largest digit
    public static int[] findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }
        }

        return new int[]{largest, second};
    }

    // 6. Smallest and Second Smallest digit
    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                second = smallest;
                smallest = digit;
            } else if (digit < second && digit != smallest) {
                second = digit;
            }
        }

        return new int[]{smallest, second};
    }

    // main method to test all functionalities
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        System.out.println("\n--- NumberChecker Report ---");

        int digitCount = countDigits(number);
        System.out.println("Total Digits: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + (isDuckNumber(number, digits) ? "Yes" : "No"));
        System.out.println("Is Armstrong Number? " + (isArmstrongNumber(number, digits) ? "Yes" : "No"));

        int[] largestTwo = findTwoLargest(digits);
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out.println("Second Largest Digit: " + (largestTwo[1] != Integer.MIN_VALUE ? largestTwo[1] : "N/A"));

        int[] smallestTwo = findTwoSmallest(digits);
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println("Second Smallest Digit: " + (smallestTwo[1] != Integer.MAX_VALUE ? smallestTwo[1] : "N/A"));
    }
}
