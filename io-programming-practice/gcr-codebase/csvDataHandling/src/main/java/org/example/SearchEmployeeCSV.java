package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "Data/employee.csv";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            // Skip header
            reader.readNext();

            String[] row;

            while ((row = reader.readNext()) != null) {

                String name = row[1];

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Employee Found!");
                    System.out.println("Department: " + row[2]);
                    System.out.println("Salary: " + row[3]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }

        } catch (IOException | CsvValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
