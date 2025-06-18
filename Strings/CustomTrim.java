package Strings;

import java.util.Scanner;

public class CustomTrim {

    // Step 1: Method to find start and end index excluding leading/trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end;

        // Find first non-space from start
        while (true) {
            try {
                if (str.charAt(start) != ' ')
                    break;
                start++;
            } catch (Exception e) {
                break;
            }
        }

        // Find first non-space from end
        end = start;
        while (true) {
            try {
                str.charAt(end);
                end++;
            } catch (Exception e) {
                break;
            }
        }

        end--; // move back from end overflow

        // Adjust end for trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Step 2: Create substring using charAt
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Step 3: Compare two strings using charAt
    public static boolean compareStrings(String a, String b) {
        int i = 0;
        while (true) {
            try {
                char ch1 = a.charAt(i);
                char ch2 = b.charAt(i);
                if (ch1 != ch2)
                    return false;
                i++;
            } catch (Exception e) {
                break;
            }
        }

        // Check if both ended at the same length
        try {
            a.charAt(i);
            return false; // a longer
        } catch (Exception e) {
        }

        try {
            b.charAt(i);
            return false; // b longer
        } catch (Exception e) {
        }

        return true;
    }

    // Step 4: Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);

        System.out.println("\n--- Trimming Result ---");
        System.out.println("Custom Trimmed: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both equal? " + isSame);
        sc.close();
    }
}
