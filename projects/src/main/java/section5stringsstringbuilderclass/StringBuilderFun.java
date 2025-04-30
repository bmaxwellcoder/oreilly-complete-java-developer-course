package section5stringsstringbuilderclass;

/**
 * Demonstrates StringBuilder operations and mutability
 */
public class StringBuilderFun {

    public static void main(String[] args) {
        /*
         * Strings objects of the String class are immutable in Java
         * Methods such as .toUpperCase() directly on a String object return
         * a new String object and do not affect the original String object
         * 
         * Frequent modifications to a String should be done with StringBuilder
         * StringBuilder is like the String class in that it contains textual data,
         * but it can be mutated or modified
         */
        StringBuilder sb = new StringBuilder("John Baugh");
        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5, "Phillip ");
        System.out.println(sb);

        sb.replace(22, 29, "amazing");
        System.out.println(sb);

        sb.delete(5, 13);
        System.out.println(sb);

        // Challenge: Replace Name with Title
        sb.replace(0, 4, "Dr.");
        System.out.println(sb);
    }
}
