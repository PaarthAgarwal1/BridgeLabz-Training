// Simple program to check if a number is a palindrome
class Solution {

    // Method to check palindrome
    public boolean isPalindrome(int x) {
        
        // negative numbers can't be palindromes
        if (x < 0) {
            return false;
        }

        int original = x;   // store the original number
        int reverse = 0;    // will hold the reversed number

        // reverse the number digit by digit
        while (x != 0) {
            int lastDigit = x % 10;          // grab last digit
            reverse = reverse * 10 + lastDigit; // build reverse
            x = x / 10;                      // drop last digit
        }

        // if both match, it's a palindrome
        return reverse == original;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // some test values to check
        int[] nums = {121, -121, 10, 333, 12321, 0};

        for (int n : nums) {
            System.out.println(n + " -> " + sol.isPalindrome(n));
        }
    }
}
