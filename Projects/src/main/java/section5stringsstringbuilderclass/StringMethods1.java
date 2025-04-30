package section5stringsstringbuilderclass;

/**
 * Demonstrates basic String methods and comparisons
 */
public class StringMethods1 {

    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        System.out.println();

        if (name.equals(name2)) {
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names aren't equal.");
        }

        if (name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        } else {
            System.out.println("name <= name3");
        }

        /*
         * Challenge: Compare with your name
         * Create a String with your own name in it
         * Compare it with one of the other strings
         */
        System.out.println("Comparing for the lecture challenge");
        String myName = "Bryan Williamson";

        if (myName.compareTo(name3) > 0) {
            System.out.println(myName + " is greater than " + name3);
        } else {
            System.out.println(myName + " is less than or equal to " + name3);
        }
    }
}
