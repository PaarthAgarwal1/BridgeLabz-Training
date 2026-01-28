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
}
