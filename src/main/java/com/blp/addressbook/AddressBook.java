package com.blp.addressbook;

public class AddressBook {

    /**
     * Call method to add the contact details.
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param mobNum
     * @param emailId
     */
    public void addContact(String firstName, String lastName, String address, String city, String state, int zip, long mobNum, String emailId) {
        System.out.println("First name = " + firstName);
        System.out.println("Last name = " + lastName);
        System.out.println("Address = " + address);
        System.out.println("City = " + city);
        System.out.println("State = " + state);
        System.out.println("Zip = " + zip);
        System.out.println("Mobile Number = " + mobNum);
        System.out.println("Email-Id = " + emailId);
    }
}

