package After;

import java.util.Scanner;

class Menu {
    public static void showMenu() {
        System.out.println("\n1. Add New Contact");
        System.out.println("2. Edit Existing Contact");
        System.out.println("3. Delete a Contact");
        System.out.println("4. View Contacts");
        System.out.println("0. Exit");
    }

    public static byte getSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return scanner.nextByte();
    }
}