package streamAPI;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        foo(null);
        foo("hello");
    }

    public static void foo(String val) {
        try {
            Optional<String> optional = Optional.of(val);
        } catch (Exception e) {
        }
        Optional<String> optional1 = Optional.ofNullable(val);
        Stream<String> stream = optional1.stream();

        Collection<Integer> integers = null;//Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> integers1 = Stream.ofNullable(integers)
                .flatMap(Collection::stream);

        //Stream<Collection<Integer>> integers1 = Stream.of(integers);

        /*integers.stream()
                .map(integer -> integer * 5)
                .filter(integer -> integer == 5)
                .findFirst()
                .ifPresent(System.out::println);*/

        /*Optional<Integer> o = integers.stream()
                .map(integer -> integer * 5)
                .filter(integer -> integer == 5)
                .findFirst();
        Integer i = o.orElse(-1);
        o.ifPresent(System.out::println);*/

        /*integers.stream()
                .reduce(Integer::sum);*/

        /*Integer sum = integers.stream()
                .reduce((integer1, integer2) -> integer1 + integer2)
                .orElse(0);*/

/*        Stream<Collection<Integer>> stream1 = Optional.ofNullable(integers)
                .stream();*/

/*
        Optional.ofNullable(integers)
                .stream()
                .flatMap(integers2 -> integers2.stream())
                .map();
*/



    }
}
