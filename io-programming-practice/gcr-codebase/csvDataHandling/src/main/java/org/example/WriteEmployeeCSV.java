package org.example;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
    public static void main(String[] args) throws IOException {
        String filePath="Data/employee.csv";
        try(CSVWriter writer=new CSVWriter(new FileWriter(filePath))){
            String []header={"Id","Name","Department","Salary"};
            writer.writeNext(header);
            writer.writeNext(new String[]{"1", "Alice", "HR", "45000"});
            writer.writeNext(new String[]{"2", "Bob", "IT", "60000"});
            writer.writeNext(new String[]{"3", "Charlie", "Finance", "55000"});
            writer.writeNext(new String[]{"4", "David", "Marketing", "48000"});
            writer.writeNext(new String[]{"5", "Eva", "IT", "65000"});
            System.out.println("Employee data written successfully!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
