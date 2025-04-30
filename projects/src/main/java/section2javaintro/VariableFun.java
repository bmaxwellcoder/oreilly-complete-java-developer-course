package section2javaintro;

public class VariableFun {

    public static void main(String[] args) {
        // Declare an integer variable named age and assign it the value 19
        int age = 19;

        // Declare a String variable named name and assign it the value "Billy"
        String name = "Billy";

        // A final variable is a variable with a value that can't be changed once
        // initialized
        final int SOME_NUM = 150;

        // Print the concatenated string "Billy is 19" with a new line to the console
        System.out.println(name + " is " + age + '\n');

        // Challenge: Create a new variable and hold the name of your hometown
        String myHometown = "South Holland";
        System.out.println(myHometown);
    }
}
