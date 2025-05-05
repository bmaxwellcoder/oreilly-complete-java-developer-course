package section9moreoop;

/**
 * Represents a manager, which is a type of Employee.
 * A manager oversees other employees and coordinates work.
 */
public class Manager extends Employee {
    /**
     * Creates a new Manager with the specified information
     *
     * @param firstName the manager's first name
     * @param lastName  the manager's last name
     * @param age       the manager's age
     */
    public Manager(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    /**
     * Returns a description of what a manager does
     *
     * @return a String describing the manager's work
     */
    @Override
    public String work() {
        return "I'm busy bossing everyone around!";
    }
}
