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


        System.out.print("Enter First Name to Edit: ");
        String name = sc.nextLine();


        System.out.print("New City: ");
        String newCity = sc.nextLine();


        System.out.print("New State: ");
        String newState = sc.nextLine();


        System.out.print("New Zip: ");
        String newZip = sc.nextLine();


        System.out.print("New Phone: ");
        String newPhone = sc.nextLine();


        System.out.print("New Email: ");
        String newEmail = sc.nextLine();


        boolean updated = service.editContact(name, newCity,newState,newZip,newPhone,newEmail);


        if (updated) {
            System.out.println("Contact Updated Successfully");
            service.getContacts().forEach(System.out::println);
        } else {
            System.out.println("Contact Not Found");
        }
    }
}
