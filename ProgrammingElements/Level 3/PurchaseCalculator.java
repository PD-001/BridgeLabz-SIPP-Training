import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double unitPrice = scanner.nextDouble();
        int quantity = scanner.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
    }
}
