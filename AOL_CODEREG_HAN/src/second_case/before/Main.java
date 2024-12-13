package second_case.before;

/**
	Project Title: Vehicle Management System
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Vehicle%20Management%20System
	
	Smells Identification:
	-> Fowler
	- Bloaters: Large class
	- Change Preventers: Divergent Change
	- Dispensables: Duplicate Code
	
	-> Girish
	- Abstraction: Incomplete Abstraction, Leaky Abstraction
*/

import java.util.Scanner;

// start mark for 'Large Class' and 'Divergent Change' smell
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();

        while (true) {
            // start mark for 'Duplicate Code' smell
            System.out.println("Vehicle Management System");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            // end mark for 'Duplicate Code' smell
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
           	    // start mark for 'Duplicate Code' and 'Incomplete Abstraction' smell
                    System.out.print("Enter make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    // end mark for 'Duplicate Code' and 'Incomplete Abstraction' smell
                    
                    Vehicle newVehicle = new Vehicle(make, model, year, price);
                    vehicleManager.addVehicle(newVehicle);
                    
                    System.out.println("Vehicle added successfully!");
                    break;
                case 2:
                    System.out.println("All Vehicles:");
                    
                    // start mark for 'Leaky Abstraction' smell
                    for (Vehicle vehicle : vehicleManager.getAllVehicles()) {
                        System.out.println(vehicle);
                    }
                    // end mark for 'Leaky Abstraction' smell
                    
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
// end mark for 'Large Class' and 'Divergent Change' smell
