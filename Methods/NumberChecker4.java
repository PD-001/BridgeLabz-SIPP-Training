package Methods;
import java.util.Scanner;

public class NumberChecker4 {

    // 1. Check if number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 2. Check if number is Neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // 3. Check if number is Spy (sum of digits == product of digits)
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // 4. Check if number is Automorphic (square ends with the number)
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // 5. Check if number is Buzz (divisible by 7 or ends with 7)
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to demonstrate all checks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        System.out.println("\n--- NumberChecker Report ---");
        System.out.println("Is Prime Number? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Is Neon Number? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Is Spy Number? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Is Automorphic Number? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Is Buzz Number? " + (isBuzz(number) ? "Yes" : "No"));
    }
}
