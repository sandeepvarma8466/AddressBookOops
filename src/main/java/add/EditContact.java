package add;

import java.util.ArrayList;
import java.util.Scanner;

public class EditContact {
    static ArrayList<AddContactToAddBook> personList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int counter;

    public static void addContact() {
        AddContactToAddBook person = new AddContactToAddBook();

        System.out.println("add person details");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter person first name: ");
        person.setFirstName(sc.next());

        System.out.println("Enter person last name: ");
        person.setLastName(sc.next());

        System.out.println("Enter mobile number: ");
        person.setPhoneNo(sc.nextLong());

        System.out.println("Enter the Email id: ");
        person.setEmail(sc.next());

        System.out.println("Enter address: ");
        person.setAddress(sc.next());

        System.out.println("Enter city: ");
        person.setCity(sc.next());

        System.out.println("Enter State name: ");
        person.setState(sc.next());

        System.out.println("Enter zip: ");
        person.setZip(sc.next());

        personList.add(person);

        System.out.println("Person added");
        counter++;
    }
    static void editContact() {

        if (counter > 0) {
            System.out.println("Enter Persons First Name you want to edit: ");
            String searchName = sc.next();

            int indexOfPerson = 0;
            boolean isFoundPerson = false;

            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getFirstName().equals(searchName)) {
                    isFoundPerson = true;
                    indexOfPerson = i;
                    break;
                }
            }
            if (isFoundPerson) {

                System.out.print("\nEnter new address: ");
                personList.get(indexOfPerson).setAddress(sc.next());

                System.out.println("Enter new city  ");
                personList.get(indexOfPerson).setCity(sc.next());

                System.out.println("Enter new zip: ");
                personList.get(indexOfPerson).setZip(sc.next());

                System.out.println("Enter mobile number: ");
                personList.get(indexOfPerson).setPhoneNo(Long.parseLong(sc.next()));

                System.out.println("Enter the Email id: ");
                personList.get(indexOfPerson).setEmail(sc.next());

                personList.get(indexOfPerson).setFirstName(searchName);

                System.out.println("Enter Last Name: ");
                personList.get(indexOfPerson).setLastName(sc.next());

                System.out.println();
                System.out.println("Edit completed");

            } else
                System.out.println("No person found with this searchName");
        } else
            System.out.println("There is no record to edit");
    }
    static void choices() {

        int choice = 0;
        while (choice < 4) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur choice 1: Add \n 2: Edit \n 3: Display Details \n 0: Exit ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    System.out.println("The entered person details is as follows: ");
                    System.out.println(personList.toString());
                    break;
                default:
                    System.out.println("Enter number from 1 to 3");
                    choice = 4;
            }
        }

    }

    public static void main(String[] args) {
        choices();
    }
}
