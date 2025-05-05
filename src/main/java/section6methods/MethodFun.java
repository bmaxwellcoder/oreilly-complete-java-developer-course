package section6methods;

/**
 * Demonstrates method parameter passing concepts in Java
 */
public class MethodFun {

    public static void main(String[] args) {
        /*
         * Pass-by-value:
         * - A copy is made of the data being passed in
         * - Changes made to the copy inside the method do not affect the original
         *
         * Pass-by-reference:
         * - The address is passed in
         * - Any changes to the parameter in the method affects the argument
         * passed in when the method was called
         *
         * Java only supports pass-by-value:
         * - Primitive types hold the value we are interested in
         * - Reference types hold a memory address
         * - When a reference type is passed as an argument to a method,
         * the value that is copied into the parameter is a memory address
         * - Any changes made inside the method's body will affect the actual object
         */
    }
}
