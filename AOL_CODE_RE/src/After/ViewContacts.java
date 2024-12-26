package After;

import java.util.List;
import java.util.Scanner;

public class ViewContacts extends Action {
    public ViewContacts(Scanner scanner, List<Contact> contacts) {
        super(scanner, contacts);
    }

    @Override
    public void execute() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!\n");
        } else {
            System.out.println("\nContacts List:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
            System.out.println();
        }
    }
}
