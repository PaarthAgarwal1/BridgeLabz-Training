import java.util.Scanner;

public class ManualUpperCase {

    // Method to convert lowercase letters to uppercase manually
    public static String toUpperManual(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if lowercase
            if (ch >= 'a' && ch <= 'z') {
                char upper = (char) (ch - 32); // Convert to uppercase
                result += upper;
            } else {
                result += ch; // keep same if not lowercase
            }
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete text using nextLine()
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Manual uppercase conversion
        String manualUpper = toUpperManual(text);

        // Built-in conversion
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean same = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase Output   : " + manualUpper);
        System.out.println("Built-in Uppercase Output : " + builtInUpper);
        System.out.println("\nDo both match? : " + same);
    }
}
