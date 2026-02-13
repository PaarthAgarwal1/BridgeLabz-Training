package com.addressbook.dao;

import com.addressbook.model.Contact;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddressBookCSVDAO {

    private static final String FILE_PATH = "Data/addressbook.csv";
    private static final Logger LOGGER = Logger.getLogger(AddressBookCSVDAO.class.getName());


    public void writeToCSV(List<Contact> contacts) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(FILE_PATH))) {

            for (Contact c : contacts) {
                String[] data = {
                        c.getFirstName(),
                        c.getLastName(),
                        c.getAddress(),
                        c.getCity(),
                        c.getState(),
                        c.getZip(),
                        c.getPhoneNumber(),
                        c.getEmail()
                };
                writer.writeNext(data);
            }
            System.out.println("Contacts written to CSV successfully");

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error writing contacts to CSV", e);
        }
    }

    public List<Contact> readFromCSV() {
        List<Contact> contacts = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(FILE_PATH))) {

            String[] line;
            while ((line = reader.readNext()) != null) {
                Contact contact = new Contact(
                        line[0], line[1], line[2],
                        line[3], line[4], line[5],
                        line[6], line[7]
                );
                contacts.add(contact);
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error reading contacts to CSV", e);
        }

        return contacts;
    }
}
