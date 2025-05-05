package section4arraysarraylists;

import java.util.ArrayList;

/**
 * Demonstrates wrapper classes and auto-boxing/unboxing
 */
public class WrapperFun {

    public static void main(String[] args) {
        /*
         * Generics allow developers to code the class once and make
         * them work for a wide variety of reference types without the need
         * to rewrite the class if the behavior is to be the same
         */
        ArrayList<Integer> myAL = new ArrayList<>();
        // myAL.add(new Integer(10)); // auto-boxing of the integer makes this
        // unnecessary
        myAL.add(10);
        myAL.add(22);

        for (int i = 0; i < myAL.size(); i++) {
            int num = myAL.get(i); // auto-unboxing
            System.out.println(myAL.get(i));
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;
        System.out.println(numericValue);

        // Challenge: String to Double?
        // Create a string holding "3.14159"
        // Use the appropriate Wrapper class to convert the string to a double
        // Print the double out
        String strDouble = "3.14159";
        double numDouble = Double.parseDouble(strDouble);
        System.out.println(numDouble);
    }
}
