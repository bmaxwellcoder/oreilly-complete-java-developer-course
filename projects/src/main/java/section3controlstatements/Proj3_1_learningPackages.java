package section3controlstatements;

import java.util.Scanner;

/**
 * Calculates the total cost of learning packages based on package selection and
 * course count
 */
public class Proj3_1_learningPackages {

    public static void main(String[] args) {
        // Assignment: Prompt the user for package, and total courses
        // enrolled that month
        // Tell the user how much their total (including pakage cost) is for
        // the month

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Which of the packages do you want?  1, 2, or 3?");
        int packageNum = keyboard.nextInt();

        System.out.println("How many courses did you enroll in this month?");
        int courseCount = keyboard.nextInt();

        int baseCost = 0;
        int numCoursesIncluded = 0;
        int costPerCourse = 0;

        switch (packageNum) {
            case 1:
                baseCost = 10;
                numCoursesIncluded = 2;
                costPerCourse = 6;
                break;
            case 2:
                baseCost = 12;
                numCoursesIncluded = 4;
                costPerCourse = 4;
                break;
            case 3:
                baseCost = 15;
                numCoursesIncluded = 6;
                costPerCourse = 3;
                break;
            default:
                System.out.println("Invalid entry");
        }

        int totalCost = 0;
        if (courseCount > numCoursesIncluded) {
            totalCost = baseCost + (courseCount - numCoursesIncluded) * costPerCourse;
        } else {
            totalCost = baseCost;
        }

        System.out.println("Total cost is $" + totalCost);
    }
}
