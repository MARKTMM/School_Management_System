import java.util.List;

public class School {
    private Principal principal;
    private List<Teacher> teachers;
    private List<Student> students;
    private FinanceOfficer financeOfficer;
    private List<Cohort> cohorts;
    private List<Grade> grades;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(Principal principal, List<Teacher> teachers, List<Student> students, FinanceOfficer financeOfficer, List<Cohort> cohorts, List<Grade> grades) {
        this.principal = principal;
        this.teachers = teachers;
        this.students = students;
        this.financeOfficer = financeOfficer;
        this.cohorts = cohorts;
        this.grades = grades;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public School(List<Teacher> teacherList, List<Student> studentList, List<Course> coursesList, List<Cohort> cohortList) {
    }


    public Principal getPrincipal() {
        return principal;
    }
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
    /**
     * @return list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }
    /**
     * Adds a teacher to the school.
     * @param teacher is added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    /**
     * @return list of students.
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * Adds student to the school.
     * @param student is added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**
     * @return
     */
    public FinanceOfficer getFinanceOfficer() {
        return financeOfficer;
    }
    public void setFinanceOfficer(FinanceOfficer financeOfficer) {
        this.financeOfficer = financeOfficer;
    }
    /**
     * @return list of cohorts in the school.
     */
    public List<Cohort> getCohort() {
        return cohorts;
    }
    /**
     * Adds a Cohort.
     * @param cohort to be added.
     */
    public void addCohort(Cohort cohort) {
        cohorts.add(cohort);
    }
    /**
     * @return
     */
    public List<Grade> getGrade() {
        return grades;
    }
    /**
     * @param grade
     */
    public void addGrade(Grade grade) {
        grades.add(grade);
    }
    /**
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned that is to be added.
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    /**
     * @return total money spent.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * Adds the totalmoney spent by the school i.e salaries.
     * @param moneySpent that is to be added.
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}