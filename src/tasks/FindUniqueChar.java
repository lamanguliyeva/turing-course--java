package tasks;

import java.util.Arrays;
import java.util.List;

public class FindUniqueChar {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        List<Character> sortedUniqueFruits = fruits.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .sorted()
                .toList();

        System.out.println(sortedUniqueFruits);
    }
}
