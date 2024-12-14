package arrays;

public class reverseArrays {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
}
