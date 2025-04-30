package section8fileioexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reads student names and ages from separate files and combines them into a new
 * file.
 * Input files: student_names.txt and student_ages.txt
 * Output file: names_ages.txt
 */
public class NamesAges {
    /**
     * Main method that reads names and ages from files and writes combined
     * information to a new file. Uses try-with-resources to automatically close all
     * resources.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Read from classpath resources
            InputStream namesStream = NamesAges.class
                    .getResourceAsStream("student_names.txt");
            InputStream agesStream = NamesAges.class
                    .getResourceAsStream("student_ages.txt");

            if (namesStream == null) {
                System.out.println(
                        "Error: Could not find student_names.txt in resources"
                );
                System.out.println("Current working directory: "
                        + System.getProperty("user.dir"));
                return;
            }
            if (agesStream == null) {
                System.out.println(
                        "Error: Could not find student_ages.txt in resources"
                );
                System.out.println("Current working directory: "
                        + System.getProperty("user.dir"));
                return;
            }

            final String FILE_IO_RESOURCE_FOLDER =
                    "projects/src/main/resources/section8fileioexceptions";
            File outputFile = new File(FILE_IO_RESOURCE_FOLDER,
                    "names_ages.txt");

            try (Scanner namesScanner = new Scanner(namesStream);
                    Scanner agesScanner = new Scanner(agesStream);
                    PrintWriter pw = new PrintWriter(outputFile)) {
                while (namesScanner.hasNext()) {
                    String tempName = namesScanner.nextLine();
                    int tempAge = agesScanner.nextInt();
                    pw.println(tempName + " is " + tempAge + " years old");
                }
                System.out.println("Names and ages combined successfully to: "
                        + outputFile.getAbsolutePath());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
        }
    }
}
