package section9moreoop;

import java.util.Random;

/**
 * Demonstrates the use of the Employee hierarchy by creating and displaying
 * different types of employees (Managers and Workers).
 * 
 * This class includes an enum for employee types and methods to randomly
 * generate different types of employees.
 */
public class EmployeeDemo {
    /**
     * Represents the possible types of employees in the system.
     */
    private enum EmployeeType {
        WORKER,
        MANAGER
    }

    /**
     * Main method that demonstrates the Employee hierarchy.
     * Creates two arrays of employees:
     * 1. A fixed array with specific employees
     * 2. A randomly generated array of employees
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create first array with specific employees
        Employee[] employeeArr1 = new Employee[5];
        employeeArr1[0] = new Manager("Michael", "Scott", 41);
        employeeArr1[1] = new Manager("Dwight", "Schrute", 35);
        employeeArr1[2] = new Worker("Jim", "Halpert", 26);
        employeeArr1[3] = new Worker("Pam", "Beesly", 26);
        employeeArr1[4] = new Worker("Ryan", "Howard", 26);

        // Create second array with randomly generated employees
        Employee[] employeeArr2 = new Employee[5];
        for (int i = 0; i < 5; i++) {
            EmployeeType employeeType = getEmployeeType();
            Employee currentEmployee;

            if (employeeType == EmployeeType.WORKER) {
                currentEmployee = new Worker("John", "Smith", 25);
            } else {
                currentEmployee = new Manager("Samantha", "Jones", 23);
            }

            employeeArr2[i] = currentEmployee;
        }

        // Display information about randomly generated employees
        for (Employee employee : employeeArr2) {
            System.out.println(
                    "Name: " + employee.getFirstName() + " " + employee.getLastName() +
                            ", age " + employee.getAge() + " says, " +
                            "\n\t\t\t\t " + employee.work() + "\n");
        }
    }

    /**
     * Randomly generates an employee type (Worker or Manager).
     * 
     * @return A randomly selected EmployeeType
     */
    public static EmployeeType getEmployeeType() {
        Random random = new Random();
        final int UPPER_BOUND = 2;

        if (random.nextInt(UPPER_BOUND) == 0) {
            return EmployeeType.WORKER;
        }
        return EmployeeType.MANAGER;
    }
}