package com.oops.addressbook;

import java.util.Scanner;

public class AddressBook {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private double zip;
    private String phoneNum;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getZip() {
        return zip;
    }

    public void setZip(double zip) {
        this.zip = zip;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        addressBook.setFirstName(sc.next());
        System.out.println("Enter Second Name : ");
        addressBook.setLastName(sc.next());
        System.out.println("Enter Address : ");
        addressBook.setAddress(sc.next());
        System.out.println("Enter City : ");
        addressBook.setCity(sc.next());
        System.out.println("Enter State : ");
        addressBook.setState(sc.next());
        System.out.println("Enter Zip : ");
        addressBook.setZip(sc.nextDouble());
        System.out.println("Enter Phone Number : ");
        addressBook.setPhoneNum(sc.next());
        System.out.println("Enter Email : ");
        addressBook.setEmail(sc.next());
        System.out.println(addressBook.toString());
    }

}
