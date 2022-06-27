package add;

import java.util.Scanner;

class AddContactToAddBook{

    // UC_2
    //Variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private long phoneNo;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddedContact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
                + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email
                + "]";
    }

    public static void main(String[] args){

        AddContactToAddBook contact=new AddContactToAddBook();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Name : ");
        contact.setFirstName(sc.next());
        System.out.println("Enter Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter City : ");
        contact.setCity(sc.next());
        System.out.println("Enter state : ");
        contact.setState(sc.next());
        System.out.println("Enter zip : ");
        contact.setZip(sc.next());
        System.out.println("Enter Phone No : ");
        contact.setPhoneNo(sc.nextLong());
        System.out.println("Enter Email : ");
        contact.setEmail(sc.next());
        System.out.println(contact.toString());

    }

}
