package Methods;

import java.util.Scanner;
import java.lang.Math;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature and wind speed from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Output the result
        System.out.println("The wind chill temperature is: " + windChill + " degrees Fahrenheit");

        sc.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}