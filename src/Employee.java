/**
 * This class represents an employee with common attributes like id and name,
 * along with additional attributes related to salary.
 */
public class Employee extends Person {
    private int paidSalary;

    /**
     * Constructs an Employee object with the specified id, name, and paid salary.
     * @param id The unique identifier of the employee.
     * @param name The name of the employee.
     * @param paidSalary The amount of salary paid to the employee.
     */
    public Employee(int id, String name, int paidSalary) {
        super(id, name); // Call the constructor of the superclass (Person)
        this.paidSalary = paidSalary;
    }

    /**
     * Retrieves the amount of salary paid to the employee.
     * @return The amount of salary paid.
     */
    public int getPaidSalary() {
        return paidSalary;
    }

    /**
     * Adds the specified amount to the paid salary of the employee.
     * @param amount The amount of salary to be added.
     */
    public void addPaidSalary(int amount) {
        paidSalary += amount;
    }
}
