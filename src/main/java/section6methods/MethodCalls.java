package section6methods;

/**
 * Demonstrates method calls and return values
 */
public class MethodCalls {

    public static void main(String[] args) {
        doSomething();
    }

    /**
     * Demonstrates calling a method and using its return value
     */
    public static void doSomething() {
        System.out.println("In doSomething");

        int result = getSomeValue();
        System.out.println("result: " + result);
    }

    /**
     * Returns a fixed value
     *
     * @return the number 150
     */
    public static int getSomeValue() {
        return 150;
    }
}
