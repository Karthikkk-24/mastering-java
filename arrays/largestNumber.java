package arrays;

public class largestNumber {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        System.out.println(getLargestNumber(numbers));
    }

    public static int getLargestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }
}
