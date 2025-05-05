package section9moreoop;

/**
 * Represents a cat, which is an Animal that can move.
 * Implements the IMovable interface to describe how it moves.
 */
public class Cat extends Animal implements IMovable {
    /**
     * Creates a new Cat with the specified name and weight
     *
     * @param name   the name of the cat
     * @param weight the weight of the cat
     */
    public Cat(String name, double weight) {
        super(name, weight);
    }

    /**
     * Returns the sound a cat makes
     *
     * @return "Meow!"
     */
    @Override
    public String makeNoise() {
        return "Meow!";
    }

    /**
     * Returns a description of how a cat moves
     *
     * @return a String describing the cat's movement
     */
    @Override
    public String move() {
        return "I'm stalking you, waiting on my dinner!";
    }
}
