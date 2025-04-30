package section3controlstatements;

import java.util.Scanner;

/**
 * Demonstrates sentinel-controlled repetition to sum non-negative integers
 */
public class SumFun {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        // Sentinel-controlled repetition
        do {
            System.out.println("Enter a non-negative integer to add to a sum");
            System.out.println("Enter a negative to exit");
            sum += num;
            num = keyboard.nextInt();
        } while (num >= 0);

        // Alternative solution (commented out)
        // System.out.println("Please enter first non-negative integer to add: ");
        // System.out.println("Enter a negative to exit");
        // int num = keyboard.nextInt();
        // while (num >= 0) {
        // sum += num;
        // System.out.println("Please another non-negative integer to add: ");
        // System.out.println("Enter a negative to exit");
        // num = keyboard.nextInt();
        // }

        System.out.println("The sum of the values is " + sum);
    }
}
