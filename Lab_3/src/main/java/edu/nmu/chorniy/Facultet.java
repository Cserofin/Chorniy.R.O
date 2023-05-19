package edu.nmu.chorniy;

import java.util.ArrayList;
import java.util.List;

public class Facultet {
    private String назва;
    private List<Кафедра> кафедри;

    public Facultet(String назва) {
        this.назва = назва;
        this.кафедри = new ArrayList<>();
    }

    public void додатиКафедру(Кафедра кафедра) {
        кафедри.add(кафедра);
    }

    // Додаткові методи та геттери/сеттери
}