// Program to check if a string of brackets is valid
import java.util.*;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        // go through each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if it's an opening bracket, push the closing one
            if (ch == '(') {
                st.push(')');
            } else if (ch == '{') {
                st.push('}');
            } else if (ch == '[') {
                st.push(']');
            } else {
                // for a closing bracket, it must match top of stack
                if (st.isEmpty() || st.pop() != ch) {
                    return false;
                }
            }
        }

        // if nothing is left, it's valid
        return st.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // try a few samples
        System.out.println(sol.isValid("()"));       // true
        System.out.println(sol.isValid("()[]{}"));   // true
        System.out.println(sol.isValid("(]"));       // false
        System.out.println(sol.isValid("([)]"));     // false
        System.out.println(sol.isValid("{[]}"));     // true
    }
}
