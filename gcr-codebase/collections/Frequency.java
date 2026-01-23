package collections;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        String st[] = { "apple", "banana", "guava", "apple", "guava" };
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : st) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }

}
