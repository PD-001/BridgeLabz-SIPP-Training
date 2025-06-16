package Arrays;
import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();
        
        // Step 2: Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step 3: Find factors and store them
        for (int i = 1; i <= number; i+=1) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Step 4: Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
