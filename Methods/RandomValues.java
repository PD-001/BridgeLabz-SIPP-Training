package Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Output the results
        System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);

        sc.close();
    }

    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(9000) + 1000; // Generates a number between 1000 and 9999
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }
}