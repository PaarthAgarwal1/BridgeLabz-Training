import java.util.*;

public class VoteCounter {

    public static void main(String[] args) {

        String[] votes = {"Alice", "Bob", "Alice", "Charlie", "Bob"};
        Map<String, Integer> countMap = new HashMap<>();

        // Count votes using HashMap
        for (String v : votes) {
            countMap.put(v, countMap.getOrDefault(v, 0) + 1);
        }

        // Sort results alphabetically using TreeMap
        Map<String, Integer> sortedResults = new TreeMap<>(countMap);

        // Preserve insertion order using LinkedHashMap
        Map<String, Integer> linkedResults = new LinkedHashMap<>(countMap);

        System.out.println("Sorted Results: " + sortedResults);
        System.out.println("Linked Results: " + linkedResults);
    }
}
