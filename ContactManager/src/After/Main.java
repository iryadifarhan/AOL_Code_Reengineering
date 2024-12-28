package After;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.initializeContacts();

        while (true) {
            Menu.showMenu();
            byte choice = Menu.getSelection();

            Scanner input = new Scanner(System.in);
            switch (choice) {
                case 1: // Add Contact
                    System.out.print("Enter Name: ");
                    String name = input.nextLine();
                    System.out.print("Enter Number: ");
                    String number = input.nextLine();
                    contactManager.addContact(name, number);
                    break;

                case 2: // Edit Contact
                    System.out.print("Enter the number of the contact to edit: ");
                    String editNumber = input.nextLine();
                    System.out.println("1. Update Name\n2. Update Number");
                    byte editChoice = input.nextByte();
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new value: ");
                    String newValue = input.nextLine();
                    if (!contactManager.editContact(editNumber, editChoice, newValue)) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3: // Delete Contact
                    System.out.print("Enter Name or Number of the contact to delete: ");
                    String identifier = input.nextLine();
                    if (contactManager.deleteContact(identifier)) {
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: // View Contacts
                    contactManager.viewContacts();
                    break;

                case 0: // Exit
                    System.out.println("Exiting application. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}