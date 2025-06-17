package Methods;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Input ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility for each student
        for (int age : ages) {
            if (canStudentVote(age)) {
                System.out.println("Student with age " + age + " can vote.");
            } else {
                System.out.println("Student with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }

    public static boolean canStudentVote(int age) {
        // Validate age
        if (age < 0) {
            return false; // Negative age is invalid
        }
        // Check if age is 18 or above
        return age >= 18;
    }
}