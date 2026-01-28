package com.addressbook.service;

import com.addressbook.dao.AddressBookDAO;
import com.addressbook.dao.AddressBookDirectoryDAO;
import com.addressbook.dao.AddressBookFileDAO;
import com.addressbook.model.Contact;

import java.util.List;

public class AddressBookService {
    private AddressBookDAO addressBookDAO;
    private AddressBookDirectoryDAO directoryDAO;
    private AddressBookFileDAO fileDAO;

    public AddressBookService(AddressBookDirectoryDAO directoryDAO,AddressBookDAO addressBookDAO,AddressBookFileDAO fileDAO){
        this.addressBookDAO=addressBookDAO;
        this.directoryDAO=directoryDAO;
        this.fileDAO=fileDAO;
    }

    public void addContact(Contact contact){
        boolean added=addressBookDAO.addContact(contact);
        if (added){
            System.out.println("Contact added successfully");
        }else {
            System.out.println("Duplicate Contact Found! Not Added");
        }
        directoryDAO.addToCityStateMap(contact);
    }
    public List<Contact> getContacts(){
        return addressBookDAO.getAllContacts();
    }
    public boolean editContact(String name,String city,String state,String zip,String phoneNumber,String email){
        Contact contact=addressBookDAO.findByName(name);
        if(contact==null){
            return false;
        }
        addressBookDAO.updateContact(contact,city,state,zip,phoneNumber,email);
        return true;
    }
    public boolean deleteContact(String name){
        return addressBookDAO.deleteContact(name);
    }
    public void displayAllContact(){
        if(addressBookDAO.getAllContacts().isEmpty()){
            System.out.println("Address Book is Empty");
            return;
        }
        for (Contact contact:addressBookDAO.getAllContacts()){
            System.out.println(contact);
        }
    }
    public void writeContactsToFile(){
        List<Contact> contacts=addressBookDAO.getAllContacts();
        if(contacts.isEmpty()){
            System.out.println("Address Book is empty");
            return;
        }
        fileDAO.writeToFile(contacts);
        System.out.println("Contacts written to file successfully");
    }
}
