package com.blp.addressbook;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class AddressBook extends AddressBookMain {
    private static final ArrayList<Contacts> list = new ArrayList<Contacts>();

    /**
     * Call method to delete contact by searching firstname in contact list
     */
    public void deleteContact() throws ConcurrentModificationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname to Delete Contact: ");
        String name = sc.nextLine();
        try {
            for (Contacts search : list) {
                if (name.equalsIgnoreCase(search.getFirstName())) {
                    System.out.println("Entered name found in the Address Book, deleting contact");
                    list.remove(search);
                } else {
                    System.out.println("Entered name not found in the Address Book");
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Exception is " + e.toString());
        }
    }

    /**
     * Call method to edit the contact by searching firstname
     */
    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname to edit contact: ");
        String name = sc.nextLine();
        for (Contacts search : list) {
            if (name.equalsIgnoreCase(search.getFirstName())) {
                System.out.println("Entered name found in the Contacts");
                System.out.println("Enter the updated first name");
                String firstName = sc.next();
                search.setFirstName(firstName);
                System.out.println("Enter the updated last name");
                String lastName = sc.next();
                search.setLastName(lastName);
                System.out.println("Enter the updated address");
                String address = sc.next();
                search.setAddress(address);
                System.out.println("Enter the updated city");
                String city = sc.next();
                search.setCity(city);
                System.out.println("Enter the updated state");
                String state = sc.next();
                search.setState(state);
                System.out.println("Enter the updated zipcode");
                int zip = sc.nextInt();
                search.setZip(zip);
                System.out.println("Enter the updated phoneNumber");
                long phoneNumber = sc.nextInt();
                search.setPhoneNumber(phoneNumber);
                System.out.println("Enter the updated emailID");
                String email = sc.next();
                search.setEmail(email);
                search.toString();
            } else {
                System.out.println("Entered name not found in the AddressBook");
            }
        }
    }

    /**
     * Call method to add the contact details.
     */
    public void addContactDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name = ");
        String firstName = sc.nextLine();
        System.out.println("Last Name = ");
        String lastName = sc.nextLine();
        System.out.println("Address = ");
        String address = sc.nextLine();
        System.out.println("City = ");
        String city = sc.nextLine();
        System.out.println("State = ");
        String state = sc.nextLine();
        System.out.println("Zip Code = ");
        int zip = sc.nextInt();
        System.out.println("Phone Number = ");
        long mobNum = sc.nextLong();
        System.out.println("Email = ");
        String email = sc.nextLine();
        Contacts person = new Contacts(firstName, lastName, address, city, state, zip, mobNum, email);
        list.add(person);
        person.toString();
    }
}
