import java.util.*;

public class QueueReverser {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        Stack<Integer> stack = new Stack<>();

        // Move all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Move elements back to queue in reverse order
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Print reversed queue
        System.out.println("Reversed Queue: " + queue);
    }
}
