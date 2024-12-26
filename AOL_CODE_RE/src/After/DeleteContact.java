package After;

import java.util.List;
import java.util.Scanner;

public class DeleteContact extends Action {
    public DeleteContact(Scanner scanner, List<Contact> contacts) {
        super(scanner, contacts);
    }

    @Override
    public void execute() {
        System.out.print("Enter the name of the contact to delete: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println("Contact Deleted Successfully\n");
                return;
            }
        }
        System.out.println("Contact not found!\n");
    }
}