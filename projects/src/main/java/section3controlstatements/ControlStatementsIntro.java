package section3controlstatements;

public class ControlStatementsIntro {

    public static void main(String[] args) {
        int age = 15;

        if (age >= 16) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive yet!");
        }

        for (int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);
        }

        // Challenge: Say out loud 3 categories of control statements
        // 1. Sequential (Sequence)
        // 2. Selection (Decision)
        // 3. Repetition (Loops)
    }
}
