package section3controlstatements;

import java.util.Scanner;

/**
 * Demonstrates different types of loops in Java
 */
public class RepetitionFun {

    public static void main(String[] args) {
        // Example loops (commented out)
        // int count = 0;
        //
        // while (count < 10) { // pre-test condition loop
        // System.out.println(count);
        // count++;
        // }
        //
        // int count2 = 0;
        // do { // post-test condition loop
        // System.out.println(count2);
        // count2++;
        // } while (count2 < 10);
        //
        // for (int i = 0; i < 10; i++) { // counter controlled loop
        // System.out.println(i);
        // }

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative to exit");
        int input = keyboard.nextInt();

        while (input >= 0) {
            System.out.println(input);
            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
        }

        System.out.println("Done!");
    }
}
