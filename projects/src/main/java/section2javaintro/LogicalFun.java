package section2javaintro;

public class LogicalFun {

    public static void main(String[] args) {
        // Challenge: modify isRaining and isWarm to contain the remaining permutations
        boolean isRaining = true;
        boolean isWarm = true;

        // Permutation 2:
        isRaining = true;
        isWarm = false;

        // Permutation 3:
        isRaining = false;
        isWarm = true;

        // Permutation 4:
        isRaining = false;
        isWarm = false;

        boolean combined = isRaining && isWarm;
        System.out.println("Is it raining and warm?: " + combined);

        combined = isRaining || isWarm;
        System.out.println("Is it raining or warm?: " + combined);

        boolean isNotRaining = !isRaining;
        System.out.println("Is it not raining outside? " + isNotRaining);

        // Additional logical operations (commented out)
        // boolean isNotWarm = !isWarm;
        // System.out.println("Is it not warm outside? " + isNotWarm);
        //
        // combined = !isRaining || !isWarm;
        // System.out.println("Is it not raining or not warm outside? " + isNotWarm);
        //
        // combined = !isRaining || isWarm;
        // System.out.println("Is it not raining or warm outside? " + isNotWarm);
        //
        // combined = isRaining || !isWarm;
        // System.out.println("Is it raining or not warm outside? " + isNotWarm);
        //
        // combined = !isRaining && isWarm;
        // System.out.println("Is it not and warm outside? " + isNotWarm);
        //
        // combined = isRaining && !isWarm;
        // System.out.println("Is it raining and not warm outside? " + isNotWarm);
        //
        // combined = !isRaining && !isWarm;
        // System.out.println("Is it raining and not warm outside? " + isNotWarm);
    }
}
