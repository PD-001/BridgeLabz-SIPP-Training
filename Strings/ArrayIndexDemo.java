package Strings;
import java.util.Scanner;
public class ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        //Create an array of names
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        //Call method to generate the exception
        generateException(names);

        //Call method to handle the exception using try-catch
        handleException(names);
        sc.close();
    }

    //Generate runtime exception by accessing invalid index
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    //Handle exception using try-catch block
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
