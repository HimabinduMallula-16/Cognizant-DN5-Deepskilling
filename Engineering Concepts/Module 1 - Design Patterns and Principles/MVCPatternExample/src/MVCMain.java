/**
 * Main class demonstrating the MVC Pattern.
 * Creates a Student, updates its details via StudentController,
 * and displays the result using StudentView.
 */
public class MVCMain {

    public static void main(String[] args) {

        // Create initial Model
        Student student = new Student("Alice Johnson", "S1001", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller wiring Model and View together
        StudentController controller = new StudentController(student, view);

        System.out.println("=== Initial Record ===");
        controller.updateView();

        // Update student details through the controller
        controller.setStudentName("Alice M. Johnson");
        controller.setStudentGrade("A+");

        System.out.println("\n=== After Update ===");
        controller.updateView();
    }
}
