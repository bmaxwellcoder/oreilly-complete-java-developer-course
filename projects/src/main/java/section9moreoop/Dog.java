package section9moreoop;

/**
 * Represents a dog, which is an Animal that can move.
 * Implements the IMovable interface to describe how it moves.
 */
public class Dog extends Animal implements IMovable {
    /**
     * Creates a new Dog with the specified name and weight
     * 
     * @param name   the name of the dog
     * @param weight the weight of the dog
     */
    public Dog(String name, double weight) {
        super(name, weight);
    }

    /**
     * Returns the sound a dog makes
     * 
     * @return "Woof!"
     */
    @Override
    public String makeNoise() {
        return "Woof!";
    }

    /**
     * Returns a description of how a dog moves
     * 
     * @return a String describing the dog's movement
     */
    @Override
    public String move() {
        return "I'm wagging my tail and running!";
    }
}
