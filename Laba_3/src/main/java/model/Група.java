package model;

import java.util.ArrayList;
import java.util.List;

public class Група {
    private String назва;
    private List<Студент> студенти;

    public Група(String назва) {
        this.назва = назва;
        this.студенти = new ArrayList<>();
    }

    public void додатиСтудента(Студент студент) {
        студенти.add(студент);
    }

    // Додаткові методи та геттери/сеттери
}