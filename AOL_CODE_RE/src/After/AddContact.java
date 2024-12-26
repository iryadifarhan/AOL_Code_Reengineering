package After;

import java.util.List;
import java.util.Scanner;

public class AddContact extends Action {
    public AddContact(Scanner scanner, List<Contact> contacts) {
        super(scanner, contacts);
    }

    @Override
    public void execute() {
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        String number = scanner.nextLine();
        contacts.add(new Contact(name, number));
        System.out.println("Contact Added Successfully\n");
    }
}
