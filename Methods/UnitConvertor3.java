package Methods;
import java.util.Scanner;
public class UnitConvertor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Fahrenheit from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is equal to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");

        // Input Celsius from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " Celsius is equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");

        // Input pounds from the user
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");

        // Input kilograms from the user
        System.out.print("Enter weight in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Input gallons from the user
        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");

        // Input liters from the user
        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");

        sc.close();
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}