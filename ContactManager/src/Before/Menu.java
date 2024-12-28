package Before;


import java.util.Scanner;
public class Menu {
    public static void showMenu() {
        System.out.println(
                "1. Add New Contact\n" +
                "2. Edit Existing Contact\n" +
                "3. Delete a Contact\n" +
                "4. View Contacts\n" + 
                "0. Exit" 
        );
    }

    public static byte selection1() {
        Scanner selection1 = new Scanner(System.in);
        return selection1.nextByte(); 
    }
}
