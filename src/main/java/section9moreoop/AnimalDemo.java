package section9moreoop;

/**
 * Demonstrates inheritance, polymorphism, and interfaces using Animal classes.
 * Shows how to create and use Dog and Cat objects, and demonstrates
 * polymorphic behavior with arrays of Animals.
 */
public class AnimalDemo {
    /**
     * Main method that demonstrates various OOP concepts:
     * - Inheritance
     * - Polymorphism
     * - Abstract classes
     * - Interfaces
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create and demonstrate a Dog
        Dog myDog = new Dog("Rover", 50);
        System.out.println("\nName: " + myDog.getName());
        System.out.println("Weight: " + myDog.getWeight());
        System.out.println("Doggy says: " + myDog.makeNoise());

        // Create and demonstrate a Cat
        Cat myCat = new Cat("Tom", 15);
        System.out.println("\nName: " + myCat.getName());
        System.out.println("Weight: " + myCat.getWeight());
        System.out.println("Cat says: " + myCat.makeNoise());

        // Demonstrate polymorphism with a Dog referenced as an Animal
        Animal anotherAnimal = new Dog("Sam", 100);
        System.out.println("\nName: " + anotherAnimal.getName());
        System.out.println("Weight: " + anotherAnimal.getWeight());
        System.out.println("Doggy says: " + anotherAnimal.makeNoise());
        System.out.println("\n\n");

        // Create more animals for the array demonstration
        Dog storyDog = new Dog("Wishbone", 15);
        Cat anotherCat = new Cat("Lucy", 8);

        // Create and populate an array of Animals
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Sam", 100);
        animals[1] = new Cat("Felix", 10);
        animals[2] = new Cat("Lance", 12);
        animals[3] = new Dog("Rozie", 186);
        animals[4] = new Cat("Sand", 5);

        // Demonstrate the IMovable interface
        System.out.println(myDog.move());
        System.out.println(myCat.move());

        // Print all animals in the array
        printAnimals(animals);
    }

    /**
     * Prints the name and noise of each animal in the array
     *
     * @param animals array of Animal objects to print
     */
    public static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Animal says: " + animal.makeNoise() + "\n");
        }
    }
}
