package matrices;

public class MatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int key) {
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

    public static boolean staircaseSearch(int[][] matrix, int key) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty matrix");
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1;

        while (col >=0 && row < matrix.length) {
            System.out.println(matrix[row][col]);

            if (matrix[row][col] < key) {
                row++;
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                return true;
            }
        }
        
        return false;
    }
}