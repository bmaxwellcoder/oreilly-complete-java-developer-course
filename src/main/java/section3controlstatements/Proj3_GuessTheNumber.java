package section3controlstatements;

import java.util.Random;
import java.util.Scanner;

/**
 * A number guessing game where the user tries to guess a randomly generated
 * number
 * between 1 and 100. The game keeps track of guesses and provides feedback.
 */
public class Proj3_GuessTheNumber {

    public static void main(String[] args) {

        // Assignment: GuessTheNumber
        // Randomly generate a number between 1 and 100
        // User wil be then asked to guess the computer's guess
        // Keep track of the number of guesses
        // Outputs:
        // Correct number
        // too low
        // too high
        // guess outside range -> wasted guess

        Random random = new Random();
        int computerNumber = random.nextInt(100) + 1;

        System.out.print("Enter your integer guess 1 - 100: ");
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();

        int guessCount = 1;
        while (guess != computerNumber) {
            if (guess < computerNumber && guess > 0) {
                System.out.println("Your guess was too low");
            } else if (guess > computerNumber && guess <= 100) {
                System.out.println("Your guess was too high");
            } else {
                System.out.println("That was a wasted guess! Pick a number " +
                        "between 1 and 100, inclusive!");
            }

            System.out.print("Next integer guess: ");
            guess = keyboard.nextInt();
            guessCount++;
        }
        System.out.println("Congratulations! You guessed the number in " + guessCount +
                " guess! Thanks for playing!");
    }
}
