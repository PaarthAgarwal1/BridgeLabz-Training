
import java.util.Scanner;



public class SentenceFormatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        String formattedSentence=formatSentence(sentence);
        System.out.println("Formatted Sentence: " + formattedSentence);
        sc.close();
    }
    public static String formatSentence(String input){
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // Remove extra spaces
        input = input.trim().replaceAll("\\s+", " ");
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            // After punctuation, ensure space and capitalization
            if (ch == '.' || ch == '?' || ch == '!') {
                if(i+1<input.length() && input.charAt(i+1)!=' '){
                    result.append(" ");
                }
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }
    
}
