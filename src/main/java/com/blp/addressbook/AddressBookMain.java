package com.blp.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address book program");
        Scanner sc = new Scanner(System.in);
        System.out.println("1 . Add contact");
        System.out.println("2 . Exit");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter Contact Details");
            System.out.println("Enter firstname");
            String firstName = sc.next();
            System.out.println("Enter lastname");
            String lastName = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
            System.out.println("Enter city");
            String city = sc.next();
            System.out.println("Enter state");
            String state = sc.next();
            System.out.println("Enter zip");
            int zip = sc.nextInt();
            System.out.println("Enter mobile number");
            long mobNum = sc.nextLong();
            System.out.println("Enter email-Id");
            String emailId = sc.next();
            AddressBook contact = new AddressBook();
            contact.addContact(firstName, lastName, address, city, state, zip, mobNum, emailId);
        }
        if (choice == 2) {
            System.out.println("Program ended.");
        }
    }
}
