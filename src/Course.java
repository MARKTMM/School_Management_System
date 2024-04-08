/**
 * This class represents a course offered at the school.
 */
public class Course extends Person {
    private int courseId;

    public Course(String name, int courseId) {
        super(courseId, name);
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
