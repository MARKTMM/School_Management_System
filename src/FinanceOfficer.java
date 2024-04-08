/**
 * This class represents a finance officer with common attributes like id and name,
 * along with additional attributes related to salary.
 */
public class FinanceOfficer extends Person {
    private int salary;

    public FinanceOfficer(int id, String name, int salary) {
        super(id, name); // Call the constructor of the superclass (Person)
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Make a payment to another person.
     * @param recipient The person to whom the payment is made.
     * @param amount The amount of money to be paid.
     */
    public void makePayment(Person recipient, int amount) {
        // Logic to make the payment goes here
        System.out.println("Payment of $" + amount + " made to " + recipient.getName());
    }
}