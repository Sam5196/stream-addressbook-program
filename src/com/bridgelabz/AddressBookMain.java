package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book system");
        Contacts newContact = new Contacts();
        newContact.setFirstName("Sammed\n");
        newContact.setLastName("Pachore \n");
        newContact.setAddress("Sangli City \n");
        newContact.setCity("Sangli \n");
        newContact.setState("Maharashtra \n");
        newContact.setZip(416416);
        newContact.setEmail("sammedpachore1008@gmail.com \n");
        newContact.setPhoneNumber(1234567890);
        System.out.println("The Contact is : \n" + newContact);

        AddressBook addressBook = new AddressBook();
        addressBook.operation();

    }
}
