package section8fileioexceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Reads rectangle dimensions from a file and creates Rectangle objects.
 * Prints the properties of each rectangle (length, width, area, perimeter).
 */
public class Proj8_1_RectangleFile {
    /**
     * Main method that reads rectangle data from a file and prints their
     * properties.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        fillArrayListFromFile(rectangleList, "rectangle_data.txt");
        printRectangles(rectangleList);
    }

    /**
     * Reads rectangle dimensions from a file and creates Rectangle objects.
     * Each line in the file should contain two numbers separated by whitespace:
     * length and width.
     * 
     * @param rectangleList the list to store Rectangle objects
     * @param file          the name of the file containing rectangle dimensions
     */
    public static void fillArrayListFromFile(
            ArrayList<Rectangle> rectangleList,
            String file) {
        InputStream inputStream = Proj8_1_RectangleFile.class
                .getResourceAsStream(file);
        if (inputStream == null) {
            System.out.println(
                    "Error: Could not find " + file + " in resources");
            System.out.println("Current working directory: "
                    + System.getProperty("user.dir"));
            return;
        }

        try (BufferedReader fileRead = new BufferedReader(
                new InputStreamReader(inputStream))) {
            String line;
            while ((line = fileRead.readLine()) != null) {
                try {
                    String[] dimensions = line.split("\\s+");
                    if (dimensions.length != 2) {
                        System.out.println("Warning: Skipping invalid line: "
                                + line);
                        continue;
                    }
                    double length = Double.parseDouble(dimensions[0]);
                    double width = Double.parseDouble(dimensions[1]);
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangleList.add(rectangle);
                } catch (NumberFormatException e) {
                    System.out.println(
                            "Warning: Skipping line with invalid numbers: "
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
     * Prints the properties of each rectangle in the list.
     * 
     * @param rectangleList the list of Rectangle objects to print
     */
    public static void printRectangles(ArrayList<Rectangle> rectangleList) {
        for (Rectangle rectangle : rectangleList) {
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Area: " + rectangle.area());
            System.out.println("Perimeter: " + rectangle.perimeter());
            System.out.println();
        }
    }
}
