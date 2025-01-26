package javablogbasics;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        
        marks.put("Alice", 85);
        marks.put("Bob", 92);
        marks.put("Charlie", 78);

        System.out.println("Alice's marks: " + marks.get("Alice"));

        System.out.println("All marks:");
        for (String name : marks.keySet()) {
            System.out.println(name + ": " + marks.get(name));
        }
    }

}
