package Methods;

import java.util.Scanner;

public class CollinearityChecker {

    // Method 1: Check collinearity using slope
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method 2: Check collinearity using area of triangle
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area2 = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for three points
        System.out.print("Enter coordinates for Point A (x1 y1): ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.print("Enter coordinates for Point B (x2 y2): ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.print("Enter coordinates for Point C (x3 y3): ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        // Check using slope method
        boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope method? " + slopeCheck);

        // Check using area method
        boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area method? " + areaCheck);

        sc.close();
    }
}
