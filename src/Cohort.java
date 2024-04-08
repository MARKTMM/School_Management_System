/**
 * This class represents a cohort, which is a class (e.g., 10th grade, 11th grade, etc.).
 */
public class Cohort extends Person {
    private int cohortId;

    public Cohort(String name, int cohortId) {
        super(cohortId, name);
        this.cohortId = cohortId;
    }

    public int getCohortId() {
        return cohortId;
    }

    public void setCohortId(int cohortId) {
        this.cohortId = cohortId;
    }
}
