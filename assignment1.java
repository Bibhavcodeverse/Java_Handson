import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 4x4 2D array
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];

        // Take user input for the 2D array(A)
        System.out.println("Enter 16 integers for the 4x4 array A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array A
        System.out.println("The 4x4 2D array A is:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Take user input for the 2D array(B)
        System.out.println("Enter 16 integers for the 4x4 array B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array B
        System.out.println("The 4x4 2D array B is:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Multiply the matrices
        int[][] result = multiplyMatrices(A, B);

        // Display the result
        System.out.println("The product of matrices A and B is:");
        printMatrix(result);

        scanner.close();
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int r1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;
        int[][] product = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

