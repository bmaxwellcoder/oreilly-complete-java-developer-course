package section2javaintro;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String girlAdjective = keyboard.nextLine();

        System.out.print("Enter a girl's name: ");
        String girlsName = keyboard.nextLine();

        System.out.print("Enter another adjective: ");
        String girlAdjective2 = keyboard.nextLine();

        System.out.print("Enter an occupation: ");
        String girlJobAdjective = keyboard.nextLine();

        System.out.print("Enter a place: ");
        String place = keyboard.nextLine();

        System.out.print("Enter a clothing item worn: ");
        String clothing = keyboard.nextLine();

        System.out.print("Enter a hobby: ");
        String hobby = keyboard.nextLine();

        System.out.print("Enter another occupation: ");
        String boyJobAdjective = keyboard.nextLine();

        System.out.print("Enter a boy's name: ");
        String boysName = keyboard.nextLine();

        System.out.print("Enter a man's name: ");
        String mansName = keyboard.nextLine();

        System.out.println();

        String story = "There once was a " + girlAdjective + " girl named " + girlsName +
                ", who\n" + "was a " + girlAdjective2 + girlJobAdjective +
                " in the Kingdom of " + place + ".\n" + "She loved to wear " +
                clothing + " and to " + hobby + ". She wanted to\n" +
                "marry the " + boyJobAdjective + " named " + boysName + " but her\n" +
                "father, King " + mansName + " forbid her from seeing him.";

        System.out.println(story);
    }
}
