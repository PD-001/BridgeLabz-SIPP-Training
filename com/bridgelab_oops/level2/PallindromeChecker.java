package com.bridgelab_oops.level2;

public class PallindromeChecker {
    private String text;

    // Constructor
    public PallindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a pallindrome
    public boolean isPalindrome() {
    	String lowerText = text.toLowerCase();

        int left = 0;
        int right = lowerText.length() - 1;

        while (left < right) {
            if (lowerText.charAt(left) != lowerText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a pallindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a pallindrome.");
        }
    }
}
