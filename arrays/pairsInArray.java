package arrays;

public class pairsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(pairsInArray(arr));
    }

    public static int pairsInArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("Pairs are: " + arr[i] + arr[j]);
                count++;
            }
        }
        return count;
    }
}
