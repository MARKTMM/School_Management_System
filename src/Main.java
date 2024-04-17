import java.util.ArrayList;
import java.util.List;

/**
 * The Main class serves as the entry point for the application and contains the main method.
 */
public class Main {
    /**
     * The main method, which is the entry point of the application.
     * @param args Command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Create instance of Principal and financeOfficer class
        Principal elvis = new Principal(0, "Elvis James", 0, 40000);
        FinanceOfficer simon = new FinanceOfficer(1, "Simon Karanja", 0, 50000);


        // Create instances of Teacher class
        Teacher victor = new Teacher(2, "Victor Chinedum", 0, "Devops Java", 200000);
        Teacher kunal = new Teacher(3, "Kunal Kushwaha", 0, "Unknown", 150000);
        Teacher cyril = new Teacher(4, "Cyril Tumbo", 0, "Unknown", 150000);

        // Create a list to store teachers
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(victor);
        teacherList.add(kunal);
        teacherList.add(cyril);

        // Create instances of Student class
        Student mark = new Student(1, "Mark Mwangi", "DevopsJava", "Cohort 15", 0, 100000);
        Student caleb = new Student(2, "Caleb Baraka", "Fullstack Engineer", "Cohort 19", 0, 80000);
        Student jennifer = new Student(3, "Jennifer Karanja", "Cyber Security", "Cohort 15", 0 , 90000);

        // Create a list to store students
        List<Student> studentList = new ArrayList<>();
        studentList.add(mark);
        studentList.add(caleb);
        studentList.add(jennifer);

        // Create instances of courses class
        Course devops = new Course("Devops Java", 1);
        Course fullstack = new Course("Fullstack Engineer", 2);
        Course security = new Course("Cyber Security",   3);

        // Create a list to store courses
        List<Course> coursesList = new ArrayList<>();
        coursesList.add(devops);
        coursesList.add(fullstack);
        coursesList.add(security);

        // Create instances of cohorts class
        Cohort cohort1 = new Cohort("1st Cohort");
        Cohort cohort2 = new Cohort("2nd Cohort");
        Cohort cohort3 = new Cohort("3rd Cohort");
        Cohort cohort4 = new Cohort("4th Cohort");

        // Create a list to store cohorts
        List<Cohort> cohortList = new ArrayList<>();
        cohortList.add(cohort1);
        cohortList.add(cohort2);
        cohortList.add(cohort3);
        cohortList.add(cohort4);

        School markUniversity = new School(teacherList, studentList, coursesList,cohortList);
        System.out.println("Mark University has earned " + markUniversity.getTotalMoneyEarned());
    }
}
