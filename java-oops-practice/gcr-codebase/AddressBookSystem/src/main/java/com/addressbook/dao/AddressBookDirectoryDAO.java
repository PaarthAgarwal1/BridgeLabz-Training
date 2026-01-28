package com.addressbook.dao;

import com.addressbook.model.AddressBook;
import com.addressbook.model.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookDirectoryDAO {
    private Map<String , AddressBook> addressBookMap=new HashMap<>();

    public boolean addAddressBook(String name){
        if(addressBookMap.containsKey(name)){
            return false;
        }
        addressBookMap.put(name,new AddressBook(name));
        return true;
    }
    public AddressBook getAddressBook(String name){
        return addressBookMap.get(name);
    }

    public Map<String,AddressBook> getAllAddressBooks(){
        return addressBookMap;
    }

    public List<Contact> searchByCity(String city){
        List<Contact> result = new ArrayList<>();
        for(AddressBook addressBook:addressBookMap.values()){
            for(Contact contact:addressBook.getContacts()){
                if(contact.getCity().equalsIgnoreCase(city)){
                    result.add(contact);
                }
            }
        }
        return result;
    }
    public List<Contact> searchByState(String state){
        List<Contact> result = new ArrayList<>();
        for(AddressBook addressBook:addressBookMap.values()){
            for(Contact contact:addressBook.getContacts()){
                if(contact.getState().equalsIgnoreCase(state)){
                    result.add(contact);
                }
            }
        }
        return result;
    }
}
