package section6methods;

/**
 * Demonstrates various method types and parameter passing
 */
public class MethodDemo {

    public static void main(String[] args) {
        /*
         * Arguments: data passed in when the method is called or invoked
         * Parameters: placeholders in the method definition;
         * part of the header of the definition that receive the value
         * when the method is called
         */
        int a = 15;
        System.out.println(testing(a));
        System.out.println(a);

        printHello();
        printNumber(10); // argument 10 is passed in
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5); // arguments 3 and 5 passed in
        System.out.println(result);

        System.out.println(squareDouble(5.5));
    }

    /**
     * Prints a greeting message
     */
    public static void printHello() {
        System.out.println("Hello there!");
    }

    /**
     * Prints the given number
     * 
     * @param a number to print
     */
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }

    /**
     * Returns the number 10
     * 
     * @return the number 10
     */
    public static int giveMe10() {
        return 10;
    }

    /**
     * Adds two numbers together
     * 
     * @param num1 first number to add
     * @param num2 second number to add
     * @return sum of the two numbers
     */
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Challenge: Square of a double
     * Returns the square of a double that is passed in as a parameter
     * 
     * @param num number to square
     * @return square of the input number
     */
    public static double squareDouble(double num) {
        return num * num;
    }

    /**
     * Multiplies the input by 5
     * 
     * @param a number to multiply
     * @return input number multiplied by 5
     */
    public static int testing(int a) {
        return a * 5;
    }
}
