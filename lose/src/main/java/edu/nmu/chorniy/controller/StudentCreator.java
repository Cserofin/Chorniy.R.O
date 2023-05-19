package edu.nmu.chorniy.controller;

import edu.nmu.chorniy.model.Human;
import edu.nmu.chorniy.model.Sex;
import edu.nmu.chorniy.model.Student;

import java.util.Scanner;

public class StudentCreator extends HumanCreator {
    @Override
    public Student create() {
        Scanner scanner = new Scanner(System.in);
        String name = getString(scanner, NAME);
        String surname = getString(scanner, SURNAME);
        String patronymic = getString(scanner, PATRONYMIC);
        Sex sex = getSex(scanner);

        return new Student(name, surname, patronymic, sex);
    }

    @Override
    public Student create(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }

    @Override
    public Student createRandomly() {
        return new Student("Kyrylo", "Kumchenko", "Volodymyrovych", Sex.MALE);
    }
}