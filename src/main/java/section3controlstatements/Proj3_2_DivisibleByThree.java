package section3controlstatements;

import java.util.Scanner;

/**
 * Determines if a user-entered integer is divisible by 3
 */
public class Proj3_2_DivisibleByThree {
    // Assignment: Prompt the user to enter an integer
    // Print out whether the number is divisible by 3
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int num = keyboard.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }
}
