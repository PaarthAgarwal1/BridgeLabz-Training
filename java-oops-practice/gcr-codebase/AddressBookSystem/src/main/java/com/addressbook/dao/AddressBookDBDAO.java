package com.addressbook.dao;

import com.addressbook.model.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddressBookDBDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/addressbook";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void saveContact(Contact contact) {
        String query = "INSERT INTO contacts VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, contact.getFirstName());
            stmt.setString(2, contact.getLastName());
            stmt.setString(3, contact.getAddress());
            stmt.setString(4, contact.getCity());
            stmt.setString(5, contact.getState());
            stmt.setString(6, contact.getZip());
            stmt.setString(7, contact.getPhoneNumber());
            stmt.setString(8, contact.getEmail());

            stmt.executeUpdate();
            System.out.println("Contact saved to database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
