package Methods;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method 1: Generate random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // random 0–9
        return matrix;
    }

    // Method 2: Transpose of matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // Method 3: Determinant of 2x2
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Method 4: Determinant of 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method 5: Inverse of 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    // Method 6: Inverse of 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double[][] minor = new double[2][2];
                int r = 0;
                for (int x = 0; x < 3; x++) {
                    if (x == i) continue;
                    int c = 0;
                    for (int y = 0; y < 3; y++) {
                        if (y == j) continue;
                        minor[r][c] = m[x][y];
                        c++;
                    }
                    r++;
                }
                double cofactor = Math.pow(-1, i + j) * determinant2x2(minor);
                inv[j][i] = cofactor / det; // adjugate + divide by determinant
            }
        }
        return inv;
    }

    // Method 7: Display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();
        sc.close();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 matrices supported.");
            return;
        }

        double[][] matrix = generateMatrix(size, size);
        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.printf("\nDeterminant: %.2f\n", det);
            double[][] inv = inverse2x2(matrix);
            if (inv == null) System.out.println("Inverse does not exist.");
            else {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        } else {
            double det = determinant3x3(matrix);
            System.out.printf("\nDeterminant: %.2f\n", det);
            double[][] inv = inverse3x3(matrix);
            if (inv == null) System.out.println("Inverse does not exist.");
            else {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        }
    }
}
