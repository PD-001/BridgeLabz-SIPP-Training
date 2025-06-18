package Strings;

import java.util.Scanner;

public class WordLengthAnalyzer {

    // Step 2: Split the sentence into words without using split()
    public static String[] splitWords(String text) {
        String[] words = new String[100];
        StringBuilder word = new StringBuilder();
        int index = 0;

        for (int i = 0;; i++) {
            try {
                char ch = text.charAt(i);
                if (ch == ' ') {
                    if (word.length() > 0) {
                        words[index++] = word.toString();
                        word.setLength(0);
                    }
                } else {
                    word.append(ch);
                }
            } catch (Exception e) {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                }
                break;
            }
        }

        // Create a trimmed array with actual word count
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }
        return result;
    }

    // Step 3: Method to get length without using length()
    public static int findLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Do nothing, reached end
        }
        return count;
    }

    // Step 4: Method to return word-length pairs
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }

    // Step 5: Method to find shortest and longest word
    public static String[] findShortestAndLongest(String[][] wordData) {
        int minLen = Integer.MAX_VALUE;
        int maxLen = Integer.MIN_VALUE;
        String shortest = "", longest = "";

        for (int i = 0; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordData[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordData[i][0];
            }
        }

        return new String[] { shortest, longest };
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengths = getWordLengths(words);
        String[] result = findShortestAndLongest(wordLengths);

        // Display word lengths
        System.out.println("\n--- Word Lengths ---");
        for (String[] wl : wordLengths) {
            System.out.println("Word: " + wl[0] + ", Length: " + wl[1]);
        }

        // Display results
        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        sc.close();
    }
}
