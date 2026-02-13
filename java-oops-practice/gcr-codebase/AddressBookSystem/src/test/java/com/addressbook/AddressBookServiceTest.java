package com.addressbook;

import com.addressbook.dao.AddressBookDAO;
import com.addressbook.dao.AddressBookDirectoryDAO;
import com.addressbook.dao.AddressBookFileDAO;
import com.addressbook.model.Contact;
import com.addressbook.service.AddressBookService;
import com.addressbook.service.SortService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookServiceTest {

    private AddressBookService service;
    private AddressBookDAO dao;

    @BeforeEach
    void setUp() {
        dao = new AddressBookDAO(new ArrayList<>());
        AddressBookDirectoryDAO directoryDAO = new AddressBookDirectoryDAO();
        AddressBookFileDAO fileDAO = new AddressBookFileDAO();
        service = new AddressBookService(directoryDAO, dao, fileDAO);
    }

    @Test
    void testAddContact() {
        Contact contact = new Contact(
                "Rahul", "Sharma", "Delhi",
                "Delhi", "Delhi", "110001",
                "9999999999", "rahul@gmail.com"
        );

        service.addContact(contact);

        assertEquals(1, service.getContacts().size());
    }

    @Test
    void testDuplicateContact() {
        Contact contact1 = new Contact(
                "Rahul", "Sharma", "Delhi",
                "Delhi", "Delhi", "110001",
                "9999999999", "rahul@gmail.com"
        );

        Contact contact2 = new Contact(
                "Rahul", "Sharma", "Delhi",
                "Delhi", "Delhi", "110001",
                "9999999999", "rahul@gmail.com"
        );

        service.addContact(contact1);
        service.addContact(contact2);

        assertEquals(1, service.getContacts().size());
    }

    @Test
    void testEditContact() {
        Contact contact = new Contact(
                "Amit", "Verma", "Delhi",
                "Delhi", "Delhi", "110001",
                "8888888888", "amit@gmail.com"
        );

        service.addContact(contact);

        boolean updated = service.editContact(
                "Amit", "Noida", "UP",
                "201301", "7777777777", "new@gmail.com"
        );

        assertTrue(updated);
        assertEquals("Noida", dao.getAllContacts().get(0).getCity());
    }

    @Test
    void testDeleteContact() {
        Contact contact = new Contact(
                "Neha", "Gupta", "Pune",
                "Pune", "MH", "411001",
                "5555555555", "neha@gmail.com"
        );

        service.addContact(contact);
        boolean deleted = service.deleteContact("Neha");

        assertTrue(deleted);
        assertEquals(0, service.getContacts().size());
    }

    @Test
    void testSortByName() {
        service.addContact(new Contact(
                "Zara", "Ali", "Delhi",
                "Delhi", "Delhi", "110001",
                "9999999999", "zara@gmail.com"
        ));

        service.addContact(new Contact(
                "Aman", "Singh", "Mumbai",
                "Mumbai", "MH", "400001",
                "8888888888", "aman@gmail.com"
        ));

        SortService sortService = new SortService(dao);
        sortService.sortByName();

        assertEquals("Aman", dao.getAllContacts().get(0).getFirstName());
    }
}
