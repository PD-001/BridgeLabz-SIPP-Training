package Arrays;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Take user input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        //Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        
        // Create an array to store the digits
        int[] digits = new int[count];
        
        //Extract digits and save them in the array
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        //Display the elements of the array in reverse order
        System.out.println("Reversed Number:");
        for (int digit : digits) {
            System.out.print(digit);
        }
        
        sc.close();
    }
}