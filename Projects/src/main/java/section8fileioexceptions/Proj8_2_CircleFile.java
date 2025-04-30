package section8fileioexceptions;

import java.io.*;
import java.util.ArrayList;

/**
 * Reads circle radii from a file and creates Circle objects.
 * Prints and writes the properties of each circle (radius, circumference,
 * area).
 */
public class Proj8_2_CircleFile {
    /**
     * Main method that reads circle data from a file, prints to console,
     * and writes to an output file.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();
        fillCirclesArrayFromFile(circleList, "circle_data.txt");
        printCircles(circleList);
        writeCirclesToFile(circleList);
    }

    /**
     * Reads circle radii from a file and creates Circle objects.
     * Each line in the file should contain a single number representing the radius.
     * 
     * @param circleList the list to store Circle objects
     * @param file       the name of the file containing circle radii
     */
    public static void fillCirclesArrayFromFile(
            ArrayList<Circle> circleList, String file) {
        InputStream inputStream = Proj8_2_CircleFile.class
                .getResourceAsStream(file);
        if (inputStream == null) {
            System.out.println("Error: Could not find " + file + " in resources");
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
            return;
        }

        try (BufferedReader fileRead = new BufferedReader(
                new InputStreamReader(inputStream))) {
            String line;
            while ((line = fileRead.readLine()) != null) {
                try {
                    double radius = Double.parseDouble(line);
                    Circle circle = new Circle(radius);
                    circleList.add(circle);
                } catch (NumberFormatException e) {
                    System.out.println("Warning: Skipping invalid radius value: "
                            + line);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
        }
    }

    /**
     * Writes circle properties to an output file.
     * 
     * @param circleList the list of Circle objects to write
     */
    public static void writeCirclesToFile(ArrayList<Circle> circleList) {
        // Write to user's home directory
        String userHome = System.getProperty("user.home");
        File outputFile = new File(userHome, "circle_output.txt");

        try (BufferedWriter writeFile = new BufferedWriter(
                new FileWriter(outputFile))) {
            for (Circle circle : circleList) {
                writeFile.write("Radius: " + circle.getRadius());
                writeFile.newLine();
                writeFile.write("Circumference: "
                        + String.format("%.2f", circle.circumference()));
                writeFile.newLine();
                writeFile.write("Area: "
                        + String.format("%.2f", circle.area()));
                writeFile.newLine();
                writeFile.newLine();
            }
            System.out.println("Circle data written successfully to: "
                    + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            System.out.println("Attempted to write to: "
                    + outputFile.getAbsolutePath());
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
        }
    }

    /**
     * Prints circle properties to the console.
     * 
     * @param circleList the list of Circle objects to print
     */
    public static void printCircles(ArrayList<Circle> circleList) {
        for (Circle circle : circleList) {
            System.out.println("Radius: " + circle.getRadius());
            System.out.println("Circumference: "
                    + String.format("%.2f", circle.circumference()));
            System.out.println(
                    "Area: " + String.format("%.2f", circle.area()));
            System.out.println();
        }
    }
}
