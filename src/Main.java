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
        Teacher kunal = new Teacher(2, "Kunal Kushwaha", 0, "Unknown", 150000); // Corrected name
        Teacher cyril = new Teacher(3, "Cyril Tumbo", 0, "Unknown", 150000); // Corrected name

        // Create a list to store teachers
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(victor);
        teacherList.add(kunal);
        teacherList.add(cyril);

        // Create instances of Student class
        Student mark = new Student(1, "Mark Mwangi", "Devops Java", "Cohort 15", 0, 100000);
        Student caleb = new Student(2, "Caleb Baraka", "Fullstack Engineer", "Cohort 19", 0, 80000);
        Student jennifer = new Student(3, "Jennifer Karanja", "Cyber Security", "Cohort 15", 0 , 90000); // Corrected name

        // Create a list to store students
        List<Student> studentList = new ArrayList<>();
        studentList.add(mark);
        studentList.add(caleb);
        studentList.add(jennifer);
    }
}
