package section3controlstatements;

public class EvenOnly {

    public static void main(String[] args) {
        // Challenge: Loop through 0-10, printing out only the even integers
        // Use continue

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        // Alternative solution:
        // for (int i = 0; i < 10; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }
    }
}
