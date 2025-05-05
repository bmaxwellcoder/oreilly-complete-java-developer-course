package section3controlstatements;

import java.util.Random;

/**
 * Demonstrates the use of Random class to generate random numbers
 */
public class RandomFun {

    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("number is: \t" + myRandomNumber);

        myRandomNumber = random.nextInt(1000); // 0 - 999
        System.out.println("0 through 999? \t" + myRandomNumber);

        // Shifting
        myRandomNumber = random.nextInt(1000) + 1;
        System.out.println("1 through 1000?\t" + myRandomNumber);
    }
}
