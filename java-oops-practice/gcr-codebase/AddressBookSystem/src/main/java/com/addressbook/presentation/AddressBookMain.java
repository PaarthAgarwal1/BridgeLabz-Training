package com.addressbook.presentation;

import com.addressbook.dao.*;
import com.addressbook.model.Contact;
import com.addressbook.service.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        AddressBookDirectoryDAO directoryDAO = new AddressBookDirectoryDAO();
        AddressBookDirectoryService directoryService =
                new AddressBookDirectoryService(directoryDAO);

        directoryService.createAddressBook("Personal");

        AddressBookDAO addressBookDAO =
                new AddressBookDAO(directoryService.getAddressBook("Personal").getContacts());

        AddressBookFileDAO fileDAO = new AddressBookFileDAO();

        AddressBookService service =
                new AddressBookService(directoryDAO, addressBookDAO, fileDAO);

        SortService sortService = new SortService(addressBookDAO);

        while (true) {
            System.out.println("\n1.Add Contact\n2.Edit\n3.Delete\n4.Display\n5.Sort by Name\n6.Write to File\n7.Read from File\n8.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    System.out.print("Enter State: ");
                    String state = sc.nextLine();
                    System.out.print("Enter Zip: ");
                    String zip = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Contact contact = new Contact(fn, ln, address, city, state, zip, phone, email);
                    service.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter Name to Edit: ");
                    String name = sc.nextLine();
                    service.editContact(name, "NewCity", "NewState", "000000", "1111111111", "new@mail.com");
                    break;

                case 3:
                    System.out.print("Enter Name to Delete: ");
                    service.deleteContact(sc.nextLine());
                    break;

                case 4:
                    service.displayAllContact();
                    break;

                case 5:
                    sortService.sortByName();
                    break;

                case 6:
                    service.writeContactsToFile();
                    break;

                case 7:
                    service.readContactsFormFile();
                    break;

                case 8:
                    return;
            }
        }
    }
}
