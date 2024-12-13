package second_case.after;

/**
	Project Title: Vehicle Management System
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Vehicle%20Management%20System
	
	Smells Fixing:
	-> Fowler
	- Bloaters: Large class => fixed with extract class 'UI_Handler'
	- Change Preventers: Divergent Change => fixed with extract class 'UI_Handler'
	- Dispensables: Duplicate Code => fixed with extract method into class 'UI_Handler'
	
	-> Girish
	- Abstraction: 
		Incomplete Abstraction => fixed with implementing validation process into utility class 'InputValidator'
		Leaky Abstraction => fixed with implementing prototype (clone) design pattern into class 'VehicleManager'
*/

public class Main {
    public static void main(String[] args) {
        UI_Handler uiHandler = new UI_Handler();
        VehicleManager vehicleManager = new VehicleManager();

        while (true) {
        	uiHandler.displayMainMenu();
            int choice = uiHandler.getValidatedIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    String make = uiHandler.getValidatedStringInput("Enter make: ");
                    String model = uiHandler.getValidatedStringInput("Enter model: ");
                    int year = uiHandler.getValidatedIntInput("Enter year: ");
                    double price = uiHandler.getValidatedDoubleInput("Enter price: ");
                    
                    vehicleManager.addVehicle(new Vehicle(make, model, year, price));
                    uiHandler.displayMessage("Vehicle added successfully!");
                    break;
                case 2:
                    uiHandler.displayAllVehicles(vehicleManager.getClonedVehicles());
                    break;
                case 3:
                    uiHandler.displayMessage("Exiting...");
                    System.exit(0);
                default:
                	uiHandler.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}