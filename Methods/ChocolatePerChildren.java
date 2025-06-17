package Methods;
import java.util.Scanner;

public class ChocolatePerChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of chocolates and number of children from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Find chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Output the results
        System.out.println("Each child will get: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}