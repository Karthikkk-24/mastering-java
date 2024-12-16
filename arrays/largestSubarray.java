package arrays;

public class largestSubarray {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println(getLargestSubArray(arr));
    }

    public static int getLargestSubArray(int[] arr) {
        int count = 0;
        int totalSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int start = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int end = arr[j];
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println("" + sum);
                count++;
                if (sum > totalSum) {
                    totalSum = sum;
                }
            }
        }
        return totalSum;
    }
}
