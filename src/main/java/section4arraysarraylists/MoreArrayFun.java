package section4arraysarraylists;

/**
 * Demonstrates array population and iteration
 */
public class MoreArrayFun {

    public static void main(String[] args) {
        // Challenge:
        // Create an array of size 10
        // Use a regular for loop to populate an array of integers
        // Should contain the integers 1-10
        // Use an enhanced for loop to print out the elements of the array

        int[] numArray = new int[10];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i + 1;
        }

        for (int num : numArray) {
            System.out.println(num);
        }
    }
}
