package second_case.after;

import java.util.List;
import java.util.Scanner;

public class UI_Handler {
	private Scanner scanner;
	
	public UI_Handler() {
		this.scanner = new Scanner(System.in);
	}

	public void displayMainMenu() {
		System.out.println("Vehicle Management System\n"
				+ "1. Add Vehicle\n"
				+ "2. View Vehicles\n"
				+ "3. Exit");
	}
	
	public void displayMessage(String text) {
		System.out.println(text);
	}

	public void displayAllVehicles(List<Vehicle> vehicleLists) {
		System.out.println("All Vehicles:");
		for (Vehicle vehicle : vehicleLists) {
			VehicleFormatter.setVehicle(vehicle);
            System.out.println(VehicleFormatter.formatToString());
        }
	}
	
	public int getValidatedIntInput(String promptText) {
		return InputValidator.getIntInput(this.scanner, promptText);
	}
	
	public double getValidatedDoubleInput(String promptText) {
		return InputValidator.getDoubleInput(this.scanner, promptText);
	}
	
	public String getValidatedStringInput(String promptText) {
		return InputValidator.getStringInput(this.scanner, promptText);
	}
}
