package edu.nmu.chorniy.controller;

import edu.nmu.chorniy.model.*;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }
}

