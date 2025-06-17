package Methods;

import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input kilometers from the user
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");

        // Input miles from the user
        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");

        // Input meters from the user
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");

        // Input feet from the user
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");

        sc.close();
    }

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
}