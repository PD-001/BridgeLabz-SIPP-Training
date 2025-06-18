package Strings;
import java.util.Scanner;

public class SubStringUsingCharAt {

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter the complete text: ");
        String inputText = sc.nextLine();
        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();

        // Step 2: Create substring using charAt()
        String customSubstring = createSubstring(inputText, startIndex, endIndex);

        // Step 3: Create substring using built-in method
        String builtinSubstring = inputText.substring(startIndex, endIndex);

        // Step 4: Compare both substrings
        boolean areEqual = compareStrings(customSubstring, builtinSubstring);

        // Step 5: Display results
        System.out.println("\nCustom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtinSubstring);
        System.out.println("Are both substrings same? " + areEqual);

        sc.close();
    }
}