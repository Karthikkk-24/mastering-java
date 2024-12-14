package arrays;

public class subArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(subarray(arr));
    }

    public static int subarray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            int start = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int end = arr[j];
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("");
                count++;
            }
        }
        return count;
    }
    
}
