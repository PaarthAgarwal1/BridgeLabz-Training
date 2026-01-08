import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        // Input and output file names
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            // FileReader reads characters from file (default charset)
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            // FileWriter writes characters to file (default charset)
            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Convert uppercase letters to lowercase
                String lowerCaseLine = line.toLowerCase();

                // Write converted line to output file
                bw.write(lowerCaseLine);
                bw.newLine();
            }

            System.out.println("File converted successfully.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
            e.printStackTrace();
        }
    }
}
