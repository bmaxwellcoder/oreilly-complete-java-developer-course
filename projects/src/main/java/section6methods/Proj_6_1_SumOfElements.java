package section6methods;

import java.util.ArrayList;

/**
 * Project 6.1: Demonstrates method to sum elements of an ArrayList
 */
public class Proj_6_1_SumOfElements {

    public static void main(String[] args) {
        /*
         * Assignment:
         * Write a method that sums integer elements from an ArrayList
         */
        ArrayList<Integer> intNumList = new ArrayList<>();
        intNumList.add(10);
        intNumList.add(22);
        intNumList.add(55);
        intNumList.add(121);

        System.out.println("Sum of the elements is: " + sumElements(intNumList));
    }

    /**
     * Calculates the sum of all elements in the given ArrayList
     * 
     * @param numList ArrayList of integers to sum
     * @return sum of all elements in the ArrayList
     */
    public static int sumElements(ArrayList<Integer> numList) {
        int sum = 0;
        for (int num : numList) {
            sum += num;
        }
        return sum;
    }
}
