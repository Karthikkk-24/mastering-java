package arrays;

public class binarySearch {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        int key = 3;
        System.out.println(binarySearch(numbers, key));
    }

    // Time Complexity = O(log n)
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == numbers[mid]) {
                return mid;
            }
            if (key < numbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
