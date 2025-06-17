package Methods;
import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages of the friends
        System.out.print("Enter age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int anthonyAge = sc.nextInt();

        // Input heights of the friends
        System.out.print("Enter height of Amar (in cm): ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int anthonyHeight = sc.nextInt();

        // Find the youngest friend
        String youngestFriend = findYoungest(amarAge, akbarAge, anthonyAge);
        System.out.println("The youngest friend is: " + youngestFriend);

        // Find the tallest friend
        String tallestFriend = findTallest(amarHeight, akbarHeight, anthonyHeight);
        System.out.println("The tallest friend is: " + tallestFriend);

        sc.close();
    }

    public static String findYoungest(int amarAge, int akbarAge, int anthonyAge) {
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            return "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static String findTallest(int amarHeight, int akbarHeight, int anthonyHeight) {
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            return "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }
}