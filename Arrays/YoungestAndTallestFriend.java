
package Arrays;
import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        // Input ages and heights for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }
        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        // Display the results
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
        sc.close();
    }
}