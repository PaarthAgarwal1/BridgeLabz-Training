import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountUsingFileReader {

    public static void main(String[] args) {
        String filePath = "sample.txt";   // file to read
        String targetWord = "java";       // word to count
        int count = 0;

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Close resources
            br.close();

            // Print result
            System.out.println("The word '" + targetWord + "' appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
