import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a teacher at the school.
 */
public class Teacher extends Person {
    private int paidSalary;
    private int totalSalary;
    private List<Course> coursesTaught;

    /**
     * Constructs a Teacher object with the specified id, name, paid salary, and total salary.
     * @param id The unique identifier of the teacher.
     * @param name The name of the teacher.
     * @param paidSalary The amount of salary paid to the teacher.
     * @param totalSalary The total salary allocated for the teacher.
     */
    public Teacher(int id, String name, int paidSalary, int totalSalary) {
        super(id, name);
        this.paidSalary = 0;
        this.totalSalary = 20000;
        this.coursesTaught = new ArrayList<>();
    }

    /**
     * Retrieves the amount of salary paid to the teacher.
     * @return The amount of salary paid.
     */
    public int getPaidSalary() {
        return paidSalary;
    }

    /**
     * Sets the amount of salary paid to the teacher.
     * @param amount The amount of salary to be set.
     */
    public void addPaidSalary(int amount) {
        this.paidSalary += amount;
    }
    /**
     * Retrieves the total salary allocated for the teacher.
     * @return The total salary allocated.
     */
    public int getTotalSalary() {
        return totalSalary;
    }
    /**
     * Sets the total salary allocated for the teacher.
     * @param totalSalary The total salary to be set.
     */
    public void setTotalSalary(int totalSalary) {
        this.totalSalary = 20000;
    }
    /**
     * Retrieves the list of courses taught by the teacher.
     * @return The list of courses taught.
     */
    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }
    /**
     * Adds a course to the list of courses taught by the teacher.
     * @param course The course to be added.
     */
    public void addCourseTaught(Course course) {
        coursesTaught.add(course);
    }
}
