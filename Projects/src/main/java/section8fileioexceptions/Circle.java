package section8fileioexceptions;

/**
 * Represents a circle with a given radius.
 * Provides methods to calculate circumference and area.
 */
public class Circle {
    private double radius;

    /**
     * Creates a new Circle with default radius of 1.0
     */
    public Circle() {
        this(1.0);
    }// no arg ctor

    /**
     * Creates a new Circle with specified radius
     * 
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }// end ctor

    /**
     * Returns the radius of the circle
     * 
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }// end getRadius

    /**
     * Sets the radius of the circle
     * 
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }// end setRadius

    /**
     * Calculates the circumference of the circle
     * 
     * @return the circumference
     */
    public double circumference() {
        return 2 * Math.PI * radius;
    }// end circumference

    /**
     * Calculates the area of the circle
     * 
     * @return the area
     */
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }// end area

    /**
     * Returns a string representation of the circle
     * 
     * @return string containing the circle's radius
     */
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}// end Circle class
