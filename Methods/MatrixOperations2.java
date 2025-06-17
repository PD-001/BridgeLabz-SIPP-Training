package Methods;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations2 {

    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // random 0-9
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + "\t");
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking dimensions for matrix A
        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = sc.nextInt();

        // Taking dimensions for matrix B
        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = sc.nextInt();

        // Generate and display matrices
        int[][] A = generateMatrix(rowsA, colsA);
        int[][] B = generateMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        // Addition and Subtraction only if sizes match
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nAddition (A + B):");
            displayMatrix(addMatrices(A, B));

            System.out.println("\nSubtraction (A - B):");
            displayMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition and Subtraction not possible due to dimension mismatch.");
        }

        // Multiplication possible only if A's columns == B's rows
        if (colsA == rowsB) {
            System.out.println("\nMultiplication (A x B):");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible due to incompatible dimensions.");
        }

        sc.close();
    }
}
