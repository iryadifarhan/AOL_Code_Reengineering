package second_case.after;

import java.util.Scanner;

public class InputValidator {
	public static int getIntInput(Scanner scanner, String promptText) {
		int num = -1;
		while (true) {
	        System.out.print(promptText);
	        try {
	            num = Integer.parseInt(scanner.nextLine());
	            
	            if(num <= 0) {
					System.out.println("Please enter only positive integer number");
					continue;
				}
	            
	            break;
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid integer number.");
	        }
	    }
		
		return num;
	}
	
	public static double getDoubleInput(Scanner scanner, String promptText) {
		double num = -1.0;
		while (true) {
			System.out.print(promptText);
			try {
				num = Double.parseDouble(scanner.nextLine());
				
				if(num <= 0) {
					System.out.println("Please enter only positive decimal number");
					continue;
				}
					
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid decimal number.");
			}
		}
		
		return num;
	}
	
	public static String getStringInput(Scanner scanner, String promptText) {
		String input = "";
		while (true) {
			System.out.print(promptText);
			input = scanner.nextLine();
			
			if(input.isEmpty()) {
				System.out.println("Invalid text. Please enter a valid text.");
				continue;
			}
			
			return input;
		}
	}
}
