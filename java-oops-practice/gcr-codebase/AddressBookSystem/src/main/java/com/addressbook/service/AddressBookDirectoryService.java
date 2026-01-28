package com.addressbook.service;

import com.addressbook.dao.AddressBookDirectoryDAO;
import com.addressbook.model.AddressBook;

public class AddressBookDirectoryService {
    private AddressBookDirectoryDAO dao=new AddressBookDirectoryDAO();

    public void createAddressBook(String name){
        boolean created=dao.addAddressBook(name);
        if (created){
            System.out.println("Address Book '"+name+"' created successfully");
        }else{
            System.out.println("Address Book already exists");
        }
    }
    public AddressBook getAddressBook(String name){
        return dao.getAddressBook(name);
    }

}
