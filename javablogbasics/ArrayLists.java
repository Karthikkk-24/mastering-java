package javablogbasics;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("First fruit: " + fruits.get(0));

        fruits.remove("Banana");

        System.out.println("Remaining fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
