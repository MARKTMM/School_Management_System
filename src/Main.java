import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Victor = new Teacher(1, "Victor Chinedum", 0, "Devops Java", 200000);
        Teacher Kunal = new Teacher(2, "Kunal kushwaha", 0, ,150000);
        Teacher Cyril = new Teacher(3, "Cyril Tumbo", 0, ,150000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Victor);
        teacherList.add(Kunal);
        teacherList.add(Cyril);


        Student Mark = new Student(1, "Mark Mwangi", "Devops Java", "Cohort 15", 0, 100000);
        Student Caleb = new Student(2, "Caleb Baraka", "Fullstack Engineer", "Cohort 19", 0, 80000);
        Student Jeniffer = new Student(3, "Jeniffer Karanja", "Cyber Security", "Cohort 15", 0 , 90000);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Mark);
        studentList.add(Caleb);
        studentList.add(Jeniffer);
    }
}