package Before;

public class Main {
    public static void main(String[] args) {
        
        Add.add();

   
        while (true) {
            Menu.showMenu(); 
            byte selection = Menu.selection1(); 

            
            if (selection == 0) {
                System.out.println("Exiting application. Goodbye!");
                break; 
            }

            Choice.choice(selection); 
        }
    }
}