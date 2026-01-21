package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
    public static void main(String[] args) throws IOException, CsvValidationException {

        String filePath = "Data/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header=reader.readNext();
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                for(int i=0;i<nextLine.length;i++){
                    System.out.print(header[i]+" -> "+nextLine[i]+", ");
                }
                System.out.println();
            }

        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
}
