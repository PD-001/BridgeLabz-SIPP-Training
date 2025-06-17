package Methods;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = calcHandshakes(numberOfStudents);

        // Output the result
        System.out.println("Maximum number of handshakes: " + handshakes);

        sc.close();
    }

    public static int calcHandshakes(int n) {
        // Using the combination formula to calculate handshakes
        return (n * (n - 1)) / 2;
    }
}