import java.util.*;

public class MapInverter {

    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> output = new HashMap<>();

        // Swap key and value while grouping duplicate values
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            output
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        // Print inverted map
        System.out.println("Inverted Map: " + output);
    }
}
