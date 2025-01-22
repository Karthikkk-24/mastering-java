package matrices;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};

        System.out.println("Enter key to be searched:");
        int key = 30;
        System.out.println("Key found: " + MatrixSearch.staircaseSearch(matrix, key));
        
    }
}
