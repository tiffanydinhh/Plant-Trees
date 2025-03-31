package plantTrees;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class test {
    
    public static void main(String[] args) {
        // Path to the CSV file
        String fileName = "/Users/tiffanydinh/eclipse-workspace/CS1400Project/src/Fires_100.csv";
        
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] nextLine;
            // Read each line of the CSV
            while ((nextLine = reader.readNext()) != null) {
                // Output first two columns from each line
                System.out.println(nextLine[0] + " // " + nextLine[1] + " // " + nextLine[2] + " // " + nextLine[3] + " // " + nextLine[4] + " // " + nextLine[5] + " // " + nextLine[6] + " // " + nextLine[7] + " // " + nextLine[8] + " // " + nextLine[9]);
            }
        } catch (IOException | CsvValidationException e) {
            // Handle I/O exceptions (like file not found) and CSV validation errors
            e.printStackTrace();
        }
    }
}
