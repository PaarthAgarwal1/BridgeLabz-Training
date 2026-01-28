package com.addressbook.presentation;

import com.addressbook.model.Contact;
import com.addressbook.service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc=new Scanner(System.in);
        AddressBookService service=new AddressBookService();
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();


        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();


        System.out.print("Enter Address: ");
        String address = sc.nextLine();


        System.out.print("Enter City: ");
        String city = sc.nextLine();


        System.out.print("Enter State: ");
        String state = sc.nextLine();


        System.out.print("Enter Zip: ");
        String zip = sc.nextLine();


        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();


        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);

        service.addContact(contact);

        System.out.println("\nContact Added Successfully!");
        System.out.println("------Address Book------");
        service.getContacts().forEach(System.out::println);
    }
}
