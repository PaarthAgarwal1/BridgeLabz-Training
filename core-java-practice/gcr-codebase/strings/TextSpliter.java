
import java.util.Scanner;
public class TextSpliter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        //Split into words manually
        String[] words = manualSplit(text);

        //Create 2D array of words and their lengths
        String[][] result = wordLengths(words);

        //Display result
        System.out.println("\nWord\t|\tLength");
        System.out.println("------------------------");
        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int len = Integer.valueOf(result[i][1]); //convert length back to int
            System.out.println(word + "\t" + len);
        }
    }

    // Method to manually split text (no built-in split)
    public static String[] manualSplit(String text) {

        int length = customLength(text);

        // Count spaces → number of words = spaces + 1
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];

        // Extract words
        int wordIndex = 0;
        String temp = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else {
                words[wordIndex++] = temp;
                temp = "";
            }
        }
        words[wordIndex] = temp; // last word

        return words;
    }

    // Method to compute custom string length (no length())
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method returning 2D array of word + its length
    public static String[][] wordLengths(String[] words) {

        String[][] arr = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(customLength(words[i]));
        }
        return arr;
    }

}
