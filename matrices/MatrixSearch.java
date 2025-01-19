package matrices;

public class MatrixSearch {
    public static boolean printMatrix(int[][] matrix, int key) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty matrix");
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }

        return false;
    }
}