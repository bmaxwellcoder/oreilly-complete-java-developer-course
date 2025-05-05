package section8fileioexceptions;

/**
 * Represents a rectangle with given length and width.
 * Tracks the total number of Rectangle objects created.
 */
public class Rectangle {
    private double length;
    private double width;

    private static int numRectangles;

    /**
     * Creates a new Rectangle with default length and width of 1.0
     */
    public Rectangle() {
        this(1.0, 1.0);
    } // end no-arg ctor

    /**
     * Creates a new Rectangle with specified dimensions
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
    } // end ctor

    /**
     * Returns the length of the rectangle
     *
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns the width of the rectangle
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the length of the rectangle
     *
     * @param length the new length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Sets the width of the rectangle
     *
     * @param width the new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle
     *
     * @return the area
     */
    public double area() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle
     *
     * @return the perimeter
     */
    public double perimeter() {
        return 2 * length + 2 * width;
    }

    /**
     * Returns the total number of Rectangle objects created
     *
     * @return the number of rectangles
     */
    public static int getNumRectangles() {
        return numRectangles;
    }

    /**
     * Returns a string representation of the rectangle
     *
     * @return string containing the rectangle's dimensions
     */
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}