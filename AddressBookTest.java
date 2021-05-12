package apistream;

import java.util.Scanner;

public class AddressBookTest {

    public static void main(String[] args) {
        System.out.println("*....Welcome to my Address Book World....*");

        String input;
        Scanner in = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        boolean stop = false;
        do {
            System.out.println("\nMain Menu\n");
            System.out.println("1. Add An Entry\n");
            System.out.println("2. Delete An Entry\n");
            System.out.println("3. View All Entries\n");
            System.out.println("4. Update An Entry\n");
            System.out.println("5. Exit\n");
            System.out.print("Please Enter Choice from 1 to 5: ");
            input = (in.next());


            switch (input) {
                case "1":
                    //create a new entry for the addressbook
                    AddressBookEntry entry = new AddressBookEntry();

                    System.out.println("*->:Adding Entry in Address Book:<-*");

                    System.out.println("First Name: ");
                    entry.setFname(in.next());

                    System.out.println("Last Name: ");
                    entry.setLname(in.next());

                    System.out.println("Address: ");
                    entry.setAddress(in.next());

                    System.out.println("City: ");
                    entry.setCity(in.next());

                    System.out.println("State: ");
                    entry.setState(in.next());

                    System.out.println("ZipCode: ");
                    entry.setZipCode(in.next());

                    System.out.println("Mobile: ");
                    entry.setMobile(in.next());

                    System.out.println("Email: ");
                    entry.setEmail(in.next());

                    System.out.println("Address Book Name: ");
                    entry.setAddress_Book_Name(in.next());

                    //add our new entry to the address Book
                    addressBook.add(entry);

                    System.out.println("\n\nAdded a New Entry.");
                    break;

                case "2":
                    System.out.println("Enter the index of the Entry, which you wand To Delete: ");
                    //delete the entry at the given index
                    addressBook.delete(in.nextInt());

                    break;

                case "3":
                    System.out.println("Your addressbook contains the following entries: ");
                    //get array of all entries
                     addressBook.viewAll();

                    break;

                case "4":
                    System.out.println("Enter the index of the entry, which you want to update: ");
                    //get entry at the given index
                    AddressBookEntry entryToUpdate =  addressBook.get(in.nextInt());

                    System.out.println("First Name (current: " + entryToUpdate.getFname() + "):");
                    entryToUpdate.setFname(in.next());

                    System.out.println("Last Name (current: " + entryToUpdate.getLname() + "):");
                    entryToUpdate.setLname(in.next());

                    System.out.println("Address (current: " + entryToUpdate.getAddress() + "):");
                    entryToUpdate.setAddress(in.next());

                    System.out.println("City (current: " + entryToUpdate.getCity() + "):");
                    entryToUpdate.setCity(in.next());

                    System.out.println("State (current: " + entryToUpdate.getState() + "):");
                    entryToUpdate.setState(in.next());

                    System.out.println("Zip Code (current: " + entryToUpdate.getZipCode() + "):");
                    entryToUpdate.setZipCode(in.next());

                    System.out.println("Mobile Number (current: " + entryToUpdate.getMobile() + "):");
                    entryToUpdate.setMobile(in.next());

                    System.out.println("Email (current: " + entryToUpdate.getEmail() + "):");
                    entryToUpdate.setEmail(in.next());

                    System.out.println("Address Book Name (current: " + entryToUpdate.getAddress_Book_Name() + "):");
                    entryToUpdate.setAddress_Book_Name(in.next());

                    break;

                default:
                    break;
            }
            //execute while Stop is False
        }      while (!input.equals("5"));
        System.out.println("***Thank You Ji :)***");
    }
}
