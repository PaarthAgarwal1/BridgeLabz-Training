import java.util.Scanner;

public class ManualCharArray {

    // Method to convert String to char[] manually
    public static char[] getCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays manually
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input using next()
        System.out.print("Enter a word: ");
        String text = sc.next();

        // Manual conversion
        char[] manualChars = getCharArray(text);

        // Built-in method
        char[] builtInChars = text.toCharArray();

        // Compare
        boolean isSame = compareArrays(manualChars, builtInChars);

        // Display results
        System.out.println("\n=== RESULT ===");
        System.out.print("Manual Characters     : ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in Characters    : ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nArrays Match? : " + isSame);
    }
}
