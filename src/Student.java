import java.util.List;

/**
 * This class represents a student at the school.
 */
public class Student extends Person {
    private String courses;
    private String cohort;
    private int feesPaid = 0;
    private int totalFees;

    /**
     * Constructs a Student object with the specified id, name, courses, classes, and fee payment status.
     * @param id The unique identifier of the student.
     * @param name The name of the student.
     * @param courses The courses enrolled by the student.
     * @param cohort The classes attended by the student.
     * @param feesPaid The amount of fees paid by the student.
     */
    public Student(int id, String name, String courses, String cohort, int feesPaid, int totalFees) {
        super(id, name);
        this.courses = courses;
        this.cohort = cohort;
        this.feesPaid = 0;
        this.totalFees = totalFees;
    }
    /**
     * Retrieves the courses enrolled by the student.
     * @return The list of courses enrolled.
     */
    public String getCourses() {
        return courses;
    }
    /**
     * Sets the courses enrolled by the student.
     * @param courses The list of courses to be set.
     */
    public void setCourses(String courses) {
        this.courses = courses;
    }
    /**
     * Retrieves the classes attended by the student.
     * @return The list of classes attended.
     */
    public String getCohort() {
        return cohort;
    }
    /**
     * Sets the classes attended by the student.
     * @param cohort The list of classes to be set.
     */
    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
    /**
     * Retrieves the amount of fees paid by the student.
     * @return The amount of fees paid.
     */
    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     * adds the amount of fees paid by the student.
     * @param fees The amount of fees to be set.
     */
    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }
    /**
     * Retrieves the total fees for the student.
     * @return The total fees.
     */
    public int getTotalFees() {
        return totalFees;
    }

    /**
     * Calculates the remaining fees to be paid by the student.
     * @return The remaining fees.
     */
    public int getRemainingFees() {
        return totalFees - feesPaid;
    }
}
