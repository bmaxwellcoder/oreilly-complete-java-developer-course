package section4arraysarraylists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project 4.2: Demonstrates ArrayList input and reverse printing
 */
public class Proj4_2_ArrayLists {

    public static void main(String[] args) {
        /*
         * Assignment:
         * Create an ArrayList and populate it with non-negative numbers
         * User will enter real numbers from the console
         * Stop asking for numbers when the user enters a negative number
         * Print the values of the ArrayList in reverse order
         */
        ArrayList<Double> nonNegNumList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a value 0 or more to add to list or negative value to exit");
        double nonNegNum = keyboard.nextDouble();

        while (nonNegNum >= 0) {
            nonNegNumList.add(nonNegNum);
            System.out.println("Enter next value 0 or more to add to list or negative value to exit");
            nonNegNum = keyboard.nextDouble();
        }

        for (int i = nonNegNumList.size() - 1; i >= 0; i--) {
            System.out.println(nonNegNumList.get(i));
        }
    }
}
