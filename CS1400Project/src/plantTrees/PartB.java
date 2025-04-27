package plantTrees;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class PartB {
	
	public static void main(String[] args) throws Exception {
		
		String fileName = //insert file location
		
		try (CSVReader reader1 = new CSVReaderBuilder(new FileReader (fileName)).build()) {
			String [] nextLine;
			while ((nextLine = reader1.readNext()) != null) {
				System.out.printf("%-10s%-15s%-60s%-40s%-20s%-20s%-15s%-20s%-40s%-20s%n",
				nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], 
				nextLine[6], nextLine[7], nextLine[8], nextLine[9], nextLine[10]);
				
			}
			
			System.out.println();
			System.out.print("Input area name (4th column): ");
			
			Scanner scnr = new Scanner(System.in);
			
			String userInput; 
			int count;
			
			userInput = scnr.nextLine();
			count = 0;
			
		try (CSVReader reader2 = new CSVReaderBuilder(new FileReader (fileName)).build()) {
			while ((nextLine = reader2.readNext()) != null) {
				if (nextLine[3].equals(userInput)) {
					count = count + 1;
				}
			}
		}
			
		if (count > 0) {
			System.out.println(count + " wildfires occured in " + userInput);
		}
		else if (count == 0){
			System.out.println("Invalid input (input is case-sensitive)");
		}
			
		}
		catch (IOException | CsvValidationException e) {
			System.out.println("File not found");

		}
		
	}
	
}
