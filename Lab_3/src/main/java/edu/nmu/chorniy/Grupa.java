package edu.nmu.chorniy;


import java.util.ArrayList;
import java.util.List;

public class Grupa {
    private String назва;
    private List<Студент> студенти;

    public Grupa(String назва) {
        this.назва = назва;
        this.студенти = new ArrayList<>();
    }

    public void додатиСтудента(Студент студент) {
        студенти.add(студент);
    }

    // Додаткові методи та геттери/сеттери
}