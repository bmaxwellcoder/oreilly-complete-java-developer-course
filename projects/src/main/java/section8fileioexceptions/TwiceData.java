package section8fileioexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reads integers from a file, doubles them, and writes the results to a new
 * file.
 * Input file: nums.txt
 * Output file: twice_nums.txt
 */
public class TwiceData {
    /**
     * Main method that reads integers from nums.txt, doubles each value,
     * and writes the results to twice_nums.txt.
     * Uses try-with-resources to automatically close all resources.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Read from classpath resource
            InputStream inputStream = TwiceData.class
                    .getResourceAsStream("nums.txt");
            if (inputStream == null) {
                System.out.println(
                        "Error: Could not find nums.txt in resources"
                );
                System.out.println("Current working directory: "
                        + System.getProperty("user.dir"));
                return;
            }

            final String FILE_IO_RESOURCE_FOLDER =
                    "projects/src/main/resources/section8fileioexceptions";
            File outputFile = new File(FILE_IO_RESOURCE_FOLDER,
                    "twice_nums.txt");

            try (Scanner inFile = new Scanner(inputStream);
                    PrintWriter pw = new PrintWriter(outputFile)) {
                while (inFile.hasNextInt()) {
                    int num = inFile.nextInt();
                    int twiceNum = num * 2;
                    pw.println(twiceNum);
                }
                System.out.println(
                        "Numbers doubled and written successfully to: "
                        + outputFile.getAbsolutePath());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
        }
    }
}
