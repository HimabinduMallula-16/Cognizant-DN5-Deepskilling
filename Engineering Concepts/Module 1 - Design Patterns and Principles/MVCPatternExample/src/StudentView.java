/**
 * View class for the MVC Pattern.
 * Responsible only for displaying student data; has no knowledge
 * of how the data is stored or modified.
 */
public class StudentView {

    public void displayStudentDetails(String studentName, String studentId, String studentGrade) {
        System.out.println("---- Student Record ----");
        System.out.println("ID    : " + studentId);
        System.out.println("Name  : " + studentName);
        System.out.println("Grade : " + studentGrade);
        System.out.println("-------------------------");
    }
}
