import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        // Instantiate objects
        Principal principal = new Principal(1, "Mr Bayani");
        Teacher teacher = new Teacher(2, "Teacher Yvonne");
        Student student = new Student(3, "Mark Masai", new Course("Course Name"), new Classes("Class Name"), true);
        FinanceOfficer financeOfficer = new FinanceOfficer(4, "Mr Dakot");
        Applicant applicant = new Applicant(5, "Applicant Name", 15);

        // Interactive menu
        int choice;
        do {
            System.out.println("\nSchool Management System Menu:");
            System.out.println("1. Receive Salary (Principal)");
            System.out.println("2. Teach Course (Teacher)");
            System.out.println("3. Expel Student (Principal)");
            System.out.println("4. Manage Payments (Finance Officer)");
            System.out.println("5. Admit Applicant (Principal)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    principal.receiveSalary();
                    break;
                case 2:
                    teacher.teachCourse(new Course("Math"));
                    break;
                case 3:
                    principal.expelStudent(student);
                    break;
                case 4:
                    financeOfficer.managePayments();
                    break;
                case 5:
                    principal.admitApplicant(applicant);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
