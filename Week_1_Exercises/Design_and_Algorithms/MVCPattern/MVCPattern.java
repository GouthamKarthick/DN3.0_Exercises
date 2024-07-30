package Week_1_Exercises.Design_and_Algorithms.MVCPattern;

public class MVCPattern {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "123", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Jane Doe");
        controller.setStudentId("456");
        controller.setStudentGrade("B");

        controller.updateView();
    }
}
