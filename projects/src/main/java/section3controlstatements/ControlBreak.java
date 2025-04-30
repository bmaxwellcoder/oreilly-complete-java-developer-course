package section3controlstatements;

/**
 * Demonstrates the use of break and continue statements in loops
 */
public class ControlBreak {

    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            if (count == 5) {
                count++;
                continue;
            }

            System.out.print(count + "\t");
            count++;
        }
    }
}
