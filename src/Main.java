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
        // Create instances of Teacher class
        Teacher victor = new Teacher(1, "Victor Chinedum", 0, "Devops Java", 200000);
        Teacher kunal = new Teacher(2, "Kunal Kushwaha", 0, "Unknown", 150000);
        Teacher cyril = new Teacher(3, "Cyril Tumbo", 0, "Unknown", 150000);

        // Create a list to store teachers
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(victor);
        teacherList.add(kunal);
        teacherList.add(cyril);

        /** Create a list to store coursesTaught
        List<Course> courseList = new ArrayList<>();
        courseList.add(Devops_java);
         */

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
        Course devops = new Course("Devops Java", 001);
        Course fullstack = new Course("Fullstack Engineer", 002);
        Course security = new Course("Cyber Security", 003);

        // Create a list to store courses
        List<Course> coursesList = new ArrayList<>();
        coursesList.add(devops);
        coursesList.add(fullstack);
        coursesList.add(security);

        School markUniversity = new School(teacherList, studentList, coursesList);
        System.out.println("Mark University has earned " + markUniversity.getTotalMoneyEarned());
    }
}
