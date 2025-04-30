package section5stringsstringbuilderclass;

import java.util.Scanner;

/**
 * Demonstrates string parsing and case conversion
 */
public class NameParser {

    public static void main(String[] args) {
        /*
         * Challenge:
         * Prompt the user for their first and last name
         * Split the String into two String objects
         * Print the uppercase version of the first name
         * Print the lowercase version of the last name
         */
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = keyboard.nextLine();

        String firstName = "";
        String lastName = "";

        // Alternative implementation using character iteration
        // int spaceIdx = 0;
        // for (int i = 0; i < name.length(); i++) {
        // if (name.charAt(i) == ' ') {
        // break;
        // }
        // firstName += name.charAt(i);
        // spaceIdx++;
        // }
        //
        // for (int i = spaceIdx + 1; i < name.length(); i++) {
        // lastName += name.charAt(i);
        // }

        int indexOfSpace = name.indexOf(" ");
        firstName = name.substring(0, indexOfSpace);
        lastName = name.substring(indexOfSpace + 1);

        String upperCaseFirstName = firstName.toUpperCase();
        System.out.println("First name is " + upperCaseFirstName);

        String lowerCaseLastName = lastName.toLowerCase();
        System.out.println("Last name is " + lowerCaseLastName);
    }
}
