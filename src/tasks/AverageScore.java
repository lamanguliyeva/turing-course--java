package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class AverageScore {

    public static void main(String[] args) {

        List<String[]> scores = Arrays.asList(new String[]{"Alice", "90"},
                new String[]{"Bob", "80"},
                new String[]{"Alice", "100"},
                new String[]{"Bob", "70"});

        Map<String, Double> avgScore = scores.stream()
                .collect(Collectors.groupingBy(s -> s[0], Collectors.averagingInt(s -> Integer.parseInt(s[1]))));

        System.out.println(avgScore);
    }
}
