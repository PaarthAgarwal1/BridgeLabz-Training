import java.util.*;

public class ListRotator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int distance = 2;

        // Print original list
        System.out.println("Original: " + list);

        // Rotate list elements by given distance
        Collections.rotate(list, distance);

        // Print rotated list
        System.out.println("Rotated: " + list);
    }
}
