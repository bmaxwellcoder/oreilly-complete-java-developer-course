package section8fileioexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Demonstrates writing a list of names to a file.
 * Creates a file named names.txt containing a list of names from an ArrayList.
 */
public class WriteNames {
    /**
     * Main method that creates an ArrayList of names and writes them to a file.
     * Uses try-with-resources to automatically close the PrintWriter.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Gabriel");
        namesList.add("Gabrielle");
        namesList.add("Betty");
        namesList.add("Oscar");
        namesList.add("Estella");

        // Write to user's home directory instead of resources
        String userHome = System.getProperty("user.home");
        File outputFile = new File(userHome, "names.txt");

        try (PrintWriter pw = new PrintWriter(outputFile)) {
            for (String name : namesList) {
                pw.println(name);
            }
            System.out.println("Names written successfully to: "
                    + outputFile.getAbsolutePath());
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Couldn't write to file: "
                    + ex.getMessage());
            System.out.println("Attempted to write to: "
                    + outputFile.getAbsolutePath());
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
        }
    }
}
