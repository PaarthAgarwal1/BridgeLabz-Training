package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class FilterStudentsCSV {
    public static void main(String[] args) throws IOException , CsvValidationException {
        String filePath="Data/students.csv";
        try(CSVReader reader=new CSVReader(new FileReader(filePath))){
            //Skip header
            reader.readNext();
            String [] row;
            System.out.println("Students scoring more than 80:");
            while ((row=reader.readNext())!=null){
                int marks=Integer.parseInt(row[3]);
                if(marks>80){
                    if (marks > 80) {
                        System.out.println("ID: " + row[0] + ", Name: " + row[1] + ", Age: " + row[2] + ", Marks: " + row[3]);
                    }
                }
            }
        }catch(IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
