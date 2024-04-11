import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a teacher at the school.
 */
public class Teacher extends Employee {
    private final List<Course> coursesTaught;
    private int totalSalary;

    /**
     * Constructs a Teacher object with the specified id, name, paid salary, and total salary.
     * @param id The unique identifier of the teacher.
     * @param name The name of the teacher.
     * @param paidSalary The amount of salary paid to the teacher.
     * @param totalSalary The total salary allocated for the teacher.
     */
    public Teacher(int id, String name, int paidSalary, List<Course> coursesTaught, int totalSalary) {
        super(id, name, paidSalary);
        this.coursesTaught = new ArrayList<>();
        this.totalSalary = totalSalary;
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
        this.totalSalary = totalSalary;
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
