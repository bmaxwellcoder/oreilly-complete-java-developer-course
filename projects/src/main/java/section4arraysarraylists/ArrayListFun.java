package section4arraysarraylists;

import java.util.ArrayList;

/**
 * Demonstrates ArrayList operations and iteration
 */
public class ArrayListFun {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Matthew");
        namesList.add("Amanda");
        namesList.add("Wendy");

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        // Challenge: Use an enhanced for loop to loop over the array
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
