package section7classesobjectsintro;

/**
 * Represents a rectangle with length and width
 */
public class Rectangle {
    private double length;
    private double width;

    private static int numRectangles;

    /**
     * Creates a new rectangle with length and width of 1.0
     */
    public Rectangle() {
        this(1.0, 1.0);
    }

    /**
     * Creates a new rectangle with the specified dimensions
     *
     * @param length length of the rectangle
     * @param width  width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    /**
     * Returns the length of the rectangle
     *
     * @return length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns the width of the rectangle
     *
     * @return width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the length of the rectangle
     *
     * @param length new length value
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Sets the width of the rectangle
     *
     * @param width new width value
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle
     *
     * @return area of the rectangle
     */
    public double area() {
        return length * width;
    }

    /**
     * Returns the total number of Rectangle objects created
     *
     * @return number of Rectangle objects
     */
    public static int getNumRectangles() {
        return numRectangles;
    }

    /**
     * Calculates the perimeter of the rectangle
     *
     * @return perimeter of the rectangle
     */
    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
