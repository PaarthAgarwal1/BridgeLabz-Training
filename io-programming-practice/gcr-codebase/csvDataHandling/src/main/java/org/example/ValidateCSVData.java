package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

    public static void main(String[] args) {

        String filePath = "Data/users.csv";

        // Regex patterns
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("\\d{10}");

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            // Skip header
            reader.readNext();

            String[] row;

            while ((row = reader.readNext()) != null) {

                String email = row[2];
                String phone = row[3];

                boolean validEmail = emailPattern.matcher(email).matches();
                boolean validPhone = phonePattern.matcher(phone).matches();

                if (!validEmail || !validPhone) {
                    System.out.println("Invalid Row Found:");
                    System.out.println("ID: " + row[0] + ", Name: " + row[1] + ", Email: " + email + ", Phone: " + phone);

                    if (!validEmail) {
                        System.out.println("Invalid Email Format");
                    }
                    if (!validPhone) {
                        System.out.println("Invalid Phone Number");
                    }
                    System.out.println();
                }
            }

        } catch (IOException | CsvValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
