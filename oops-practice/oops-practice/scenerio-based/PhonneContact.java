import java.util.*;

// Custom exception for invalid phone number
class PhonneNumber extends Exception {
    InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Contact class (one contact = name + phone)
class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class PhoneContactOrganizer {

    static List<Contact> contactList = new ArrayList<>();

    // Method to add contact
    static void addContact(String name, String phone)
            throws InvalidPhoneNumberException {

        // Phone number validation
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException(
                "Phone number must be exactly 10 digits");
        }

        // Duplicate phone number check
        for (Contact c : contactList) {
            if (c.phone.equals(phone)) {
                System.out.println("Contact already exists");
                return;
            }
        }

        contactList.add(new Contact(name, phone));
        System.out.println("Contact added successfully");
    }

    // Method to search contact
    static void searchContact(String name) {
        for (Contact c : contactList) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println(c.name + " : " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void main(String[] args) {
        try {
            addContact("Rahul", "9876543210");
            addContact("Anita", "9123456789");
            searchContact("Rahul");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
