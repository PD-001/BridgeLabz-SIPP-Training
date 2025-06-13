import java.util.Scanner;

public class DiscountCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fee = scanner.nextDouble();
        double discountPercent = scanner.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
