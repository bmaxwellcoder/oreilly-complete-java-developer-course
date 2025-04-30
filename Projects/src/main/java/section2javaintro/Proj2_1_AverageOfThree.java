package section2javaintro;

import java.util.Scanner;

/**
 * Project: Prompt the user of three different real numbers
 * Print out their average (mean value) to the console
 */
public class Proj2_1_AverageOfThree {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        double realNum1 = keyboard.nextDouble();
        double realNum2 = keyboard.nextDouble();
        double realNum3 = keyboard.nextDouble();
        keyboard.nextLine();

        double average = (realNum1 + realNum2 + realNum3) / 3.0;
        System.out.println("The average of the three numbers is: " + average);
    }
}
