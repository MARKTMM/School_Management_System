/**
 * This class represents a course offered at the school.
 */
public class Course {
    private int courseId;
    private String name;

    public Course(String name, int courseId) {
        this.name = name;
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
