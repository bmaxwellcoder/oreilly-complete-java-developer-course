package section3controlstatements;

import java.util.Scanner;

/**
 * Determines eligibility for joining a fraternity based on age and gender
 * Eligibility criteria: Male and age > 19
 */
public class Fraternity {

    public static void main(String[] args) {

        // Create a new class file called Fraternity
        // Prompt the user for their age and gender
        // Use selection control statement to tell the user if they are eligible
        // to join the fraternity
        // Eligibility: Male and > 19

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your gender: ");
        char gender = keyboard.next().charAt(0);

        System.out.print("Please enter your age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        if ((gender == 'm' || gender == 'M') && age > 19) {
            System.out.println("You are eligible to join the fraternity");
        } else {
            System.out.println("You are not eligible to join the fraternity");
        }
    }
}
