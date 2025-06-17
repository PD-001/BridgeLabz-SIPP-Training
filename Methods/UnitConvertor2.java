
package Methods;
import java.util.Scanner;

public class UnitConvertor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input yards from the user
        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");

        // Input feet from the user
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");

        // Input meters from the user
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");

        // Input inches from the user
        System.out.print("Enter distance in inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");
        
        // Convert inches to centimeters
        System.out.print("Enter distance in inches for conversion to centimeters: ");
        double inchesForCm = sc.nextDouble();
        System.out.println(inchesForCm + " inches is equal to " + convertInchesToCentimeters(inchesForCm) + " centimeters.");

        sc.close();
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3; // 1 yard = 3 feet
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333; // 1 foot = 0.333333 yards
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701; // 1 meter = 39.3701 inches
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254; // 1 inch = 0.0254 meters
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54; // 1 inch = 2.54 centimeters
    }
}