
import java.util.Stack;

public class SortStackUsingRecursion {
    //Method to sort stack using recursion
    public static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return ;
        }
        int top=stack.pop();
        sortStack(stack);
        insertStack(stack,top);
    }
    // Method to insert the element in the sorted stack
    public static void insertStack(Stack<Integer> stack,int element){
        if(stack.isEmpty()||stack.peek()<=element){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        insertStack(stack, element);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
    
}
