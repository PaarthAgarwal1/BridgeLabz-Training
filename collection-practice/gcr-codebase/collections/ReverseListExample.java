import java.util.*;

public class ReverseListExample {

    // Method to reverse an ArrayList
    public static void reverseArrayList(ArrayList<Integer> list) {
        int start = 0;                  // first index
        int end = list.size() - 1;      // last index

        // Swap elements until middle is reached
        while (start < end) {
            int temp = list.get(start);        // store start value
            list.set(start, list.get(end));    // put end value at start
            list.set(end, temp);               // put start value at end

            start++;   // move forward
            end--;     // move backward
        }
    }

    // Method to reverse a LinkedList
    public static void reverseLinkedList(LinkedList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        // Same swapping logic works for LinkedList
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    // Main method (Terminal runnable)
    public static void main(String[] args) {

        // -------- ArrayList Example --------
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // -------- LinkedList Example --------
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("\nOriginal LinkedList: " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
