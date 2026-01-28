package com.addressbook.dao;

import com.addressbook.model.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBookDAO {
    private List<Contact> contactList;
    public AddressBookDAO(List<Contact> contacts){
        this.contactList=contacts;
    }
    public boolean addContact(Contact contact){
        if(contactList.contains(contact)){
            return false;
        }
        contactList.add(contact);
        return true;
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
    public boolean deleteContact(String name){
        Iterator<Contact> iterator=contactList.iterator();
        while (iterator.hasNext()){
            Contact contact=iterator.next();
            if(contact.getFirstName().equalsIgnoreCase(name)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
