import java.util.Scanner;

public class ManualSubString {

    // Method to create substring manually
    public static String manualSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings manually using charAt()
    public static boolean manualCompare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter a word: ");
        String text = sc.nextLine();  // Taking input

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring manually
        String manualSub = manualSubstring(text, start, end);

        // Built-in substring
        String builtInSub = text.substring(start, end);

        // Compare manually
        boolean compareResult = manualCompare(manualSub, builtInSub);

        // Display results
        System.out.println("\n=== RESULTS ===");
        System.out.println("Original Text : " + text);
        System.out.println("Start Index   : " + start);
        System.out.println("End Index     : " + end);
        System.out.println("Manual Substring     : " + manualSub);
        System.out.println("Built-in Substring   : " + builtInSub);
        System.out.println("Both Matched (Manual Compare)? : " + compareResult);
    }
}
