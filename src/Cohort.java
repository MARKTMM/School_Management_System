import java.util.List;

/**
 * This class represents a cohort, which is a class (e.g., 10th grade, 11th grade, etc.).
 */
public class Cohort  {
    private List<Cohort> cohorts;

    public Cohort(List<Cohort> cohorts) {
        this.cohorts = cohorts;
    }

    public List<Cohort> getCohorts() {
        return cohorts;
    }

    public void setCohorts(List<Cohort> cohorts) {
        this.cohorts = cohorts;
    }
}
