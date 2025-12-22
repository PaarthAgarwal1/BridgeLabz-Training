
import java.util.Scanner;

public class ManualSplitOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();  // input using nextLine()

        int length = findLength(text);  // custom length

        // Manual split using charAt
        String[] manualWords = manualSplit(text, length);

        // Built-in split()
        String[] builtinWords = text.split(" ");

        // Compare arrays
        boolean result = compareArrays(manualWords, builtinWords);

        // Display results
        System.out.println("\nManual Split Words:");
        for (String w : manualWords) {
            System.out.println(w);
        }

        System.out.println("\nBuilt-in Split Words:");
        for (String w : builtinWords) {
            System.out.println(w);
        }

        System.out.println("\nBoth results same? " + result);
    }

    //Find string length without using length()
    public static int findLength(String text) {
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

    //Manual split using charAt()
    public static String[] manualSplit(String text, int length) {

        //Count number of words by counting spaces
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        int words = spaces + 1;

        //Record indexes of spaces
        int[] indexes = new int[words];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                indexes[idx++] = i;
            }
        }

        //Extract words manually
        String[] result = new String[words];

        int start = 0;
        for (int i = 0; i < spaces; i++) {
            int end = indexes[i];
            result[i] = extractWord(text, start, end);
            start = end + 1;
        }
        // Last word
        result[spaces] = extractWord(text, start, length);

        return result;
    }

    //extract substring manually
    public static String extractWord(String text, int start, int end) {
        String word = "";
        for (int i = start; i < end; i++) {
            word += text.charAt(i);
        }
        return word;
    }

    //Compare arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    } 
}
