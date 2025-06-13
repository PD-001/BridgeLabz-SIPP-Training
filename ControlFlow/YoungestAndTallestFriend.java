package ControlFlow;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter age of Anthony: ");
        int anthonyAge = scanner.nextInt();

        System.out.print("Enter height of Amar (in cm): ");
        int amarHeight = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int akbarHeight = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int anthonyHeight = scanner.nextInt();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        System.out.println("The youngest friend is " + youngestAge + " years old.");
        System.out.println("The tallest friend is " + tallestHeight + " cm tall.");

        scanner.close();
    }
}