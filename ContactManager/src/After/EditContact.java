package After;

import java.util.List;
import java.util.Scanner;

public class EditContact extends Action {
    public EditContact(Scanner scanner, List<Contact> contacts) {
        super(scanner, contacts);
    }

    @Override
    public void execute() {
        System.out.print("Enter the name of the contact to edit: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new name: ");
                contact.setName(scanner.nextLine());
                System.out.print("Enter new mobile number: ");
                contact.setNumber(scanner.nextLine());
                System.out.println("Contact Updated Successfully\n");
                return;
            }
        }
        System.out.println("Contact not found!\n");
    }
}