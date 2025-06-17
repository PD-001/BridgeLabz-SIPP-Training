package Methods;

import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        // Input coefficients a, b, and c from the user
        System.out.println("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        b = sc.nextDouble();
        System.out.println("Enter the value of c: ");
        c = sc.nextDouble();
        // Calculate the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);
        // Output the results
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            System.out.println("Roots of the equation are: " + Arrays.toString(roots));
        }
        sc.close();
    }

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate the discriminant

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[] { root, root };
        } else {
            // No real roots
            return new double[0];
        }
    }
}