package section9moreoop;

/**
 * Abstract class representing an animal with a name and weight.
 * Subclasses must implement the makeNoise() method to specify
 * the sound the animal makes.
 */
public abstract class Animal {
    private String name;
    private double weight;

    /**
     * Creates a new Animal with the specified name and weight
     * 
     * @param name   the name of the animal
     * @param weight the weight of the animal
     */
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Returns the name of the animal
     * 
     * @return the animal's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the weight of the animal
     * 
     * @return the animal's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the name of the animal
     * 
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the weight of the animal
     * 
     * @param weight the new weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Returns the sound the animal makes
     * 
     * @return a String representing the animal's sound
     */
    public abstract String makeNoise();
}
