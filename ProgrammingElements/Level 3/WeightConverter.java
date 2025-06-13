import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double weightInKg = weight / 2.2;
        System.out.println("The weight of the person in pounds is " + weight + " and in kg is " + weightInKg);
    }
}
