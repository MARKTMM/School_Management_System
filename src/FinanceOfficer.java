/**
 * This class represents a finance officer with common attributes like id and name,
 * along with additional attributes related to salary.
 */
public class FinanceOfficer extends Employee {
    private int totalSalary;

    public FinanceOfficer(int id, String name, int paidSalary,int totalSalary) {
        super(id, name, paidSalary); // Call the constructor of the superclass (Person)
        this.totalSalary = 50000;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = 50000;
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