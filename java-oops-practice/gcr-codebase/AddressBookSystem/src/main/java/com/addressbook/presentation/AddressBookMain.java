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
        AddressBookDirectoryService directoryService=new AddressBookDirectoryService();
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        directoryService.createAddressBook(name);
        directoryService.createAddressBook(name);//return it already exists
    }
}
