package javablogbasics;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate, won't be added

        System.out.println("Set contains 20: " + numbers.contains(20));

        System.out.println("Set elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
