
import controller.Students_Controller;
import model.students;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<students> students = Students_Controller.findStudentsByMonthAndYear(7, 2003);
        for (students student : students) {
            System.out.println(students);
        }
    }
}
