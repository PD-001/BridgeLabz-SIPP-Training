package Methods;
import java.util.Scanner;

public class Rounds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of the triangle from the user
        System.out.print("Enter side 1 of the triangle (in meters): ");
        int side1 = sc.nextInt();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        int side2 = sc.nextInt();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        int side3 = sc.nextInt();

        // Calculate the number of rounds needed to complete a 5 km run
        int rounds = calculateRounds(side1, side2, side3);

        // Output the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");

        sc.close();
    }

    public static int calculateRounds(int side1, int side2, int side3) {
        // Calculate the perimeter of the triangle
        int perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        int distanceToRun = 5000;

        // Calculate the number of rounds
        return distanceToRun / perimeter;
    }
}