package edu.nmu.chorniy;


import java.util.ArrayList;
import java.util.List;

public class Kafedra {
    private String назва;
    private List<Група> групи;

    public Kafedra(String назва) {
        this.назва = назва;
        this.групи = new ArrayList<>();
    }

    public void додатиГрупу(Група група) {
        групи.add(група);
    }

    // Додаткові методи та геттери/сеттери
}