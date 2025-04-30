package section4arraysarraylists;

import java.util.Scanner;

/**
 * Project 4.1: Demonstrates array input and manipulation
 */
public class Proj4_1_Arrays {

    public static void main(String[] args) {
        /*
         * Assignment:
         * Prompt the user to input 5 integers
         * Store each of the integers in a regular, built-in array
         * Loop over the array and print its values *= 2
         */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 5 integers ");
        int[] numArray = new int[5];

        for (int i = 0; i < 5; i++) {
            numArray[i] = keyboard.nextInt();
        }

        for (int num : numArray) {
            System.out.println(num * 2);
        }
    }
}
