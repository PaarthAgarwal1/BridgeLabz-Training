import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderToFile {

    public static void main(String[] args) {
        String filePath = "output.txt";

        try {
            // Read input from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Write input to file
            FileWriter fw = new FileWriter(filePath, true); 

            System.out.println("Enter text (type 'exit' to stop):");

            String input;

            // Read input until user types "exit"
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write input as a new line in the file
                fw.write(input + System.lineSeparator());
            }

            // Close resources
            fw.close();
            br.close();

            System.out.println("Input saved to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
