package com.addressbook.model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private String name;
    private List<Contact> contacts;
    public AddressBook(String name){
        this.name=name;
        this.contacts=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public List<Contact> getContacts(){
        return contacts;
    }
}
