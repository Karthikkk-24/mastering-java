package arrays;

public class largestSubarray {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        getLargestSubArray(arr);
        getLargestSubArray2(arr);
    }

    // Time Complexity = O(n)
    public static void getLargestSubArray(int[] arr) {
        int maxSum = arr[0];
        int currSum = arr[0];
        
        // Variables to track the subarray
        int start = 0;
        int end = 0;
        int tempStart = 0;
        
        // Start from second element
        for(int i = 1; i < arr.length; i++) {
            // If current element is better than currSum + current element,
            // start a new subarray
            if(arr[i] > currSum + arr[i]) {
                currSum = arr[i];
                tempStart = i;
            } else {
                currSum = currSum + arr[i];
            }
            
            // Update maxSum and subarray bounds if we found a better sum
            if(currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }
        
        // Print the result
        System.out.print("Largest subarray is: [");
        for(int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if(i < end) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Sum of largest subarray is: " + maxSum);
    }

    // Time Complexity = O(n^2)
    public static void getLargestSubArray2(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        
        System.out.println("Largest subarray is: " + maxSum);
    }

    // Time Complexity = O(n^^)

    
    
}
