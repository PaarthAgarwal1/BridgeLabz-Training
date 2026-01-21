package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) throws IOException , CsvValidationException {
        String pathFile="Data/students.csv";
        int count=0;
        try(CSVReader reader=new CSVReader(new FileReader(pathFile))){
            reader.readNext();
            String[]nextLine;
            while ((nextLine=reader.readNext())!=null){
                count++;
            }
            System.out.println("Number of rows in file excluding header are : "+count);
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
