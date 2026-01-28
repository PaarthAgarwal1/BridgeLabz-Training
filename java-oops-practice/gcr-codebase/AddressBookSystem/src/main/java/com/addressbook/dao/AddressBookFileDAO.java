package com.addressbook.dao;

import com.addressbook.model.Contact;

import java.io.*;
import java.util.ArrayList;
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
    public List<String> readFromFile(){
        List<String> contactsFromFile=new ArrayList<>();
        try(BufferedReader reader=new BufferedReader(new FileReader(FILE_PATH))){
            String line;
            while ((line=reader.readLine())!=null){
                contactsFromFile.add(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return contactsFromFile;
    }
}
