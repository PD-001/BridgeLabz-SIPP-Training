
package Arrays;

import java.util.Scanner;

public class VotingAgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an array to store the ages of 10 students
        int[] ages = new int[10];
        // Prompt the user to enter the ages of the students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        // Check if each student can vote based on their age
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        sc.close();
    }
}
