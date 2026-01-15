import java.util.*;

public class BinaryNumberGenerator {

    public static void main(String[] args) {

        int n = 5;

        Queue<String> queue = new LinkedList<>();

        List<String> result = new ArrayList<>();

        // Add the first binary number
        queue.add("1");

        for (int i = 0; i < n; i++) {

            String current = queue.remove();

            // Add the current binary number to result list
            result.add(current);

            // Generate next binary numbers by appending 0 and 1
            queue.add(current + "0");
            queue.add(current + "1");
        }

        // Print the generated binary numbers
        System.out.println("Binary Numbers: " + result);
    }
}
