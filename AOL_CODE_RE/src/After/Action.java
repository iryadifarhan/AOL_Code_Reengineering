package After;

import java.util.List;
import java.util.Scanner;

abstract class Action {
    protected Scanner scanner;
    protected List<Contact> contacts;

    public Action(Scanner scanner, List<Contact> contacts) {
        this.scanner = scanner;
        this.contacts = contacts;
    }

    public abstract void execute();
}