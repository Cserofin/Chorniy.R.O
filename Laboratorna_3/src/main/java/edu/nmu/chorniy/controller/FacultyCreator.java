package edu.nmu.chorniy.controller;

import edu.nmu.chorniy.model.Faculty;

public class FacultyCreator {
    public Faculty createFaculty(String name) {
        return new Faculty(name);
    }
}