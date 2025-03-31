package plantTrees;

import java.util.Scanner;


public class PlantTrees {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables
		String userInput;
		boolean closeToPowerLines;
		
		System.out.print("Input tree name: ");
		
		// Assign variables
		userInput = scnr.nextLine();
		closeToPowerLines = false;
		
		// if-else statement assigns closeToPowerLines truth value based on user input
		if (userInput.equals("Oak") || userInput.equals("Compact Italian Cypress")) {
			closeToPowerLines = false;
		}
		else if (userInput.equals("Tuscarora Crape Myrtle") || userInput.equals("Cold Hardy")) {
			closeToPowerLines = true;
		}
		else {
			System.out.println("Invalid input (input is case-sensitive)");
			return;
		}
		
		// based on closeToPowerLines truth value, print if it is a good choice or not
		if (closeToPowerLines) {
			System.out.println(userInput + " is a good choice to be planted in California in areas close to power lines.");
		}
		else {
			System.out.println(userInput + " is not a good choice to be planted in California in areas close to power lines.");
		}
		
	}
	
}
