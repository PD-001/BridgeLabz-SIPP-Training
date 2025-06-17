package Methods;
import java.util.Scanner;
import java.lang.Math;
public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input angle in degrees from the user
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        sc.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }
}