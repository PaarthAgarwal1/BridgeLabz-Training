package com.addressbook.service;

import com.addressbook.dao.AddressBookDAO;
import com.addressbook.model.Contact;

import java.util.Comparator;
import java.util.List;

public class SortService {
    private AddressBookDAO dao;
    public SortService(AddressBookDAO dao){
        this.dao=dao;
    }
    public void sortByName(){
        List<Contact> contacts=dao.getAllContacts();
        if(contacts.isEmpty()){
            System.out.println("Address Book is empty");
            return;
        }
        contacts.sort(Comparator.comparing(Contact::getFirstName).thenComparing(Contact::getLastName));
        System.out.println("Contacts sorted by name");
        contacts.forEach(System.out::println);
    }
    public void sortByField(int choice){
        List<Contact> contacts=dao.getAllContacts();
        if(contacts.isEmpty()){
            System.out.println("Address Book is empty");
            return;
        }
        switch (choice){
            case 1:
                contacts.sort(Comparator.comparing(Contact::getCity));
                System.out.println("Contacts sorted by City : ");
                break;
            case 2:
                contacts.sort(Comparator.comparing(Contact::getState));
                System.out.println("Contacts sorted by State : ");
                break;
            case 3:
                contacts.sort(Comparator.comparing(Contact::getZip));
                System.out.println("Contacts sorted by Zip : ");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        contacts.forEach(System.out::println);
    }
}
