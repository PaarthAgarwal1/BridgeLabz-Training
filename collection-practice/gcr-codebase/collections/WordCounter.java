import java.util.*;

public class WordCounter {

    public static void main(String[] args) {

        String input = "Hello world, hello Java!";

        // Clean input and split into words
        String[] words = input.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

        Map<String, Integer> freqMap = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Print word frequencies
        System.out.println("Frequencies: " + freqMap);
    }
}
