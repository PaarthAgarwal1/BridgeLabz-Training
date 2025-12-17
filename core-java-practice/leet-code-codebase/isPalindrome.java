public class isPalindrome {
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        int original = x;
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        
        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 121; // Example number
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
