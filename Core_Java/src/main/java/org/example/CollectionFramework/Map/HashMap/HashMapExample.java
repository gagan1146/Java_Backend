package org.example.CollectionFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);

        System.out.println("Bob's score: " + studentScores.get("Bob"));

        if (studentScores.containsKey("Alice")) {
            System.out.println("Alice's score: " + studentScores.get("Alice"));
        }

        System.out.println("\nAll student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        studentScores.remove("Charlie");
        System.out.println("\nAfter removing Charlie: " + studentScores);
    }
}
