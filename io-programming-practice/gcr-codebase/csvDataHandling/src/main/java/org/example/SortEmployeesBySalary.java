package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {
    public static void main(String[] args) {
        String filePath="Data/employee.csv";
        List<String[]> employees=new ArrayList<>();
        try(CSVReader reader=new CSVReader(new FileReader(filePath))){
            String [] row;
            reader.readNext();
            while ((row=reader.readNext())!=null){
                employees.add(row);
            }
            employees.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] e1, String[] e2) {
                    double s1=Double.parseDouble(e1[3]);
                    double s2=Double.parseDouble(e2[3]);
                    return Double.compare(s2,s1);
                }
            });
            System.out.println("Top 5 highest paid Employees : ");
            for(int i=0;i<Math.min(5,employees.size());i++){
                String[]emp=employees.get(i);
                System.out.println("Name: "+emp[1]+", Department: "+emp[2]+", Salary: "+emp[3]);
            }
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
