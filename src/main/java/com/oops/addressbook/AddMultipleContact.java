package com.oops.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class AddMultipleContact {
    static ArrayList<AddressBook> personList = new ArrayList<>();
    static AddressBook person = new AddressBook();
    static Scanner sc = new Scanner(System.in);


    static int counter;

    public static void addContact() {


        System.out.println("add person details");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter person first name: ");
        person.setFirstName(sc.next());

        System.out.println("Enter person last name: ");
        person.setLastName(sc.next());

        System.out.println("Enter mobile number: ");
        person.setPhoneNum(sc.next());

        System.out.println("Enter the Email id: ");
        person.setEmail(sc.next());

        System.out.println("Enter address: ");
        person.setAddress(sc.next());

        System.out.println("Enter city: ");
        person.setCity(sc.next());

        System.out.println("Enter State name: ");
        person.setState(sc.next());

        System.out.println("Enter zip: ");
        person.setZip(sc.nextLong());

        personList.add(person);

        System.out.println("Person added");
        counter++;
    }

    public static void choices() {

        int choice = 0;
        while (choice<6) {
            /*System.out.println("Enter name of the address book you want to create");
            String name = sc.next();*/
            System.out.println("Enter ur choice \n1.Add\n2.edit\n3.delete\n4.addNoOfContactsn\n5.display\n6.addAddressBook\n7.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContcat();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    addMultipleContact();
                    break;
                case 5:
                    System.out.println("The entered person details display:");
                    System.out.println(personList.toString());
                    break;
                case 6:
                    addAddressBook();
                    break;
                case 7:
                    System.out.println("Enter correct option");
                    break;
                default:
                    System.out.println("Exit");
            }
            System.out.println("Enter 1 if you want to continue");
        }
    }

    private static void addMultipleContact() {
        System.out.println("Enter No of persons you want to add in address Book : ");
        int noOfpersons = sc.nextInt();
        for (int i = 0; i < noOfpersons; i++) {
            addContact();
        }
    }

    private static void deleteContact() {
        System.out.println("Enter the first name of the contact to be deleted: ");
        String firstName = sc.next();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getFirstName().equals(firstName)) {
                personList.remove(personList.get(i));
                System.out.println("Contact removed successfully");
            }
            else
                System.out.println("Contact not found");
        }
    }

    private static void editContcat() {
        if (counter > 0) {
            System.out.println("Enter person first name you want to edit: ");
            String searchName = sc.next();

            boolean isPersonFound = false;
            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getFirstName().equals(searchName)) {
                    isPersonFound = true;
                    System.out.println("Enter First Name: ");
                    personList.get(i).setFirstName(sc.next());

                    System.out.println("Enter Last Name: ");
                    personList.get(i).setLastName(sc.next());

                    System.out.println("Enter New Address: ");
                    personList.get(i).setAddress(sc.next());

                    System.out.println("Enter New City: ");
                    personList.get(i).setCity(sc.next());

                    System.out.println("Enter New State: ");
                    personList.get(i).setState(sc.next());

                    System.out.println("Enter New Zip: ");
                    personList.get(i).setZip(sc.nextLong());

                    System.out.println("Enter New PhoneNum: ");
                    personList.get(i).setPhoneNum(sc.next());

                    System.out.println("Enter New Email: ");
                    personList.get(i).setEmail(sc.next());

                    System.out.println("Contact Edited Successfully");
                }
            }
            if (!isPersonFound) {
                System.out.println("Contact could not be found");
            }
        }
    }
    public static void addAddressBook() {
        Dictionary address = new Hashtable();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of address Book you want: ");
        AddressBook addressBookMain = new AddressBook();
        String bookName = scanner.nextLine();
        address.put(bookName,addressBookMain);
        System.out.println("Address Book " +bookName+ " has been created.");
        choices();
    }

    public static void main(String[] args) {
        choices();
    }
}
