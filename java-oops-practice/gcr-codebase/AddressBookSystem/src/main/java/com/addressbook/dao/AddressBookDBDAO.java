package com.addressbook.dao;

import com.addressbook.config.DBConfig;
import com.addressbook.model.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressBookDBDAO {

    public void saveContact(Contact contact) {

        String query = "INSERT INTO contacts " +
                "(firstName, lastName, address, city, state, zip, phoneNumber) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBConfig.getUser(),
                DBConfig.getPassword());
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, contact.getFirstName());
            stmt.setString(2, contact.getLastName());
            stmt.setString(3, contact.getAddress());
            stmt.setString(4, contact.getCity());
            stmt.setString(5, contact.getState());
            stmt.setString(6, contact.getZip());
            stmt.setString(7, contact.getPhoneNumber());

            stmt.executeUpdate();

            System.out.println("Contact saved successfully!");

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}
