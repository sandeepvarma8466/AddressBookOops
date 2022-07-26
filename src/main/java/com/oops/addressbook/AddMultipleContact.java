package com.oops.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

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

        boolean duplicate = AddMultipleContact.checkDuplicateName(person.getFirstName(), person.getLastName());
        if (duplicate == false) {
            personList.add(person);
            System.out.println("Person added");
            counter++;
        } else {
            System.out.println("Name already exist");
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
            } else
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
        address.put(bookName, addressBookMain);
        System.out.println("Address Book " + bookName + " has been created.");
        choices();
    }

    public static boolean checkDuplicateName(String firstName, String lastName) {
        boolean duplicate = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getFirstName().equals(firstName) && personList.get(i).getLastName().equals(lastName)) {
                duplicate = true;
            }
        }
        return duplicate;
    }

    public static void searchPersonByState(String state) {
        System.out.println("\nEnter the state name to display details :- ");
        ArrayList<AddressBook> list = (ArrayList<AddressBook>) personList.stream().filter(contactName -> contactName
                .getState().equals((state))).collect(Collectors.toList());
        for (AddressBook contact : list) {
            System.out.println("First Name: " + contact.getFirstName() + "Last Name: " + contact.getLastName());
        }
    }

    public static void searchPersonByCity(String city) {
        ArrayList<AddressBook> list = (ArrayList<AddressBook>) personList.stream().filter(contactName -> contactName
                .getCity().equals((city))).collect(Collectors.toList());
        for (AddressBook contact : list) {
            System.out.println("First Name: " + contact.getFirstName() + "Last Name: " + contact.getLastName());
        }
    }

    public static void viewPersonByState(String state) {
        ArrayList<AddressBook> list = (ArrayList<AddressBook>) personList.stream().filter(contactName ->
                        contactName.getState().equals(state)).collect(Collectors.toList());
        for (AddressBook contact : list) {
            System.out.println("Name: " + contact.getFirstName() +" "+ contact.getLastName());
            System.out.println("State: " + state);
        }
    }
    public static void viewPersonByCity(String city) {
        ArrayList<AddressBook> list = (ArrayList<AddressBook>) personList.stream().filter(contactName ->
                contactName.getCity().equals(city)).collect(Collectors.toList());
        for (AddressBook contact : list) {
            System.out.println("Name: " + contact.getFirstName() +" "+ contact.getLastName());
            System.out.println("City: " + city);
        }
    }

    public int countPersonsByState(String state) {
        int count= 0;
        ArrayList<AddressBook> list = (ArrayList<AddressBook>)personList.stream().filter(contactName ->
                        contactName.getState().equals(state)).collect(Collectors.toList());
        for (AddressBook contact : list) {
            System.out.println("Name: " + contact.getFirstName()+ "  " + contact.getLastName());
            count ++;
        }
        return count;
    }

    public int countPersonsByCity(String city) {
        int count = 0 ;
        ArrayList<AddressBook> list = (ArrayList<AddressBook>) personList.stream().filter(contactName
                        -> contactName.getCity().equals(city)).collect(Collectors.toList());
        for (AddressBook contact : list) {
            System.out.println("Name: " + contact.getFirstName()+ "  " + contact.getLastName());
            count +=1;
        }
        return count;
    }

    public static void choices() {
        AddMultipleContact contact = new AddMultipleContact();

        int choice = 0;
        while (choice < 14) {
            /*System.out.println("Enter name of the address book you want to create");
            String name = sc.next();*/
            System.out.println("Enter ur choice \n1.Add\n2.edit\n3.delete\n4.addNoOfContactsn\n5.display" +
                    "\n6.display details by using state\n7.dispaly details by using city\n8.view person by state" +
                    "\n9.view person by city\n10.count person by city\n11.count person by state" +
                    "\n12.addAddressBook\n13.Exit");
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
                    System.out.println("\nEnter the state name to display details :- ");
                    String state = sc.next();
                    searchPersonByState(state);
                    break;
                case 6:
                    System.out.println("\nEnter the city name to display details :- ");
                    String city = sc.next();
                    searchPersonByCity(city);
                    break;
                case 7:
                    System.out.println("The entered person details display:");
                    System.out.println(personList.toString());
                    break;
                case 8:
                    System.out.println("\nEnter the state name :- ");
                    String state1 = sc.next();
                    viewPersonByState(state1);
                    break;
                case 9:
                    System.out.println("Enter the city name :- ");
                    String city1 = sc.next();
                    viewPersonByCity(city1);
                    break;
                case 10:
                    System.out.println("\nEnter the city name to find person in city :- ");
                    String city3 = sc.next();
                    int count = contact.countPersonsByCity(city3);
                    System.out.println("Number of persons by city "+city3+" is "+count);
                    break;
                case 11:
                    System.out.println("\nEnter the state name to find person in state  :- ");
                    String state3 = sc.next();
                    int count1 = contact.countPersonsByState(state3);
                    System.out.println("Number of persons by state "+state3+" is "+count1);
                    break;
                case 12:
                    addAddressBook();
                    break;
                case 13:
                    System.out.println("Enter correct option");
                    break;
                default:
                    System.out.println("Exit");
            }
            System.out.println("Enter 1 if you want to continue");
        }
    }

    public static void main(String[] args) {
        choices();
    }
}
