package com.addressbook.service;

import com.addressbook.dao.AddressBookDirectoryDAO;
import com.addressbook.model.AddressBook;
import com.addressbook.model.Contact;

import java.util.List;

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

    public void searchPersonByCity(String city){
        List<Contact> contacts=dao.searchByCity(city);
        if(contacts.isEmpty()){
            System.out.println("No person found in city : "+city);
            return;
        }
        System.out.println("Person in city "+city+" : ");
        contacts.forEach(System.out::println);
    }
    public void searchPersonByState(String state){
        List<Contact> contacts=dao.searchByState(state);
        if(contacts.isEmpty()){
            System.out.println("No person found in state : "+state);
            return;
        }
        System.out.println("Person in state "+state+" : ");
        contacts.forEach(System.out::println);
    }
    public void viewPersonByCity(String city){
        List<Contact> list=dao.getPersonByCity(city);
        if(list.isEmpty()){
            System.out.println("No person found in city : "+city);
            return;
        }
        list.forEach(System.out::println);
    }
    public void viewPersonByState(String state){
        List<Contact> list=dao.getPersonByState(state);
        if(list.isEmpty()){
            System.out.println("No person found in state : "+state);
            return;
        }
        list.forEach(System.out::println);
    }

}
