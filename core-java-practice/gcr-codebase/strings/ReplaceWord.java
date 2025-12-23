import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        int i = 0;

        while (i < sentence.length()) {
            String word = "";

            // Extract word
            while (i < sentence.length() && sentence.charAt(i) != ' ') {
                word += sentence.charAt(i);
                i++;
            }

            if (word.equals(oldWord)) {
                result += newWord;
            } else {
                result += word;
            }

            // Add space
            if (i < sentence.length()) {
                result += " ";
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String updatedSentence =
                replaceWord(sentence, oldWord, newWord);

        System.out.println("Updated sentence:");
        System.out.println(updatedSentence);

        sc.close();
    }
}
