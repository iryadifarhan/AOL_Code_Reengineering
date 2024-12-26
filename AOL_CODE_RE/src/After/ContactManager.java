package After;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class to handle the menu and actions
public class ContactManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add New Contact");
            System.out.println("2. Edit Existing Contact");
            System.out.println("3. Delete a Contact");
            System.out.println("4. View All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.\n");
                continue;
            }

            Action action;
            switch (choice) {
                case 1:
                    action = new AddContact(scanner, contacts);
                    break;
                case 2:
                    action = new EditContact(scanner, contacts);
                    break;
                case 3:
                    action = new DeleteContact(scanner, contacts);
                    break;
                case 4:
                    action = new ViewContacts(scanner, contacts);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    continue;
            }
            action.execute();
        }
    }
}
