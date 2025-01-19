package matrices;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int matrix2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Complete Matrix:");
        MatrixPrinter.printMatrix(matrix);

        System.out.println("Spiral Matrix:");
        MatrixPrinter.spiralMatrix(matrix);
        
        System.out.println();
        MatrixPrinter.spiralMatrix(matrix2);

    }
}
