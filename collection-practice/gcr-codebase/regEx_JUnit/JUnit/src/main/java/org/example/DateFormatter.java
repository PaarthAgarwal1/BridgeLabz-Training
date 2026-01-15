package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    public String formateDate(String inputDate){
        if (inputDate == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        try {
            DateTimeFormatter inputFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date=LocalDate.parse(inputDate,inputFormatter);
            return date.format(outputFormatter);
        }catch (DateTimeParseException e){
            throw new IllegalArgumentException("Invalid date formate");
        }
    }
}
