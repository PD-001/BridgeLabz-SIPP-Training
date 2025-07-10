package com.sorting.bubble_student_marks;
import java.util.Scanner;


public class StudentMarksSort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap if elements are out of order
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened in this pass, array is already sorted
            if (!swapped)
                break;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input marks
        int[] marks = new int[n];
        System.out.println("Enter the marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Sort marks using Bubble Sort
        bubbleSort(marks);

        // Output sorted marks
        System.out.println("Sorted marks in ascending order:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
