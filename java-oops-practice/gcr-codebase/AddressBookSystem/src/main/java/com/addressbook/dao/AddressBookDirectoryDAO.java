package com.addressbook.dao;

import com.addressbook.model.AddressBook;

import java.util.HashMap;
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
}
