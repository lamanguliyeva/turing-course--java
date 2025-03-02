package streamAPI;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Collection<Integer> integers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> sum = integers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum);
                //.reduce(sum1, sum2) -> sum1 + sum2);

        System.out.println(sum);
    }
}
