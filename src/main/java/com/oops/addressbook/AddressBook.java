package com.oops.addressbook;

public class AddressBook {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.setFirstName("Dubyala");

        addressBook.setLastName("Sandeep");
        addressBook.setAddress("Regonda");
        addressBook.setCity("Warangal");
        addressBook.setState("Telangana");
        addressBook.setZip(506348);
        addressBook.setPhoneNum("8466905807");
        addressBook.setEmail("svarma852@gmail.com");
        System.out.println(addressBook.toString());
    }
    private String firstName;

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
}
