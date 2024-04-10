/**
 * This class represents a principal with common attributes like id and name,
 * along with additional attributes related to salary.
 */
public class Principal extends Employee {
    private int totalSalary;

    /**
     * Constructs a Principal object with the specified id, name, paid salary, and total salary.
     * @param id The unique identifier of the principal.
     * @param name The name of the principal.
     * @param paidSalary The amount of salary paid to the principal.
     * @param totalSalary The total salary allocated for the principal.
     */
    public Principal(int id, String name, int paidSalary, int totalSalary) {
        super(id, name, paidSalary); // Call the constructor of the superclass (Employee)
        this.totalSalary = 40000;
    }
    /**
     * Retrieves the total salary allocated for the principal.
     * @return The total salary allocated.
     */
    public int getTotalSalary() {
        return totalSalary;
    }
    /**
     * Sets the total salary allocated for the principal.
     * @param totalSalary The total salary to be set.
     */
    public void setTotalSalary(int totalSalary) {
        this.totalSalary = 40000;
    }
    /**
     * Expels a student from the school.
     * @param student The student to be expelled.
     */
    public void expelStudent(Student student) {
        // Logic to expel the student goes here
        System.out.println(student.getName() + " has been expelled from the school.");
    }
    /**
     * Approves a payment made by the finance officer.
     * Deducts the approved payment amount from the total money earned by the school.
     * If the recipient is a Teacher or Principal, updates the paid salary.
     * Logs the payment approval.
     * @param recipient The person who is receiving the payment.
     * @param amount The amount of money being paid.
     */
    public void approvePayment(Person recipient, int amount, School school) {
        // Deduct the approved payment amount from the total money earned by the school
        // Assuming school is a reference to the School class instance
        school.updateTotalMoneyEarned(-amount);

        // If the recipient is a Teacher or Principal, update the paid salary
        if (recipient instanceof Teacher || recipient instanceof Principal || recipient instanceof FinanceOfficer) {
            assert recipient instanceof Employee;
            ((Employee) recipient).addPaidSalary(amount);
        }

        // Log the payment approval
        System.out.println("Payment of $" + amount + " approved to " + recipient.getName());
    }
}
