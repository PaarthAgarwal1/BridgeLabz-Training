import java.util.Scanner;

public class FrequencyUsingCharAt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        // Call frequency method
        String[][] result = findFrequency(text);

        // Display result
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0] + " = " + result[i][1]);
            }
        }
    }

    public static String[][] findFrequency(String text) {

        //Create array for ASCII frequency
        int[] freq = new int[256];

        //Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        //Create a 2D array to store character & frequency
        String[][] result = new String[text.length()][2];
        int index = 0;

        //Store characters and their frequencies in the 2D array
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // Avoid repeating same character
                index++;
            }
        }

        return result;
    }
}
