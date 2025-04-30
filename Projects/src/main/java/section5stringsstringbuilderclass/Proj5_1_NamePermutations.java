package section5stringsstringbuilderclass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project 5.1: Demonstrates name permutations using ArrayLists
 */
public class Proj5_1_NamePermutations {

    public static void main(String[] args) {
        /*
         * Assignment:
         * Prompt the user for 5 full names with space between first and last name
         * Separate the first and last name
         * Place the names into separate ArrayLists
         */
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> firstNamesList = new ArrayList<>();
        ArrayList<String> lastNamesList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter your first and last name " + (i + 1) + ") ");
            String name = keyboard.nextLine();

            int indexOfSpace = name.indexOf(" ");
            firstNamesList.add(name.substring(0, indexOfSpace));
            lastNamesList.add(name.substring(indexOfSpace + 1));
        }

        // Iterate over the ArrayLists and print out all possible permutations of
        // first and last names
        int i = 0;
        for (String firstName : firstNamesList) {
            for (String lastName : lastNamesList) {
                System.out.println(++i + ". " + firstName + " " + lastName);
            }
        }
    }
}
