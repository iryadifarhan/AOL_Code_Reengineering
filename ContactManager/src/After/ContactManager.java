package After;

import java.util.ArrayList;
import java.util.List;

class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    public void initializeContacts() {
        contacts.add(new Contact("Redowan Tanvir Shifat", "01845008660"));
        contacts.add(new Contact("Asadullah Imran", "01633356249"));
        contacts.add(new Contact("Tawfik Rahman", "01962184533"));
    }

    public void addContact(String name, String number) {
        contacts.add(new Contact(name, number));
        System.out.println("Contact added successfully.");
    }

    public boolean editContact(String number, byte choice, String newValue) {
        for (Contact contact : contacts) {
            if (contact.getNumber().equals(number)) {
                if (choice == 1) {
                    contact.setName(newValue);
                } else if (choice == 2) {
                    contact.setNumber(newValue);
                }
                System.out.println("Contact edited successfully.");
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String identifier) {
        return contacts.removeIf(contact -> contact.getName().equals(identifier) || contact.getNumber().equals(identifier));
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contacts) {
                System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
            }
        }
    }
}