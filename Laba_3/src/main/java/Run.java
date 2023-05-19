import controller.FacultyCreator;
import controller.GroupCreator;
import controller.StudentCreator;
import model.Група;
import model.Стать;
import model.Студент;
import model.Університет;
import model.Факультет;
import model.Кафедра;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        Університет університет = new Університет("Моя Університет");

        FacultyCreator facultyCreator = new FacultyCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Факультет факультет1 = facultyCreator.створитиФакультет("Факультет 1");
        Факультет факультет2 = facultyCreator.створитиФакультет("Факультет 2");

        Група група1 = groupCreator.створитиГрупу("Група 1");
        Група група2 = groupCreator.створитиГрупу("Група 2");

        Студент студент1 = studentCreator.створитиСтудента("Ім'я 1", "Прізвище 1", "Побатькові 1", Стать.ЧОЛОВІЧА);
        Студент студент2 = studentCreator.створитиСтудента("Ім'я 2", "Прізвище 2", "Побатькові 2", Стать.ЖІНОЧА);

        studentCreator.призначитиСтудентаДоГрупи(студент1, група1);
        studentCreator.призначитиСтудентаДоГрупи(студент2, група2);

        група1.додатиСтудента(студент1);
        група2.додатиСтудента(студент2);

        Кафедра кафедра1 = new Кафедра("Кафедра 1");
        Кафедра кафедра2 = new Кафедра("Кафедра 2");

        факультет1.додатиКафедру(кафедра1);
        факультет2.додатиКафедру(кафедра2);

        університет.додатиФакультет(факультет1);
        університет.додатиФакультет(факультет2);
        // Додаткові дії з університетом
    }
}