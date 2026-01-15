import java.util.*;

public class SubsetVerifier {

    public static void main(String[] args) {

        // Initialize two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1);

        // Print result
        System.out.println("Is Subset: " + isSubset);
    }
}
