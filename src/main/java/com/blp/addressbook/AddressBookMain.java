package com.blp.addressbook;

import java.util.Scanner;

/**
 * Address BooK Program.
 */
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address book program");
        AddressBook contact = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 . Add contact");
        System.out.println("2 . Edit contact");
        System.out.println("3. delete contact");
        System.out.println("4 . Exit");
        int choice = sc.nextInt();
        while (choice >= 1) {
            switch (choice) {
                case 1:
                    if (choice == 1) {
                        contact.addContactDetails();
                    }
                    break;
                case 2:
                    if (choice == 2) {
                        contact.editContact();
                    }
                    break;
                case 3:
                    if (choice == 3) {
                        contact.deleteContact();
                    }
                    break;
                case 4:
                    if (choice == 4) {
                        System.out.println("Exit program");
                    }
                    break;
            }
            System.out.println("1 . Add contact");
            System.out.println("2 . Edit contact");
            System.out.println("3. delete contact");
            System.out.println("4 . Exit");
            choice = sc.nextInt();
        }
    }
}