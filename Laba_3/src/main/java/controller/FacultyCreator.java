package controller;

import model.Факультет;

public class FacultyCreator {
    public Факультет створитиФакультет(String назва) {
        return new Факультет(назва);
    }
}