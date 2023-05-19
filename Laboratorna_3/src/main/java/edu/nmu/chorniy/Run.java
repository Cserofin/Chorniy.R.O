package edu.nmu.chorniy;

import edu.nmu.chorniy.controller.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        // Створюємо університет
        edu.nmu.chorniy.model.University university = new edu.nmu.chorniy.model.University("Мій університет");

        // Створюємо факультети
        FacultyCreator facultyCreator = new FacultyCreator();
        edu.nmu.chorniy.model.Faculty faculty1 = facultyCreator.createFaculty("Факультет 1");
        edu.nmu.chorniy.model.Faculty faculty2 = facultyCreator.createFaculty("Факультет 2");

        // Створюємо кафедри
        DepartmentCreator departmentCreator = new DepartmentCreator();
        edu.nmu.chorniy.model.Department department1 = departmentCreator.createDepartment("Кафедра 1");
        edu.nmu.chorniy.model.Department department2 = departmentCreator.createDepartment("Кафедра 2");

        // Створюємо групи
        GroupCreator groupCreator = new GroupCreator();
        edu.nmu.chorniy.model.Group group1 = groupCreator.createGroup("Група 1");
        edu.nmu.chorniy.model.Group group2 = groupCreator.createGroup("Група 2");

        // Створюємо студентів
        StudentCreator studentCreator = new StudentCreator();
        edu.nmu.chorniy.model.Student student1 = studentCreator.createStudent("Іван", "Петров", "Олександрович", edu.nmu.chorniy.model.Sex.MALE);
        edu.nmu.chorniy.model.Student student2 = studentCreator.createStudent("Марія", "Сидорова", "Андріївна", edu.nmu.chorniy.model.Sex.FEMALE);
        edu.nmu.chorniy.model.Student student3 = studentCreator.createStudent("Олег", "Ковальчук", "Володимирович", edu.nmu.chorniy.model.Sex.MALE);
        edu.nmu.chorniy.model.Student student4 = studentCreator.createStudent("Оксана", "Іванова", "Ігорівна", edu.nmu.chorniy.model.Sex.FEMALE);

        // Додаємо студентів до груп
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);

        // Додаємо групи до кафедр
        department1.addGroup(group1);
        department2.addGroup(group2);

        // Додаємо кафедри до факультетів
        faculty1.addDepartment(department1);
        faculty2.addDepartment(department2);

        // Додаємо факультети до університету
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Виводимо інформацію про створений університет
        System.out.println("Університет: " + university.getName());
        for (edu.nmu.chorniy.model.Faculty faculty : university.getFaculties()) {
            System.out.println("- Факультет: " + faculty.getName());
            for (edu.nmu.chorniy.model.Department department : faculty.getDepartments()) {
                System.out.println(" - Кафедра: " + department.getName());
                for (edu.nmu.chorniy.model.Group group : department.getGroups()) {
                    System.out.println(" - Група: " + group.getName());
                    for (edu.nmu.chorniy.model.Student student : group.getStudents()) {
                        System.out.println(" - Студент: " + student.getName() + " " + student.getSurname());
                    }
                }
            }
        }
    }
}