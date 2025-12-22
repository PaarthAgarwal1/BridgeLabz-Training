import java.util.Scanner;

public class ManualStringCompare {

    // Method to compare strings manually using charAt()
    public static boolean manualCompare(String s1, String s2) {
        // If lengths differ, not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = sc.next();    // Using next()

        System.out.print("Enter second word: ");
        String str2 = sc.next();    // Using next()

        boolean manualResult = manualCompare(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("\n=== RESULTS ===");
        System.out.println("String 1     : " + str1);
        System.out.println("String 2     : " + str2);
        System.out.println("Manual Check : " + manualResult);
        System.out.println("Built-in equals() Check : " + builtInResult);

        if (manualResult == builtInResult) {
            System.out.println("Conclusion  : Both comparisons produce SAME RESULT");
        } else {
            System.out.println("Conclusion  : The results DIFFER");
        }
    }
}
