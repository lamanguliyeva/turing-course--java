package tasks;

import java.util.List;

public class TransformList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println(result);
    }
}
