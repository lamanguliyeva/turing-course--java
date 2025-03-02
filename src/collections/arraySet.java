package collections;
import java.util.*;

public class arraySet {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3, 2};
        int[] arr2 = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurenes(arr1));
        System.out.println(uniqueOccurenes(arr2));
    }

    public static boolean uniqueOccurenes (int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        Set<Integer> occurrenceSet = new HashSet<>(countMap.values());
        return countMap.size() == occurrenceSet.size();

    }
}
