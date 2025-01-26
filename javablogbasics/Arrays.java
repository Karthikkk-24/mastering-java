package javablogbasics;

public class Arrays {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of elements: " + sum);
    }
    
}
