package section4arraysarraylists;

/**
 * Demonstrates basic array operations and iteration
 */
public class ArrayFun {

    public static void main(String[] args) {
        // A reference type, the identifier holds the address of the array
        // Fixed in size
        // Knows its own length
        int[] myArray;
        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 28;

        for (int i = 0; i < myArray.length; i++) { // Refers to the indices
            System.out.println(myArray[i]);
        }

        // Enhanced for loop
        for (int num : myArray) { // Uses type of data in the array to loop over
            System.out.println(num);
        }
    }
}
