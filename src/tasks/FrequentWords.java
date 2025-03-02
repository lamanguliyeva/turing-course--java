package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FrequentWords {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k: ");
        int k = sc.nextInt();
        sc.close();

        List<String> result = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) ->
                        !a.getValue().equals(b.getValue())
                                ? b.getValue().compareTo(a.getValue())
                                : a.getKey().compareTo(b.getKey()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(result);
    }
}
