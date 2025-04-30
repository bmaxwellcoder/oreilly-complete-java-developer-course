package section2javaintro;

public class RelationFun {

    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        String myName = "Bryan";
        String yourName = "Bryan";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        // Relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge? " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("myAge > yourAge? " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("myAge == yourAge? " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match? : " + nameComparison);

        // Challenge: create a currentAge variable
        // print out boolean value of whether currentAge is >= 21
        int currentAge = 25;
        boolean isGreaterOrEqual21 = currentAge >= 21;
        System.out.println("currentAge >= 21?: " + isGreaterOrEqual21);
    }
}
