package section9moreoop;

/**
 * Represents a worker, which is a type of Employee.
 * A worker performs the day-to-day tasks of the organization.
 */
public class Worker extends Employee {
    /**
     * Creates a new Worker with the specified information
     *
     * @param firstName the worker's first name
     * @param lastName  the worker's last name
     * @param age       the worker's age
     */
    public Worker(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    /**
     * Returns a description of what a worker does
     *
     * @return a String describing the worker's tasks
     */
    @Override
    public String work() {
        return "I'm busy getting work done!";
    }
}
