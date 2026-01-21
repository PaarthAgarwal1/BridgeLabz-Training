package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {
    public static void main(String[] args) throws IOException , CsvValidationException {
        String inputFilePath="Data/employee.csv";
        String outputFilePath="Data/updatedEmployee.csv";
        try(CSVReader reader=new CSVReader(new FileReader(inputFilePath));
            CSVWriter writer=new CSVWriter(new FileWriter(outputFilePath))){
            String [] row;
            row=reader.readNext();
            writer.writeNext(row);

            while((row=reader.readNext())!=null){
                String department=row[2];
                double salary=Double.parseDouble(row[3]);
                if(department.equalsIgnoreCase("IT")){
                    salary=salary+(salary*0.10);
                    row[3]=String.valueOf((int)salary);
                }
                writer.writeNext(row);
            }
            System.out.println("Updated CSV file created successfully ! ");
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
