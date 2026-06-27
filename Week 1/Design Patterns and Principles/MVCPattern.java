//Exercise 10
class Student {
    String name;
    int id;
    String grade;
    Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}
class StudentView {
    void displayStudentDetails(Student s) {
        System.out.println("Name: " + s.name);
        System.out.println("ID: " + s.id);
        System.out.println("Grade: " + s.grade);
    }
}
class StudentController {
    Student model;
    StudentView view;
    StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    void setName(String name) {
        model.name = name;
    }
    void updateView() {
        view.displayStudentDetails(model);
    }
}
public class MVCPattern {
    public static void main(String[] args) {
        Student student = new Student("John", 101, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.setName("David");
        controller.updateView();
    }
}