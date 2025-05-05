package section3controlstatements;

import java.util.Random;

public class DiceSimulation {

    public static void main(String[] args) {

        // Challenge: Simulate 10 rolls of a standard 6-sided die
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int diceRoll = random.nextInt(6) + 1;
            System.out.println(diceRoll);
        }
    }
}
