import java.util.*;

public class SetSorter {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert set to list
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the list
        Collections.sort(sortedList);

        // Print sorted result
        System.out.println("Sorted List: " + sortedList);
    }
}
