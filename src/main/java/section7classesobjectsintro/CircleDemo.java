package section7classesobjectsintro;

/**
 * Demonstrates the use of the Circle class
 */
public class CircleDemo {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(12.75);

        printCircle(circle1);
        printCircle(circle2);
        printCircle(circle3);
    }

    /**
     * Prints the radius, circumference, and area of a circle
     *
     * @param circle circle to print information about
     */
    public static void printCircle(Circle circle) {
        System.out.println("r = " + circle.getRadius());
        System.out.println("C = " + String.format("%.2f", circle.circumference()));
        System.out.println("A = " + String.format("%.2f", circle.area()));
        System.out.println();
    }
}
