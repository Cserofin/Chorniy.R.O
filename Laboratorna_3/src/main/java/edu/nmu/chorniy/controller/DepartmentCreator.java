package edu.nmu.chorniy.controller;

import edu.nmu.chorniy.model.*;

public class DepartmentCreator {
    public Department createDepartment(String name) {
        return new Department(name);
    }
}