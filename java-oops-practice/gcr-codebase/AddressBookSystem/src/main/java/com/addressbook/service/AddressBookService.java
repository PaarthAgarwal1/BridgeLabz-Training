package com.addressbook.service;

import com.addressbook.dao.AddressBookDAO;
import com.addressbook.model.Contact;

import java.util.List;

public class AddressBookService {
    private AddressBookDAO addressBookDAO=new AddressBookDAO();
    public void addContact(Contact contact){
        addressBookDAO.addContact(contact);
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
}
