package com.linear_and_binary_search.stringbuilderproblem1;
public class ReverseString {
    public static String reverseUsingStringBuilder(String input) {
        // Step 1: Create a StringBuilder object and append the input string
        StringBuilder sb = new StringBuilder(input);

        // Step 2: Reverse the string using reverse() method
        sb.reverse();

        // Step 3: Convert StringBuilder back to String and return
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseUsingStringBuilder(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
