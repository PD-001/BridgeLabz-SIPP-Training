
package Arrays;
import java.util.Scanner;
public class StoreMultipleValuesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Create an array of 10 elements and initialize total
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Step 2: Use an infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Step 3: Check for exit conditions
            if (input <= 0 || index >= 10) {
                break; // Exit the loop if input is 0 or negative, or if array is full
            }

            // Step 5: Store the number in the array and increment index
            numbers[index] = input;
            index++;
        }

        // Step 6: Calculate the total of the entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Step 7: Display the total value
        System.out.println("Total of entered numbers: " + total);
        
        // Display all entered numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        sc.close();
    }
}