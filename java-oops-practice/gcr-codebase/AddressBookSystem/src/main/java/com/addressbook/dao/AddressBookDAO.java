package com.addressbook.dao;

import com.addressbook.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class AddressBookDAO {
    private List<Contact> contactList=new ArrayList<>();
    public void addContact(Contact contact){
        contactList.add(contact);
    }
    public List<Contact> getAllContacts(){
        return contactList;
    }
    public Contact findByName(String name){
        for (Contact contact:contactList){
            if (contact.getFirstName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }
    public void updateContact(Contact contact,String city,String state,String zip,String phoneNumber,String email){
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
    }
}
