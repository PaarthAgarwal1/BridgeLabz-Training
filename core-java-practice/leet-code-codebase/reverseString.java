public class ReverseString {
    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hello, World!"; // Example string
        String result = reverseString(input);
        System.out.println("Reversed String: " + result);
    }
}
