import controller.FacultyCreator;
import controller.GroupCreator;
import controller.StudentCreator;
import model.Університет;
import org.junit.Assert;
import org.junit.Test;
import controller.JsonManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class UniversityTest {
    public static void main(String[] args) {
        UniversityTest test = new UniversityTest();
        test.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        Університет університет = new Університет("NTU Dniprotech");

        FacultyCreator facultyCreator = new FacultyCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Факультет факультет1 = facultyCreator.створитиФакультет("ФІТ");
        Факультет факультет2 = facultyCreator.створитиФакультет("МСІ");

        Група група1 = groupCreator.створитиГрупу("Скороченики");
        Група група2 = groupCreator.створитиГрупу("Денна форма");

        Студент студент1 = studentCreator.створитиСтудента("Віталій", "Бобродуй", "Станіславович", Стать.ЧОЛОВІЧА);
        Студент студент2 = studentCreator.створитиСтудента("Марія", "Зубчак", "Василівна", Стать.ЖІНОЧА);

        studentCreator.призначитиСтудентаДоГрупи(студент1, група1);
        studentCreator.призначитиСтудентаДоГрупи(студент2, група2);

        група1.додатиСтудента(студент1);
        група2.додатиСтудента(студент2);

        Кафедра кафедра1 = new Кафедра("ІПЗ");
        Кафедра кафедра2 = new Кафедра("ВРТ");

        факультет1.додатиКафедру(кафедра1);
        факультет2.додатиКафедру(кафедра2);

        університет.додатиФакультет(факультет1);
        університет.додатиФакультет(факультет2);

        // Запис університету в JSON
        JsonManager jsonManager = new JsonManager();
        jsonManager.записатиУніверситетВФайл(університет, "university.json");

        // Зчитування університету з JSON
        Університет newUniversity = jsonManager.зчитатиУніверситетЗФайлу("university.json");

        // Порівняння oldUniversity та newUniversity за допомогою методу equals
        boolean areEqual = університет.equals(newUniversity);
        System.out.println("Are equal: " + areEqual);
    }
}