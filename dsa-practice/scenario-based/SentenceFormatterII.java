import java.util.Scanner;

public class SentenceFormatterII {

    // count number of words
    public static int wordCount(StringBuilder sb) {
        String para = sb.toString().trim();
        if (para.isEmpty()) return 0;
        return para.split("\\s+").length;
    }

    // find longest word
    public static String longestWord(StringBuilder sb) {
        String[] words = sb.toString().split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // replace word (case-insensitive)
    public static StringBuilder replaceWord(String oldWord, String newWord, StringBuilder sb) {
        String updated = sb.toString()
                .replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
        return new StringBuilder(updated);
    }

    // format sentence (spacing + capitalization)
    public static StringBuilder formatSentence(StringBuilder sb) {
        String input = sb.toString().trim().replaceAll("\\s+", " ");
        StringBuilder result = new StringBuilder();
        boolean cap = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (cap && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                cap = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                result.append(" ");
                cap = true;
            }
        }
        return new StringBuilder(result.toString().trim());
    }

    public static void display(StringBuilder sb) {
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter paragraph (empty line to stop):");
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            sb.append(line).append(" ");
        }

        boolean run = true;
        while (run) {
            System.out.println("\n----- Choice Menu -----");
            System.out.println("1. Word Count");
            System.out.println("2. Longest Word");
            System.out.println("3. Replace Word");
            System.out.println("4. Format Sentence");
            System.out.println("5. Display Text");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Word Count: " + wordCount(sb));
                    break;

                case 2:
                    System.out.println("Longest Word: " + longestWord(sb));
                    break;

                case 3:
                    System.out.print("Word to replace: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Replace with: ");
                    String newWord = sc.nextLine();
                    sb = replaceWord(oldWord, newWord, sb);
                    break;

                case 4:
                    System.out.println("Sentence formatted.");
                    break;

                case 5:
                    display(sb);
                    break;

                case 6:
                    run = false;
                    System.out.println("Exiting...");
                    break;
            }
        }
    }
}
