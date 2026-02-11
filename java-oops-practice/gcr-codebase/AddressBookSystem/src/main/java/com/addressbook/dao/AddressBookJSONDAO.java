package com.addressbook.dao;

import com.addressbook.model.Contact;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;

public class AddressBookJSONDAO {

    private static final String FILE_PATH = "Data/addressbook.json";
    private Gson gson = new Gson();

    public void writeToJSON(List<Contact> contacts) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(contacts, writer);
            System.out.println("Contacts written to JSON successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Contact> readFromJSON() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<List<Contact>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
