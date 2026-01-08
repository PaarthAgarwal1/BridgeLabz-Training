import java.io.*;   // For BufferedReader, InputStreamReader, FileWriter

public class UserInfoToFile {

    public static void main(String[] args) {

        // BufferedReader to read input from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileWriter writer = null;

        try {
            // Ask user for details
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Create FileWriter to write data into file
            writer = new FileWriter("user_data.txt");

            // Write data into file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("\nData successfully saved to file.");

        } catch (IOException e) {
            System.out.println("Input/Output error occurred.");
            
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for age.");

        } finally {
            try {
                // Close FileWriter if it was opened
                if (writer != null) {
                    writer.close();
                }
                // Close BufferedReader
                br.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}
