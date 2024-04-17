import java.util.List;

/**
 * This class represents a cohort, which is a class (e.g., 10th grade, 11th grade, etc.).
 */
public class Cohort  {
    private String cohort;

    public Cohort(String cohort) {
        this.cohort = cohort;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
