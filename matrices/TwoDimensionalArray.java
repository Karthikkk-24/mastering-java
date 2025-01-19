package matrices;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int n = 3;
        int m = 3;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix using basic printing
        System.out.println("Complete Matrix:");
        MatrixPrinter.printMatrix(matrix);

        // Matrix Search
        System.out.println("Enter key to be searched:");
        int key = sc.nextInt();
        System.out.println("Key found: " + MatrixSearch.printMatrix(matrix, key));

        sc.close();
    }
}
