import java.util.Scanner;

public class ChocolateDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfchocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();
        int chocolatesPerChild = numberOfchocolates / numberOfChildren;
        int remainingChocolates = numberOfchocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates is " + remainingChocolates);
    }
}
