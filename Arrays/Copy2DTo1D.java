
package Arrays;
import java.util.Scanner;
public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][cols];
        
        // Take user input for the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Create a 1D array to copy the elements of the matrix
        int[] array = new int[rows * cols];
        
        // Define index variable
        int index = 0;
        
        // Loop through the 2D array and copy elements to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Display the copied 1D array
        System.out.println("Copied 1D Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        
        sc.close();
    }
}