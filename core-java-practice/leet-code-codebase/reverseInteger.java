public class reverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0; // Return 0 in case of overflow
            }
            if (reversed < (Integer.MIN_VALUE - digit) / 10) {
                return 0; // Return 0 in case of underflow
            }

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 123; // Example number
        int result = reverse(number);
        System.out.println("Reversed Integer: " + result);
    }
}
