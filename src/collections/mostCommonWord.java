package collections;
import java.util.*;

public class mostCommonWord {

    public static void main(String[] args) {
        String text = "";
        System.out.println(mostCommonWord(text));
    }

    public static String mostCommonWord (String text) {
        String[] words = text.split(" ");

        Arrays.stream(words).forEach(System.out::println);
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return Collections.max(wordCount.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
