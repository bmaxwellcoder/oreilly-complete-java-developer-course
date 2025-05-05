package section7classesobjectsintro;

/**
 * Represents a circle with radius and methods to calculate circumference and
 * area
 */
public class Circle {
    private double radius;

    /**
     * Creates a new circle with radius 1
     */
    public Circle() {
        this(1);
    }

    /**
     * Creates a new circle with the specified radius
     *
     * @param radius radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the radius of the circle
     *
     * @return radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle
     *
     * @param radius new radius value
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the circumference of the circle
     *
     * @return circumference of the circle
     */
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the area of the circle
     *
     * @return area of the circle
     */
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
