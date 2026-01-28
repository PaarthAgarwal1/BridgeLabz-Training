package com.addressbook.dao;

import com.addressbook.model.Contact;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AddressBookFileDAO {
    private static final String FILE_PATH="Data/addressbook.txt";
    public void writeToFile(List<Contact> contacts){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Contact contact:contacts){
                writer.write(contact.toString());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
