import java.util.Scanner;

public class FirstNonRepeatingCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String text) {

        //Frequency array for ASCII characters
        int[] freq = new int[256];

        //Count frequencies using charAt()
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        //Find first character whose frequency is 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        // If none found
        return 0;
    }
}
