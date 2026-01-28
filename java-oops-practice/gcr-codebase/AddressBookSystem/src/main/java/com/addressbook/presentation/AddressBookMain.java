package com.addressbook.presentation;

import com.addressbook.model.Contact;
import com.addressbook.service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc=new Scanner(System.in);
        AddressBookService service=new AddressBookService();
        service.addContact(new Contact(
                "Rahul", "Sharma", "Delhi", "Delhi","Delhi",
                "110001", "9999999999", "rahul@gmail.com"
        ));
        service.addContact(new Contact(
                "Amit", "Verma", "Noida", "UP","UP",
                "201301", "8888888888", "amit@gmail.com"
        ));
        System.out.println("\n--- All Contacts ---");
        service.displayAllContact();
    }
}
