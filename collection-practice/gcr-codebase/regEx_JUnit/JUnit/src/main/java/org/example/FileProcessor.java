package org.example;
import java.io.*;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    public String readFromFile(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);

        StringBuilder data = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            data.append(line);
        }

        br.close();
        return data.toString();
    }
}
