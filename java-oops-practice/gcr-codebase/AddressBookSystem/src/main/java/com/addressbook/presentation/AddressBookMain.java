package com.addressbook.presentation;

import com.addressbook.dao.AddressBookDirectoryDAO;
import com.addressbook.model.Contact;
import com.addressbook.service.AddressBookDirectoryService;
import com.addressbook.service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        AddressBookService service=new AddressBookService();
        Contact c1 = new Contact(
                "Rahul", "Sharma", "Delhi", "Delhi","Delhi",
                "110001", "9999999999", "rahul@gmail.com"
        );


        Contact c2 = new Contact(
                "Rahul", "Sharma", "Noida", "UP","Up",
                "201301", "8888888888", "rahul2@gmail.com"
        );


        service.addContact(c1);
        service.addContact(c2); //Duplicate 
    }
}
