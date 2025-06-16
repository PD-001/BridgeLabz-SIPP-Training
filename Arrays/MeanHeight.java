package Arrays;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.println("Enter the heights of 11 students in cm:");
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double meanHeight = sum / heights.length;
        System.out.println("The mean height of the students is: " + meanHeight);
        sc.close();
    }
}
