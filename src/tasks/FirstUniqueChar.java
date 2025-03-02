package tasks;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static void main(String[] args) {

        String input = "swiss";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        boolean found = false;
        for (char c : input.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                System.out.println(c);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("no repeating");
        }
    }
}
