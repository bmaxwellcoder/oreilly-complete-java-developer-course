package section8fileioexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        final String FILE_IO_RESOURCE_FOLDER =
                "projects/src/main/resources/section8fileioexceptions";
        File outputFile = new File(FILE_IO_RESOURCE_FOLDER,
                "output.txt");

        try (PrintWriter pw = new PrintWriter(outputFile)) {
            pw.println("Hello there");
            pw.println("My name is John Baugh!");
            System.out.println("File written successfully to: " + outputFile.getAbsolutePath());
        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't write to file: " + ex.getMessage());
            System.out.println("Attempted to write to: " + outputFile.getAbsolutePath());
            System.out.println("Current working directory: " + System.getProperty("user.dir"));
        }
    }
}