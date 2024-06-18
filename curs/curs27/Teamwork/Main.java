package curs.curs27.Teamwork;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "apple", "orange", "banana", "grape", "apple", "orange");
        HashMap<String, Integer> counter = new HashMap<>();

        for (String fruct : strings) {
            if (!counter.containsKey(fruct)) counter.put(fruct, 1);
            else counter.put(fruct,counter.get(fruct)+1);
        }
        System.out.println(counter);
    }
}
