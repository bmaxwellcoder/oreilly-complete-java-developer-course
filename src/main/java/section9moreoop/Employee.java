package section9moreoop;

/**
 * Abstract class representing an employee with basic information.
 * Subclasses must implement the work() method to specify
 * what type of work the employee performs.
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Creates a new Employee with the specified information
     *
     * @param firstName the employee's first name
     * @param lastName  the employee's last name
     * @param age       the employee's age
     */
    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Returns the employee's first name
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the employee's last name
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the employee's age
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the employee's first name
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the employee's last name
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the employee's age
     *
     * @param age the new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns a description of the work the employee performs
     *
     * @return a String describing the work
     */
    public abstract String work();

    /**
     * Returns a string representation of the employee
     *
     * @return string containing the employee's information
     */
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}
