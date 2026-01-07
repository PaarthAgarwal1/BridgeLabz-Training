import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

    public static void main(String[] args) {

        File sourceFile = new File("source.txt");
        File destinationFile = new File("destination.txt");

        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist!");
            return;
        }

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile); // creates file if not exists

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();

        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error closing file streams.");
            }
        }
    }
}
