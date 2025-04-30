package section4arraysarraylists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project 4.3: Demonstrates parallel ArrayLists for storing related data
 */
public class Proj4_3_Parallel {

    public static void main(String[] args) {
        /*
         * Assignment:
         * Obtain the names and ages of 5 individuals
         * Names will go in one list
         * Ages will go in another list
         * Each index for the two lists refer to the same person
         * Print the data with respective names and ages
         */
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Integer> agesList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            String name = keyboard.nextLine().trim();
            System.out.print("Enter an age: ");
            int age = keyboard.nextInt();

            keyboard.nextLine();
            System.out.println();

            namesList.add(name);
            agesList.add(age);
        }

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i) + " is " + agesList.get(i) + " years old");
        }

        // Alternative implementation using enhanced for loop
        // for (String name : namesList) {
        // System.out.println(name + " is " + agesList.get(namesList.indexOf(name)) + "
        // years old");
        // }
    }
}
