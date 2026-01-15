import java.util.*;

public class StackUsingQueues {

    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push element by moving elements between queues
        public void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Remove top element
        public void pop() {
            if (!q1.isEmpty()) {
                q1.remove();
            }
        }

        // Return top element
        public int top() {
            return q1.isEmpty() ? -1 : q1.peek();
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop(); // removes 3

        System.out.println("Top Element: " + s.top());
    }
}
